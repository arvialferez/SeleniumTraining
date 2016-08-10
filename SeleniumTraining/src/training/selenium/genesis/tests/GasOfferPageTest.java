package training.selenium.genesis.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import training.selenium.genesis.pageobjects.GasOfferPage;

public class GasOfferPageTest extends BaseTest {

	@Test
	public void VerifyTitleRequired(){
		GasOfferPage gasOfferPage = new GasOfferPage(driver);
		gasOfferPage.goDirectlyToPage();
		Assert.assertEquals(gasOfferPage.titleField().getAttribute("data-parsley-error-message"), "Your title is required.");
	}
}
