package training.selenium.genesis.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import training.selenium.genesis.pageobjects.GasOfferPage;

public class GasOfferPageTest extends BaseTest {

	@Test
	public void VerifyRequiredFieldsMessages(){
		GasOfferPage gasOfferPage = new GasOfferPage(driver);
		gasOfferPage.goDirectlyToPage();
		
		Assert.assertEquals(gasOfferPage.titleField().getAttribute("data-parsley-error-message"), "Your title is required.");
		Assert.assertEquals(gasOfferPage.firstNameField().getAttribute("data-parsley-error-message"), "Your first name is required.");
		Assert.assertEquals(gasOfferPage.lastNameField().getAttribute("data-parsley-error-message"), "Your last name is required.");
		Assert.assertEquals(gasOfferPage.phoneField().getAttribute("data-parsley-required-message"), "Your phone number is required");
		Assert.assertEquals(gasOfferPage.emailField().getAttribute("data-parsley-required-message"), "Your email is required");
	}
	

	
}
