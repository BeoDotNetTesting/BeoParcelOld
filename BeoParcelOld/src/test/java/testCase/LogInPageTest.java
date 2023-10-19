package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LogInPage;
import elementRepository.HomePage;

public class LogInPageTest extends BaseClass {
	LogInPage lp;
	HomePage hp;

	@Test
	public void logIn_TC51394() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		Assert.assertEquals(hp.getShipmentOverviewHeading(), "Shipment Overview",
				":: Shipment overView test not as expected");
	}

	@Test
	public void toAccessBEOParcelWebURL_TC51392() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		Assert.assertEquals(lp.getTitleOfParcelWeb(), "BEO Parcel", ":: Access URL not as expected");
	}

}
