package training.selenium.genesis.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
	public static String URL = "";
	
	public HomePage(WebDriver driver){
		super(driver, URL);
	}
	
	public WebElement forHomeLink(){
		
		WebElement forHomeLink = driver.findElement(By.xpath("//*[@id=\"gne-header\"]/div/div[2]/div[2]/div[2]/ul/li[1]/a"));
		return forHomeLink;
		
	}

}
