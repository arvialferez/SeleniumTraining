package training.selenium.genesis.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForHomePage extends BasePage {
	
	public static String URL = "";
	
	public ForHomePage(WebDriver driver){
		super(driver, URL);
	}
	
	public WebElement currentHomeEnergyOffersLink(){
		
		List<WebElement> textCtas = driver.findElements(By.className("text-cta"));
		for(WebElement textCta : textCtas){
			if(textCta.getText().equals("Current Home Energy Offers ")){
				return textCta;
			}
		}
		
		return null;
		
	}
	
	
}
