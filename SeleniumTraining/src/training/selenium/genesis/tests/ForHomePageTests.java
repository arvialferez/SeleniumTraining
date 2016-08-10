package training.selenium.genesis.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import training.selenium.genesis.pageobjects.ForHomePage;
import training.selenium.genesis.pageobjects.HomePage;

public class ForHomePageTests extends BaseTest {

	@Test
	public void forHomePageAvailable(){
		driver.navigate().to("https://www.genesisenergy.co.nz/home");
		
		HomePage homePage = new HomePage(driver);
		homePage.forHomeLink().click();
		
		ForHomePage forHomePage = new ForHomePage(driver);
		Assert.assertEquals(forHomePage.getTitle(), "Power Suppliers Electricity Gas – Genesis Energy NZ");
		
		forHomePage.currentHomeEnergyOffersLink().click();
		
	}

}
