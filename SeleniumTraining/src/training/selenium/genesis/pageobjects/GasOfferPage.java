package training.selenium.genesis.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GasOfferPage extends BasePage{
	
	public static String URL = "https://signup.genesisenergy.co.nz/winter/?offer=gas";
	
	public GasOfferPage(WebDriver driver){
		super(driver, URL);
	}
	
	public WebElement titleField(){
		return driver.findElement(By.id("title"));
	}
	
}
