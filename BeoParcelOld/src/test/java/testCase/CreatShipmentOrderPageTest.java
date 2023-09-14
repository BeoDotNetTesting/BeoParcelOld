package testCase;

import org.testng.annotations.Test;

import elementRepository.LogInPage;
import elementRepository.CreatShipmentOrderPage;
import elementRepository.HomePage;

public class CreatShipmentOrderPageTest extends BaseClass {
	LogInPage lp;
	HomePage hp;
	CreatShipmentOrderPage csop;

	@Test(enabled = false)
	public void verifyToCreateShipmentForDHLPaketInternational_TC51562() {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnCreateShipmentInShippingDrop();
		csop.selectCarrier("DHL PAKET");
		csop.fromSendPersonName("Mr.Jimmy Varghese");
		csop.fromSendCompanyName("BEO Software Germany");
		csop.fromSendOnName3Field("PJ Antony Cross road");
		csop.fronSendOnStreetNameField("Berlin");
		csop.fromSendOnhouseNumberField("12345");
		csop.fromSelectCountryFromDropDown("Germany");
		csop.fromSendPostalCode("12043:Berlin");
		csop.fromSendLandPhoneAreaCode("0484");
		csop.fromSendLandPhoneNumber("2445896");
		csop.fromSendMobileNumber("9874561230");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.toSendStreetName("Palarivattom");
		csop.toSelectCountryFromDropDown("India");
		csop.toSendPostalCode("682025:Palarivattom");
		csop.sendPackagePostingOffice("123456");
		csop.sendArtikelDescription();
		csop.clickOnPrintButton();
	}

	@Test
	public void verifyToCreateShipmentForDHLPaket_TC51562() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnCreateShipmentInShippingDrop();
		csop.selectCarrier("DHL PAKET");
		csop.fromSendPersonName("Mr.Jimmy Varghese");
		csop.fromSendCompanyName("BEO Software Germany");
		csop.fromSendOnName3Field("PJ Antony Cross road");
		csop.fronSendOnStreetNameField("Ensisheimerstr");
		csop.fromSendOnhouseNumberField("12345");
		csop.fromSelectCountryFromDropDown("Germany");
		csop.fromSendPostalCode("79346:Endingen am Kaiserstuhl");
		csop.fromSendLandPhoneAreaCode("0484");
		csop.fromSendLandPhoneNumber("2445896");
		csop.fromSendMobileNumber("9874561230");
		csop.toSelectCountryFromDropDown("Germany");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.toSendStreetName("Ensisheimerstr");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("79346:Endingen am Kaiserstuhl");
		csop.sendPackageWeight("1");
		csop.clickOnPrintButton();		
	}
}
