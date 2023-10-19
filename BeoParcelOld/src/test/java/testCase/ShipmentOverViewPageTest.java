package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

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
		sovp=new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		String carrierName=sovp.getShipmentOverViewTableElementText(2,3);
		String userName=sovp.getShipmentOverViewTableElementText(2,4);
		String fromName=sovp.getShipmentOverViewTableElementText(2,5);
		String weight=sovp.getShipmentOverViewTableElementText(2,6);
		String dimension=sovp.getShipmentOverViewTableElementText(2,7);
		String toName=sovp.getShipmentOverViewTableElementText(2,8);
		sovp.clickOnDuplicateButton();			
		sovp.waitForAlert();
		sovp.accepAlert();		
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,3), carrierName, "carrier Name not as expected");	
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,4), userName, "userName not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,5), fromName, "fromName not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,6), weight, "weight not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,7), dimension, "dimension not as expected");	
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,8), toName, "toName not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,13), "Saved", "carrier Name not as expected");		
		System.out.println(fromName);
		System.out.println("BEO Software Germany\n"+ "Mr.Jimmy Varghese268\n"+ "Endingen am Kaiserstuhl\n"+ "Deutschland\n"+ "79346\n"+ "bincy.paulose@beo.in\n");
	}
	@Test
	public void editSavedShipment_TC57748() {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp=new ShipmentOverViewPage(driver);
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
		String fromName="BEO Software Germany\n"+ csop.sendSendPersonName()+"\n"+ "Endingen am Kaiserstuhl\n"+ "Deutschland\n"+ "79346\n"+ "bincy.paulose@beo.in";
		String weight=csop.getWeight();
		String dimension=csop.getMeasurement();		
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,6), weight, "weight not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,7), dimension, "dimension not as expected");		
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,13), "Saved", "carrier Name not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,14), csop.getDeliveryNoteNumber(), "DeliveryNoteNumber not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,16), csop.getShipmentReferanceNumber(), "ShipmentReferanceNumber not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,5), fromName, "fromName not as expected");
	}
	@Test
	public void editPrintedShipment_TC57778() throws InterruptedException {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp=new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		sovp.clickOnPrintShipmentButton();
		Thread.sleep(1000);Thread.sleep(1000);Thread.sleep(1000);
		//sovp.clickOnEditFirstShipmentButton();
		sovp.clickOnEditButtonWRTStatus("Printed");
		Thread.sleep(1000);Thread.sleep(1000);Thread.sleep(1000);Thread.sleep(1000);
		csop.fromSendPersonName("Mr.Jimmy Varghese");
		csop.sendShipmentReferanceNumber();
		csop.sendDeliveryNoteNumber();		
		csop.sendPackageMeasurementUsingCount();
		csop.clickOnShipmentSaveButton();
		String fromName="BEO Software Germany\n"+ csop.sendSendPersonName()+"\n"+ "Endingen am Kaiserstuhl\n"+ "Deutschland\n"+ "79346\n"+ "bincy.paulose@beo.in";
		String weight=csop.getWeight();
		String dimension=csop.getMeasurement();		
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,6), weight, "weight not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,7), dimension, "dimension not as expected");		
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,13), "Saved", "carrier Name not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,14), csop.getDeliveryNoteNumber(), "DeliveryNoteNumber not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,16), csop.getShipmentReferanceNumber(), "ShipmentReferanceNumber not as expected");
		Assert.assertEquals(sovp.getShipmentOverViewTableElementText(2,5), fromName, "fromName not as expected");
	}
	@Test
	public void deleteSavedShipment_TC57822() throws InterruptedException  {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp=new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		sovp.clickOnSavedShipmentButton();
		Thread.sleep(1000);
		String createdDate=sovp.getShipmentOverViewTableElementText(2, 9);
		Thread.sleep(1000);
		sovp.clickOnSavedFirstDeleteButton();
		Thread.sleep(1000);
		sovp.accepAlert();
		Thread.sleep(1000);Thread.sleep(1000);Thread.sleep(1000);
		sovp.sendDataOnSearchField(createdDate);
		sovp.waitForDisplayButton();
		Thread.sleep(1000);
		sovp.clickOnDisplayButon();
		Assert.assertEquals(sovp.getnoDataFoundText(), "No Data Found", ":: Deletion not as expected");
	}
	@Test//(enabled=false)
	public void cancelPrintedShipment_TC57871() throws InterruptedException  {
		lp = new LogInPage(driver);
		hp = new HomePage(driver);
		csop = new CreatShipmentOrderPage(driver);
		sovp=new ShipmentOverViewPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnShippingDrop();
		hp.clickOnShipmentOverviewInShippingDrop();
		sovp.clickOnPrintShipmentButton();
		String createdDate=sovp.getShipmentOverViewTableElementText(2, 9);
		Thread.sleep(1000);
		sovp.clickOnFirstCancelPrintedButton();
		sovp.accepAlert();
		Thread.sleep(1000);Thread.sleep(1000);Thread.sleep(1000);
		sovp.sendDataOnSearchField(createdDate);
		sovp.waitForDisplayButton();
		Thread.sleep(1000);
		sovp.clickOnDisplayButon();
		Thread.sleep(1000);		
		Assert.assertEquals(sovp.getnoDataFoundText(), "No Data Found", ":: Deletion not as expected");
	}
}
