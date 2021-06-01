package objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Functions {
	
	private static WebDriver driver;
	
	public static void inputCredentials (WebDriver driver, String s1, String sa, String s2, String sb, String s3) {
		driver.findElement(By.xpath(s1)).sendKeys(sa);
		driver.findElement(By.xpath(s2)).sendKeys(sb);
		driver.findElement(By.xpath(s3)).click();
	}
	public static void chooseButton (WebDriver driver, String s, String s1) {
		driver.findElement(By.xpath(s)).click();
		driver.findElement(By.xpath(s1)).click();
	}

		/*public static void makingList(WebDriver driver, List<WebElement> productLis, WebElement wa, WebElement wb, WebElement wc, WebElement wd, WebElement we, WebElement wf) {
		List<WebElement> productList = driver.findElements(By.className(Constants.CLASS_NAME));
		WebElement w1 = driver.findElement(By.xpath(Constants.BACKPACK_XPATH));
		WebElement w2 = driver.findElement(By.xpath(Constants.LIGHT_XPATH));
		WebElement w3 = driver.findElement(By.xpath(Constants.BOLT_T_SHIRT));
		WebElement w4 = driver.findElement(By.xpath(Constants.FLEECE_JACKET_XPATH));
		WebElement w5 = driver.findElement(By.xpath(Constants.LABS_ONESIE_XPATH));
		WebElement w6 = driver.findElement(By.xpath(Constants.T_SHIRT_RED_XPATH));
		
		productList.add(w5);
		productList.add(w2);
		productList.add(w3);
		productList.add(w6);
		productList.add(w1);
		productList.add(w4);
	} */
}

