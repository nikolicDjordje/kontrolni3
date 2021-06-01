package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Constants;
import objects.Functions;

public class CredentialTests {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver () {
        System.setProperty("webdriver.chrome.driver", "C:\\Sellenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void credentialsCheck () {
		File f = new File("data.xlsx");
		try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(0);
			Cell c0 = row.getCell(0);
			Cell c1 = row.getCell(1);
			
			String username = c0.toString();
			String password = c1.toString();
			
			driver.get(Constants.MAIN_URL);
			Functions.inputCredentials(driver, Constants.USER_NAME_XPATH, username, Constants.PASSWORD_XPATH, password, Constants.BUTTON_XPATH);
			
			Assert.assertEquals(driver.getCurrentUrl(), Constants.EXPECTED_URL);
			
			wb.close();
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Test
	public void wrongCredentialsCheck () {
	File f = new File("data.xlsx");
	try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(1);
			Cell c0 = row.getCell(0);
			Cell c1 = row.getCell(1);
			
			String username = c0.toString();
			String password = c1.toString();
			
			driver.get(Constants.MAIN_URL);
			Functions.inputCredentials(driver, Constants.USER_NAME_XPATH, username, Constants.PASSWORD_XPATH, password, Constants.BUTTON_XPATH);
			
			Assert.assertEquals(driver.getCurrentUrl(), Constants.MAIN_URL);
			
			wb.close();
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}