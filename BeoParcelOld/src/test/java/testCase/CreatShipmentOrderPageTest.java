package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LogInPage;
import elementRepository.ShipmentOverViewPage;
import elementRepository.CreatShipmentOrderPage;
import elementRepository.HomePage;

public class CreatShipmentOrderPageTest extends BaseClass {
	LogInPage lp;
	HomePage hp;
	CreatShipmentOrderPage csop;
	ShipmentOverViewPage sovp;
	

	@Test
	public void createShipmentForDHLPaketInternational_TC51562() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp=new ShipmentOverViewPage(driver);
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
		csop.sendShipmentReferanceNumber();
		csop.sendDeliveryNoteNumber();
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.toSendStreetName("Palarivattom");
		csop.toSelectCountryFromDropDown("India");
		csop.toSendPostalCode("682025:Palarivattom");
		Thread.sleep(1000);
		csop.sendPackagePostingOffice("123456");
		csop.sendPackageMeasurements();
		csop.sendArtikelDescription();		
		csop.clickOnPrintButton();
		Thread.sleep(1500);
		Thread.sleep(1000);
		String actual=sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());		
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDHLPaketNational_TC51560() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp=new ShipmentOverViewPage(driver);
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
		csop.sendShipmentReferanceNumber();
		csop.sendDeliveryNoteNumber();
		csop.toSelectCountryFromDropDown("Germany");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.toSendStreetName("Ensisheimerstr");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("79346:Endingen am Kaiserstuhl");
		csop.sendPackageMeasurements();
		csop.clickOnPrintButton();	
		Thread.sleep(1500);
		Thread.sleep(1000);
		String actual=sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());		
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}
	@Test
	public void createShipmentForDHLPaketEuropeB2B_TC51561() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp=new ShipmentOverViewPage(driver);
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
		csop.sendShipmentReferanceNumber();
		csop.sendDeliveryNoteNumber();
		csop.toSelectCountryFromDropDown("Belgium");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.toSendStreetName("Wavre");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("1300:Wavre");
		csop.sendPackageMeasurements();
		csop.clickOnPrintButton();	
		Thread.sleep(1000);
		Thread.sleep(1500);
		String actual=sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());		
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}
	@Test
	public void createShipmentForDHLPaketNational_TC51395() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp=new ShipmentOverViewPage(driver);
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
		csop.sendShipmentReferanceNumber();
		csop.sendDeliveryNoteNumber();
		csop.toSelectCountryFromDropDown("Germany");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.toSendStreetName("Ensisheimerstr");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("79346:Endingen am Kaiserstuhl");
		csop.sendPackageMeasurements();
		csop.clickOnArtikelAddButton();
		csop.sendArtikelDescriptionByLimit(2);			
		csop.clickOnPrintButton();	
		Thread.sleep(1000);
		Thread.sleep(1500);
		String actual=sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());		
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}	
	@Test
	public void createShipmentForDHLPaketEuropeB2B_TC51396() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp=new ShipmentOverViewPage(driver);
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
		csop.sendShipmentReferanceNumber();
		csop.sendDeliveryNoteNumber();
		csop.toSelectCountryFromDropDown("Belgium");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.toSendStreetName("Wavre");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("1300:Wavre");
		csop.sendPackageMeasurements();
		csop.sendArtikelDescriptionByLimit(2);	
		csop.clickOnPrintButton();	
		Thread.sleep(1500);
		String actual=sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());		
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}
	@Test(groups="Test")//(enabled=false)
	public void createShipmentForDHLPaketInternational_TC51397() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp=new ShipmentOverViewPage(driver);
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
		csop.sendShipmentReferanceNumber();
		csop.sendDeliveryNoteNumber();
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.toSendStreetName("Palarivattom");
		csop.toSelectCountryFromDropDown("India");
		csop.toSendPostalCode("682025:Palarivattom");
		Thread.sleep(1000);
		csop.sendPackagePostingOffice("123456");
		csop.sendPackageMeasurements();
		csop.sendArtikelDescriptionByLimit(2);	
		csop.clickOnPrintButton();
		Thread.sleep(1500);
		Thread.sleep(1000);
		String actual=sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());		
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}
	
}
