package testCase;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constant.Constant;
import elementRepository.CreatShipmentOrderPage;
import elementRepository.HomePage;
import elementRepository.LogInPage;
import elementRepository.ShipmentOverViewPage;

public class ShipmentOverViewPageTest extends BaseClass {
	LogInPage lp;
	HomePage hp;
	CreatShipmentOrderPage csop;
	ShipmentOverViewPage sovp;

	@Test
	public void duplicateTheLatestShipment_TC57704() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		String carrierName = sovp.getShipmentOverViewTableElementText(2, 3);
		String userName = sovp.getShipmentOverViewTableElementText(2, 4);
		String fromName = sovp.getShipmentOverViewTableElementText(2, 5);
		String weight = sovp.getShipmentOverViewTableElementText(2, 6);
		String dimension = sovp.getShipmentOverViewTableElementText(2, 7);
		String toName = sovp.getShipmentOverViewTableElementText(2, 8);
		Thread.sleep(1000);
		Thread.sleep(1000);
		sovp.clickOnDuplicateButton();
		Thread.sleep(1000);
		sovp.waitForAlert();
		Thread.sleep(1000);
		sovp.accepAlert();
		Thread.sleep(1000);
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 3), carrierName,
				"carrier Name not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 4), userName, "userName not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 5), fromName, "fromName not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 6), weight, "weight not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 7), dimension, "dimension not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 8), toName, "toName not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 13), "Saved", "carrier Name not as expected");
	}

	@Test(priority = 1)
	public void editSavedShipment_TC57748() {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		sovp.clickOnEditFirstShipmentButton();
		csop.fromSendPersonName("Mr.Jimmy Varghese");
		csop.sendShipmentReferanceNumber();
		csop.sendDeliveryNoteNumber();
		csop.sendPackageMeasurements();
		csop.clickOnShipmentSaveButton();
		String fromName = "BEO Software Germany\n" + csop.sendSendPersonName() + "\n" + "Endingen am Kaiserstuhl\n"
				+ "Deutschland\n" + "79346\n" + "bincy.paulose@beo.in";
		String weight = csop.getWeight();
		String dimension = csop.getMeasurement();
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 6), weight, "weight not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 7), dimension, "dimension not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 13), "Saved", "carrier Name not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 14), csop.getDeliveryNoteNumber(),
				"DeliveryNoteNumber not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 16), csop.getShipmentReferanceNumber(),
				"ShipmentReferanceNumber not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 5), fromName, "fromName not as expected");
	}

	@Test(priority = 2)
	public void editPrintedShipment_TC57778() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		sovp.clickOnPrintShipmentButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		// sovp.clickOnEditFirstShipmentButton();
		sovp.clickOnEditButtonWRTStatus("Printed");
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		csop.fromSendPersonName("Mr.Jimmy Varghese");
		csop.sendShipmentReferanceNumber();
		csop.sendDeliveryNoteNumber();
		csop.sendPackageMeasurementUsingCount();
		csop.clickOnShipmentSaveButton();
		String fromName = "BEO Software Germany\n" + csop.sendSendPersonName() + "\n" + "Endingen am Kaiserstuhl\n"
				+ "Deutschland\n" + "79346\n" + "bincy.paulose@beo.in";
		String weight = csop.getWeight();
		String dimension = csop.getMeasurement();
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 6), weight, "weight not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 7), dimension, "dimension not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 13), "Saved", "carrier Name not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 14), csop.getDeliveryNoteNumber(),
				"DeliveryNoteNumber not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 16), csop.getShipmentReferanceNumber(),
				"ShipmentReferanceNumber not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2, 5), fromName, "fromName not as expected");
	}

	@Test(priority = 3)
	public void deleteSavedShipment_TC57822() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		Thread.sleep(1000);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		Thread.sleep(1000);
		hp.changeLanguageAsEnglish();
		Thread.sleep(1000);
		hp.clickOnShippingDrop();
		Thread.sleep(1000);
		hp.clickOnShipmentOverviewInShippingDrop();
		Thread.sleep(1000);
		sovp.clickOnSavedShipmentButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		String createdDate = sovp.getShipmentOverViewTableElementText(2, 9);
		Thread.sleep(1000);
		sovp.clickOnSavedFirstDeleteButton();
		sovp.waitForAlert();
		Thread.sleep(1000);
		sovp.accepAlert();
		Thread.sleep(1000);
		sovp.sendDataOnSearchFieldWait();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		sovp.sendDataOnSearchField(createdDate);
		sovp.waitForDisplayButtonFluent();
		Thread.sleep(1000);
		sovp.clickOnDisplayButon();
		sovp.waitForNoDataFound();
		Assert.assertEquals(sovp.getnoDataFoundText(), "No Data Found", ":: Deletion not as expected");
	}

	@Test(priority = 4)
	public void cancelPrintedShipment_TC57871() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		sovp.clickOnPrintShipmentButton();
		String createdDate = sovp.getShipmentOverViewTableElementText(2, 9);
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		sovp.clickOnFirstCancelPrintedButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		sovp.accepAlert();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		sovp.sendDataOnSearchField(createdDate);
		Thread.sleep(1000);
		sovp.waitForDisplayButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		sovp.clickOnDisplayButon();
		Thread.sleep(1000);
		Assert.assertEquals(sovp.getnoDataFoundText(), "No Data Found", ":: Deletion not as expected");
	}

	@Test
	public void completeShipmentWithoutPrinting_TC58127()
			throws InterruptedException, InvalidFormatException, IOException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login(logIndata(2), logIndata(5));
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		Thread.sleep(2000);
		sovp.clickOnPrintShipmentButton();
		Thread.sleep(2000);
		Thread.sleep(2000);
		sovp.clickOnCheckBoxOfFirstColumn(1);
		Thread.sleep(2000);
		sovp.clickOnReadyButton();
		Thread.sleep(2000);
		for (int i = 0; i < sovp.getFinalListTableSize(); i++) {
			if (sovp.getAttributeStatus(i) == false) {
				sovp.clickOnCheckBoxOfFinalListTableFirstColumn(i);
				Assert.assertEquals(sovp.getStatusOffinalListTable(i), "Nein",
						Constant.sovp_completeShipmentWithoutPrinting_TC58127_FinalListTableStatus);
			} else if (sovp.getAttributeStatus(i) == true) {
				Assert.assertEquals(sovp.getStatusOffinalListTable(i), "Ja",
						Constant.sovp_completeShipmentWithoutPrinting_TC58127_FinalListTableStatus);
			}
		}
		Thread.sleep(2000);
		sovp.clickOnFinalListCheckAllButton();
		Thread.sleep(2000);
		sovp.clickOnFinalCompleteButton();
		Thread.sleep(2000);
		for (int j = 0; j < sovp.getFinalListTableSize(); j++) {
			Assert.assertEquals(sovp.getStatusOffinalListTable(j), "Ja",
					Constant.sovp_completeShipmentWithoutPrinting_TC58127_FinalListTableStatus);
		}
	}

	@Test(priority = 3)
	public void downloadTheCustomsDeclaration_TC58223()
			throws InterruptedException, InvalidFormatException, IOException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login(logIndata(2), logIndata(5));
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		Thread.sleep(2000);
		sovp.clickOnPrintShipmentButton();
		Thread.sleep(1000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		sovp.clickOnInvoicePrintButton(0);
		Thread.sleep(2000);
		Thread.sleep(2000);
		String originalTab = driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(originalTab)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		Assert.assertEquals(sovp.getCurrentUrl(), Constant.sovp_downloadTheCustomsDeclaration_TC58223_Expected,
				Constant.sovp_downloadTheCustomsDeclaration_TC58223_ErrorMessage);
	}

	@Test(priority = 2)
	public void downloadPackingList_TC58667() throws InterruptedException, InvalidFormatException, IOException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login(logIndata(2), logIndata(5));
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		Thread.sleep(2000);
		sovp.clickOnPrintShipmentButton();
		Thread.sleep(3000);
		for (int i = 0; i < sovp.getShipmentOverViewTableSize(); i++) {
			if (sovp.checkPackageListElementPresentOrNot(i) == true) {				
				sovp.clickPackageListElementPresented(i);				
				Thread.sleep(2000);
				 break;
			}
		}
		String originalTab = driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(originalTab)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}		
		Assert.assertEquals(sovp.checkPackageListWordPresentInURL("packList=PackageType", sovp.getCurrentUrl()), true,
				Constant.sovp_downloadPackingList_TC58667_ErrorMessage);		
	}

	@Test(priority = 1)
	public void createShipmentForCMRFreightLetter_TC58990() throws InterruptedException {
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
		csop.toSendStreetName("Ensisheimerstr");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("79346:Endingen am Kaiserstuhl");
		csop.sendPackageMeasurements();
		csop.clickOnArtikelAddButton();
		csop.sendArtikelDescriptionByLimit(2);
		csop.clickOnPrintButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		System.out.println(actual);
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}
	@Test(priority = 4)
	public void createShipmentForCMRFreightLetter_TC58990_1() throws InterruptedException {
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
		csop.toSendStreetName("Ensisheimerstr");
		csop.toSendHouseNumber();
		csop.toSendPostalCode("79346:Endingen am Kaiserstuhl");
		csop.sendPackageMeasurements();
		csop.clickOnArtikelAddButton();
		csop.sendArtikelDescriptionByLimit(2);
		csop.clickOnPrintButton();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		String actual = sovp.checkPrintingStatusUsingShipmntCustmRfnceNum(csop.getShipmentReferanceNumber());
		System.out.println(actual);
		Assert.assertEquals(actual, "Printed", "Shipment status not as expected");
	}
	@Test(priority = 5)
	public void downloadCMRFreightLetter_TC58668() throws InterruptedException, InvalidFormatException, IOException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login(logIndata(2), logIndata(5));
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		Thread.sleep(2000);
		sovp.clickOnPrintShipmentButton();
		Thread.sleep(3000);
		for (int i = 0; i < sovp.getShipmentOverViewTableSize(); i++) {
			if (sovp.checkCMRFreightLetterElementPresentOrNot(i) == true) {
				System.out.println(sovp.checkCMRFreightLetterElementPresentOrNot(i));
				System.out.println(sovp.checkPackageListElementPresentOrNot(i));
				sovp.clickCMRFreightLetterElementPresented(i);
				System.out.println(i);
				Thread.sleep(2000);
				// break;
			}
		}
		sovp.clickOnPrintButtonOfCmrFreightNumber();
		String expected = sovp.cmrFreightLinkUrl();
		Thread.sleep(2000);
		String originalTab = driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(originalTab)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		String actual = sovp.getCurrentUrl();
		Assert.assertEquals(actual, expected, Constant.sovp_downloadCMRFreightLetter_TC58668_ErrorMessage);
	}

	@Test(priority = 6)
	public void downloadTheCustomsDeclarationTryWithPDF_Write_TC58223()
			throws InterruptedException, InvalidFormatException, IOException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp = new ShipmentOverViewPage(driver);
		lp.login(logIndata(2), logIndata(5));
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		Thread.sleep(2000);
		sovp.clickOnPrintShipmentButton();
		Thread.sleep(1000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		sovp.clickOnInvoicePrintButton(0);
		Thread.sleep(2000);
		Thread.sleep(2000);
		String originalTab = driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(originalTab)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		String expected = Constant.downloadTheCustomsDeclarationTryWithPDF_Write_TC58223_Expected;
		Thread.sleep(2000);		
		String actual = sovp.getCurrentUrl();		
		Assert.assertEquals(actual, expected, Constant.downloadTheCustomsDeclarationTryWithPDF_Write_TC58223_ErrorMessage);		
	}	
}
