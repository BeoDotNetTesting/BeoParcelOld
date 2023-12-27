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
		sovp = new ShipmentOverViewPage(driver);
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
		csop.sendToName2and3Field();
		csop.toSendStreetName("Palarivattom");
		csop.toSelectCountryFromDropDown("India");
		csop.toSendPostalCode("682025:Palarivattom");
		csop.sendPackagePostingOffice("123456");
		csop.sendPackageMeasurements();
		csop.sendArtikelDescription();
		csop.clickOnPrintButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1500);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		Thread.sleep(1500);
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDHLPaketNational_TC51560() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
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
		csop.sendToName2and3Field();
		csop.toSendStreetName("Ensisheimerstr");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("79346:Endingen am Kaiserstuhl");
		csop.sendPackageMeasurements();
		csop.clickOnPrintButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDHLPaketEuropeB2B_TC51561() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
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
		Thread.sleep(1000);
		csop.sendShipmentReferanceNumber();
		Thread.sleep(1000);
		csop.sendDeliveryNoteNumber();
		Thread.sleep(1000);
		csop.toSelectCountryFromDropDown("Belgium");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.sendToName2and3Field();
		csop.toSendStreetName("Wavre");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("1300:Wavre");
		csop.sendPackageMeasurements();
		// String fromName="BEO Software Germany\n"+ csop.sendSendPersonName()+"\n"+
		// "Endingen am Kaiserstuhl\n"+ "Deutschland\n"+ "79346\n"+
		// "bincy.paulose@beo.in";
		csop.clickOnPrintButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		System.out.println(actual);
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDHLPaketNational_TC51395() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
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
		Thread.sleep(1000);
		csop.sendShipmentReferanceNumber();
		Thread.sleep(1000);
		csop.sendDeliveryNoteNumber();
		Thread.sleep(1000);
		csop.toSelectCountryFromDropDown("Germany");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.sendToName2and3Field();
		csop.toSendStreetName("Ensisheimerstr");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("79346:Endingen am Kaiserstuhl");
		csop.sendPackageMeasurements();
		csop.clickOnArtikelAddButton();
		csop.sendArtikelDescriptionByLimit(2);
		// String fromName="BEO Software Germany\n"+ csop.sendSendPersonName()+"\n"+
		// "Endingen am Kaiserstuhl\n"+ "Deutschland\n"+ "79346\n"+
		// "bincy.paulose@beo.in";
		csop.clickOnPrintButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		System.out.println(actual);
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDHLPaketEuropeB2B_TC51396() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
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
		csop.sendToName2and3Field();
		csop.toSendStreetName("Wavre");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("1300:Wavre");
		csop.sendPackageMeasurements();
		csop.sendArtikelDescriptionByLimit(2);
		csop.clickOnPrintButton();
		Thread.sleep(1500);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDHLPaketInternational_TC51397() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
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
		csop.sendToName2and3Field();
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
		Thread.sleep(1500);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		Thread.sleep(1500);
		Thread.sleep(1500);
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDHLPaketNationalWithTwoPackages_TC51550() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
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
		Thread.sleep(1000);
		csop.sendShipmentReferanceNumber();
		Thread.sleep(1000);
		csop.sendDeliveryNoteNumber();
		Thread.sleep(1000);
		csop.toSelectCountryFromDropDown("Germany");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.sendToName2and3Field();
		csop.toSendStreetName("Ensisheimerstr");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("79346:Endingen am Kaiserstuhl");
		csop.sendPackageMeasurements();
		csop.clickOnArtikelAddButton();
		csop.sendArtikelDescriptionByLimit(2);
		csop.clickOnFurtherPackageWithDataTransfer();
		csop.removeAnArticle();

		csop.clickOnPrintButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		System.out.println(actual);
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDHLPaketEuropeB2BWithTwoPackages_TC51551() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
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
		csop.toSelectCountryFromDropDown("Belgium");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.sendToName2and3Field();
		csop.toSendStreetName("Wavre");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("1300:Wavre");
		csop.sendPackageMeasurements();
		csop.sendArtikelDescriptionByLimit(2);
		csop.clickOnFurtherPackageWithDataTransfer();
		csop.removeAnArticle();
		csop.clickOnPrintButton();
		Thread.sleep(1500);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		System.out.println(actual);
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDHLPaketInternationalWithTwoPackages_TC51553() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
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
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.sendToName2and3Field();
		csop.toSendStreetName("Palarivattom");
		csop.toSelectCountryFromDropDown("India");
		csop.toSendPostalCode("682025:Palarivattom");
		Thread.sleep(1000);
		csop.sendPackagePostingOffice("123456");
		csop.sendPackageMeasurements();
		csop.sendArtikelDescriptionByLimit(2);
		csop.clickOnFurtherPackageWithDataTransfer();
		csop.removeAnArticle();
		csop.clickOnPrintButton();
		Thread.sleep(1500);
		Thread.sleep(1000);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		System.out.println(actual);
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDHLExpressNational_TC59107() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnCreateShipmentInShippingDrop();
		csop.selectCarrier("DHL Express");
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
		Thread.sleep(1000);
		csop.sendShipmentReferanceNumber();
		Thread.sleep(1000);
		csop.sendDeliveryNoteNumber();
		Thread.sleep(1000);
		csop.selectCarrierProduct("EXPRESS DOMESTIC");
		csop.toSelectCountryFromDropDown("Germany");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.sendToName2and3Field();
		csop.toSendStreetName("Ensisheimerstr");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("79346:Endingen am Kaiserstuhl");
		csop.sentToPhoneAreaCode("1234");
		csop.sentToPhoneNumber("123456789");
		csop.sentToEmailAddressCode("bincy.paulose@beo.in");
		csop.sendPackageMeasurements();
		csop.clickOnArtikelAddButton();
		csop.sendArtikelDescriptionByLimit(2);
		csop.clickOnFurtherPackageWithDataTransfer();
		csop.clickOnEditPickUpButton();
		csop.sendPickUpAddress();
		csop.selectPickUpCountry("Germany");
		csop.clickOnPrintButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDHLExpressEuropeB2B_TC59140() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnCreateShipmentInShippingDrop();
		csop.selectCarrier("DHL Express");
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
		csop.sendToName2and3Field();
		csop.toSendStreetName("Wavre");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("1300:Wavre");
		csop.sentToPhoneAreaCode("1234");
		csop.sentToPhoneNumber("123456789");
		csop.sentToEmailAddressCode("bincy.paulose@beo.in");
		csop.selectCarrierProduct("EXPRESS WORLDWIDE");
		csop.sendPackageMeasurements();
		csop.sendArtikelDescriptionByLimit(2);
		csop.clickOnFurtherPackageWithDataTransfer();
		csop.clickOnEditPickUpButton();
		csop.sendPickUpAddress();
		csop.selectPickUpCountry("Germany");
		csop.clickOnPrintButton();
		Thread.sleep(1500);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test(groups = "run")
	public void createShipmentForDHLExpressInternational_TC59140() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnCreateShipmentInShippingDrop();
		csop.selectCarrier("DHL Express");
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
		csop.toSelectCountryFromDropDown("India");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.sendToName2and3Field();
		csop.toSendStreetName("Palarivattom");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("682025:Palarivattom");
		csop.sentToPhoneAreaCode("1234");
		csop.sentToPhoneNumber("123456789");
		csop.sentToEmailAddressCode("bincy.paulose@beo.in");
		csop.selectCarrierProduct("EXPRESS WORLDWIDE (N)");
		csop.sendPackageMeasurements();
		csop.sendArtikelDescriptionByLimit(2);
		csop.clickOnFurtherPackageWithDataTransfer();
		csop.clickOnEditPickUpButton();
		csop.sendPickUpAddress();
		csop.selectPickUpCountry("Germany");
		csop.clickOnPrintButton();
		Thread.sleep(1500);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDPDClassicNationalOnePackageTwoStagePacking_TC59160() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnCreateShipmentInShippingDrop();
		csop.selectCarrier("DPD");
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
		Thread.sleep(1000);
		csop.sendShipmentReferanceNumber();
		Thread.sleep(1000);
		csop.sendDeliveryNoteNumber();
		Thread.sleep(1000);
		csop.selectCarrierProduct("DPD Classic");
		csop.toSelectCountryFromDropDown("Germany");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.sendToName2and3Field();
		csop.toSendStreetName("Ensisheimerstr");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("79346:Endingen am Kaiserstuhl");
		csop.sentToPhoneAreaCode("1234");
		csop.sentToPhoneNumber("123456789");
		csop.sentToEmailAddressCode("bincy.paulose@beo.in");
		csop.sendPackageMeasurements();
		csop.clickOnArtikelAddButton();
		csop.sendArtikelDescriptionByLimit(2);
		csop.clickOnFurtherPackageWithDataTransfer();
		csop.clickOnMultiPackingButton(1);
		csop.clickOnTwoStagePacking(1);
		csop.clickOnEditPickUpButton();
		csop.sendPickUpAddress();
		csop.selectPickUpCountry("Germany");
		csop.clickOnPrintButton();
		csop.clickOnPrintButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDPDExpressEuropeB2B_TC59161() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnCreateShipmentInShippingDrop();
		csop.selectCarrier("DPD");
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
		csop.sendToName2and3Field();
		csop.toSendStreetName("Wavre");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("1300:Wavre");
		csop.sentToPhoneAreaCode("1234");
		csop.sentToPhoneNumber("123456789");
		csop.sentToEmailAddressCode("bincy.paulose@beo.in");
		csop.selectCarrierProduct("DPD EXPRESS");
		csop.sendPackageMeasurements();
		csop.sendArtikelDescriptionByLimit(2);
		// csop.clickOnFurtherPackageWithDataTransfer();
		csop.clickOnMultiPackingButton(1);
		csop.clickOnTwoStagePacking(1);
		Thread.sleep(1000);
		csop.clickOnEditPickUpButton();
		csop.sendPickUpAddress();
		csop.selectPickUpCountry("Germany");
		csop.clickOnInvoiceRecipientTab();
		csop.sendInvoceRecipientDetails();
		csop.clickOnPrintButton();
		csop.clickOnPrintButton();
		Thread.sleep(1500);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}

	@Test
	public void createShipmentForDPDInternational_TC59140() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnCreateShipmentInShippingDrop();
		csop.selectCarrier("DPD");
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
		csop.toSelectCountryFromDropDown("India");
		csop.toSendPersonName("Sanoop K M");
		csop.toSendCompanyName("Beo India");
		csop.sendToName2and3Field();
		csop.toSendStreetName("Palarivattom");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("682025:Palarivattom");
		csop.sentToPhoneAreaCode("1234");
		csop.sentToPhoneNumber("123456789");
		csop.sentToEmailAddressCode("bincy.paulose@beo.in");
		csop.selectCarrierProduct("DPD EXPRESS");
		csop.clickOnEditPickUpButton();
		csop.sendPickUpAddress();
		csop.selectPickUpCountry("Germany");
		csop.clickOnInvoiceRecipientTab();
		csop.sendInvoceRecipientDetails();
		csop.sendPackageMeasurements();
		csop.sendArtikelDescriptionByLimit(2);
		csop.clickOnFurtherPackageWithDataTransfer();
		csop.clickOnMultiPackingButton(1);
		csop.clickOnTwoStagePacking(1);
		Thread.sleep(1000);
		csop.clickOnPrintButton();
		csop.clickOnPrintButton();
		Thread.sleep(1500);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}
}
