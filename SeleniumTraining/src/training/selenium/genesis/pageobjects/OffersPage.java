package training.selenium.genesis.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OffersPage extends BasePage {
	
	public static String URL = "https://www.genesisenergy.co.nz/offers";
	
	public OffersPage(WebDriver driver){
		super(driver, URL);
	}
	
	public List<WebElement> offers(){		
		WebElement offersSection =  driver.findElement(By.id("article_10154_10180_919955_10.3"));
		
		//List<WebElement> offers = offersSection.findElements(By.cssSelector("gne-col-4 gap-right"));
		//List<WebElement> offers = offersSection.findElements(By.tagName("sub"));
		List<WebElement> offers = offersSection.findElements(By.className("content-device"));
		
		return offers;		
	}
	
	public WebElement electricityOffer(){	
		
		WebElement electricityOffer = offers().get(1);
		
		return electricityOffer;
	}
	
	public WebElement electricityOfferSignupButton(){
		WebElement signUpButton = electricityOffer().findElement(By.xpath(".//button[contains(.,'Sign Up Now')]"));
		return signUpButton;
	}
	
	public WebElement gasOffer(){		
		WebElement gasOffer = offers().get(1);
		
		return gasOffer;
	}
	
	public WebElement gasOfferSignupButton(){
		WebElement signUpButton = gasOffer().findElement(By.xpath(".//button[contains(.,'Sign Up Now')]"));
		return signUpButton;
	}

}
