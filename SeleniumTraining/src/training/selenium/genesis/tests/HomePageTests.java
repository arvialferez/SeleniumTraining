package training.selenium.genesis.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import training.selenium.genesis.pageobjects.HomePage;

public class HomePageTests extends BaseTest{

	@Test
	public void homePageAvailable(){
		driver.navigate().to("https://www.genesisenergy.co.nz/home");
		HomePage homePage = new HomePage(driver);
		String aTitle = homePage.getTitle();
		Assert.assertEquals(aTitle, "Power Suppliers Electricity Gas – Genesis Energy NZ");
	}
}
