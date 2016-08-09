package training.selenium.genesis.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import training.selenium.DriverFactory;
import training.selenium.DriverFactory.DriverTypes;
import training.selenium.genesis.pageobjects.HomePage;

public class HomePageTests {
	WebDriver driver;
	
	@BeforeClass
	public void initDriver(){
		driver = DriverFactory.GetDriver(DriverTypes.FIREFOX);
	}
	

	@Test
	public void homePageAvailable(){
		driver.navigate().to("https://www.genesisenergy.co.nz/for-home");
		HomePage homePage = new HomePage(driver);
		String aTitle = homePage.getTitle();
		Assert.assertEquals(aTitle, "Power Suppliers Electricity Gas – Genesis Energy NZ");
	}
	
	
	@AfterClass
	public void close(){
		driver.close();
	}
}
