package training.selenium.skyscanner.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public String getTitle() {

		return driver.getTitle();
	}

	public void setDepart() {
		// TODO Auto-generated method stub
		
	}

	public void setFrom(String from) {
		WebElement element = driver.findElement(By.id("js-origin-input"));
		element.sendKeys(from);	
		List<WebElement> places = driver.findElements(By.xpath("//*[@id=\"js-places\"]/div[1]/span"));
		
		for(WebElement place: places)
		System.out.println(place.getText());
	}

	public void setReturn() {
		// TODO Auto-generated method stub
		
	}

	public void setTo() {
		// TODO Auto-generated method stub
		
	}


}
