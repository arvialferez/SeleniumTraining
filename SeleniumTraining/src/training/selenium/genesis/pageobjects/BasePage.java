package training.selenium.genesis.pageobjects;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	
	protected WebDriver driver;
	private String url;
	
	public BasePage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void goDirectlyToPage(){
		driver.navigate().to(url);
	}
}
