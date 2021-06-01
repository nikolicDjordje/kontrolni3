package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Constants {
	
	public static WebDriver driver;
	
	public static final String MAIN_URL = "https://www.saucedemo.com/";
	public static final String USER_NAME_XPATH = "//*[@id=\"user-name\"]";
	public static final String PASSWORD_XPATH = "//*[@id=\"password\"]";
	public static final String BUTTON_XPATH = "//*[@id=\"login-button\"]";
	public static final String EXPECTED_URL = "https://www.saucedemo.com/inventory.html";
	public static final String CLASS_NAME = "inventory_item_price";
	public static final String BACKPACK_XPATH = "//*[@id=\"item_4_title_link\"]/div";
	public static final String LIGHT_XPATH = "//*[@id=\"item_0_title_link\"]/div";
	public static final String BOLT_T_SHIRT = "//*[@id=\"item_1_title_link\"]/div";
	public static final String FLEECE_JACKET_XPATH = "//*[@id=\"item_5_title_link\"]/div";
	public static final String LABS_ONESIE_XPATH = "//*[@id=\"item_2_title_link\"]/div";
	public static final String T_SHIRT_RED_XPATH = "//*[@id=\"item_3_title_link\"]/div";
	public static final String CHOOSE_BUTTON_XPATH = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select";
	public static final String CHOOSE_MENU_XPATH = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]";
	
}
