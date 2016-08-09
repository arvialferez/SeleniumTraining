package training.selenium.skyscanner.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import training.selenium.DriverFactory;
import training.selenium.DriverFactory.DriverTypes;
import training.selenium.skyscanner.pageobjects.HomePage;


public class SkyscannerHomeTests {
	
	WebDriver driver;
	
	@BeforeClass
	public void initDriver(){
		driver = DriverFactory.GetDriver(DriverTypes.FIREFOX);
	}
	

	//@Test
	public void homePageAvailable(){
		
		HomePage homePage = new HomePage(driver);
		String aTitle = homePage.getTitle();
		Assert.assertEquals(aTitle, "Cheap flights | Free flight comparison at Skyscanner.co.nz");
	}
	
	@Test
	public void verifySearchResultsHeader(){
		driver.navigate().to("https://www.skyscanner.co.nz/");
		HomePage homePage = new HomePage(driver);
		homePage.setFrom("MNL");
		homePage.setTo();
		homePage.setDepart();
		homePage.setReturn();
		
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
	
}
