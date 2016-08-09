package training.selenium.skyscanner.pageobjects;

import org.openqa.selenium.WebDriver;

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

	public void setFrom() {
		// TODO Auto-generated method stub
		
	}

	public void setReturn() {
		// TODO Auto-generated method stub
		
	}

	public void setTo() {
		// TODO Auto-generated method stub
		
	}


}
