package training.selenium.genesis.tests;

import org.testng.annotations.Test;

import training.selenium.genesis.pageobjects.ForHomePage;
import training.selenium.genesis.pageobjects.HomePage;
import training.selenium.genesis.pageobjects.OffersPage;

public class OffersPageTests extends BaseTest {
	
	@Test
	public void VerifyElectricitySignupButton(){
		driver.navigate().to("https://www.genesisenergy.co.nz/home");
		
		HomePage homePage = new HomePage(driver);
		homePage.forHomeLink().click();
		
		ForHomePage forHomePage = new ForHomePage(driver);		
		forHomePage.currentHomeEnergyOffersLink().click();
		
		OffersPage offersPage = new OffersPage(driver);
		offersPage.electricityOfferSignupButton().click();
		
	}
	
	@Test
	public void VerifyGasSignupButton(){
		driver.navigate().to("https://www.genesisenergy.co.nz/home");
		
		HomePage homePage = new HomePage(driver);
		homePage.forHomeLink().click();
		
		ForHomePage forHomePage = new ForHomePage(driver);		
		forHomePage.currentHomeEnergyOffersLink().click();
		
		OffersPage offersPage = new OffersPage(driver);
		offersPage.gasOfferSignupButton().click();
		
	}
}
