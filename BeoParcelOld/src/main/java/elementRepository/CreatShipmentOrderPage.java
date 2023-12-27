package elementRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GeneralUtilities;

public class CreatShipmentOrderPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	String senderName, shpmntRefrnceNum, deliveryNoteNumber, length, width, height, weight, toPersonName;

	public CreatShipmentOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ddCarrier")
	WebElement carrierDrop;
	@FindBy(id = "content_txtNameF")
	WebElement fromPersonNameField;
	@FindBy(id = "content_txtCompanyF")
	WebElement fromCompanyNameField;
	@FindBy(id = "content_txtCompanyNameF2") // content_txtStreetF2
	WebElement fromName3Field;
	@FindBy(id = "content_txtStreetF")
	WebElement fromStreetNameField;
	@FindBy(id = "content_txtNumberF")
	WebElement fromHouseNumberField;
	@FindBy(id = "txtZipCodeFCountry")
	WebElement fromCountryDrop;
	@FindBy(id = "txtZipCodeF")
	WebElement fromPostalCodeField;
	@FindBy(id = "content_txtAreaCodeF")
	WebElement fromLandPhoneAreaCode;
	@FindBy(id = "content_txtPhoneF")
	WebElement fromLandPhoneNumberField;
	@FindBy(id = "content_txtMobilePhoneF")
	WebElement fromMobileNumberField;
	@FindBy(id = "content_txtEmailF")
	WebElement fromEmailIdField;
	@FindBy(id = "content_txtnameT")
	WebElement toPersonNameField;
	@FindBy(id = "content_txtCompanyT")
	WebElement toCompanyField;
	@FindBy(id = "content_txtStreetT")
	WebElement toStreetNameField;
	@FindBy(id = "txtZipCodeTCountry")
	WebElement toCountryDrop;
	@FindBy(id = "txtZipCodeT")
	WebElement toPostalCodeField;
	@FindBy(id = "content_txtAreaCodeT")
	WebElement toPhoneAreaCode;
	@FindBy(id = "content_txtPhoneT")
	WebElement toPhoneNumber;
	@FindBy(id = "content_txtEmailT")
	WebElement toEmailAddress;
	@FindBy(id = "content_txtCompanyNameT2")
	WebElement toName2Field;
	@FindBy(id = "content_txtCompanyNameT3")
	WebElement toName3Field;
	@FindBy(id = "txtPostigOffice_1")
	WebElement packagePostingOffice;
	@FindBy(id = "txtArticleArtDesc_1_1")
	WebElement artikelDescription;
	@FindBy(id = "txtArticlePiece_1_1")
	WebElement artikelPiece;
	@FindBy(id = "txtArticleUnitPrice_1_1")
	WebElement artikelUnitPrice;
	@FindBy(id = "txtArticleWgtperArt_1_1")
	WebElement artikelWeight;
	@FindBy(id = "txtArticleGoodsNum_1_1")
	WebElement artikelGoodsNumber;
	@FindBy(id = "btnorder_R")
	WebElement printButton;
	@FindBy(id = "txtWeight_1")
	WebElement packageWeight;
	@FindBy(id = "content_btnAddressTrue")
	WebElement addressOkButton;
	@FindBy(id = "content_txtNumberT")
	WebElement toHouseNumberField;
	@FindBy(id = "txtLength_1")
	WebElement packageLength;
	@FindBy(id = "txtWidth_1")
	WebElement packageWidth;
	@FindBy(id = "txtHeight_1")
	WebElement packageHeight;
	@FindBy(id = "btnArticleHinzufplus_1")
	WebElement addArtikelButton;
	@FindBy(id = "content_txtShipmentRef")
	WebElement shipmentReferanceNumber;
	@FindBy(id = "content_txtDeliveryNoteNumber")
	WebElement deliveryNoteNumberField;
	@FindBy(id = "btnSaveOrder_R")
	WebElement shipmentSaveButton;
	@FindBy(xpath = "//div[@id='divPackages']//div//div//label[@class='content-caption']")
	List<WebElement> noOfPackageList;
	@FindBy(id = "ddlservice")
	WebElement carrierProductName;
	@FindBy(id = "btnControlsWithData_1")
	WebElement furtherPackageAddButton;
	@FindBy(id = "btnArticleRemove_2_2")
	WebElement removeArticle;

	// PickUp

	@FindBy(id = "txtPickZipCodeCountry_1")
	WebElement pickUpCountryDropDown;
	@FindBy(id = "btnEditPickup_1")
	WebElement editPickUpButton;
	@FindBy(id = "txtPickupPersonName_1")
	WebElement pickupPersonNameField;
	@FindBy(id = "txtPickupCompanyName_1")
	WebElement pickUpPersonCompanyField;
	@FindBy(id = "txtPickZipCode_1")
	WebElement pickUpZipCode;
	@FindBy(id = "txtPickupEmail_1")
	WebElement pickUpEmailId;
	@FindBy(id = "txtPickupPhone_1")
	WebElement pickUpPhoneNumber;
	@FindBy(id = "txtPickupMobile_1")
	WebElement pickUpMobileNumber;
	@FindBy(id = "txtPickupHouseNumber_1")
	WebElement pickUpHouseNumber;
	@FindBy(id = "txtPickupCompanyName2_1")
	WebElement pickUpName2;
	@FindBy(id = "txtPickupCompanyName3_1")
	WebElement pickUpName3;
	@FindBy(id = "txtPickupStreetName_1")
	WebElement pickUpStreetName1;
	
	//Invoice Recipient
	@FindBy(id="tabShipToParty")
	WebElement invoiceRecipientTab;
	@FindBy(id="txtCustomerPersonName_1")
	WebElement invoiceRecipientPersonName;	
	@FindBy(id="txtCustomerCompanyName_1")
	WebElement invoiceRecipientCompanyName;	
	@FindBy(id="txtCustomerCompany2_1")
	WebElement invoiceRecipientName2;	
	@FindBy(id="txtCustomerCompany3_1")
	WebElement invoiceRecipientName3;	
	@FindBy(id="txtCustomerStreetName_1")
	WebElement invoiceRecipientStreetName;	
	@FindBy(id="txtCustomerHouseNumber_1")
	WebElement invoiceRecipientHouseNumber;	
	@FindBy(id="txtCustomerZipCodeCountry_1")
	WebElement invoiceRecipientZipCodeCountry;	
	@FindBy(id="txtCustomerZipCode_1")
	WebElement invoiceRecipientZipCode;	
	@FindBy(id="txtCustomerPhone_1")
	WebElement invoiceRecipientPhone;
	@FindBy(id="txtCustomerMobilePhone_1")
	WebElement invoiceRecipientMobilePhone;
	@FindBy(id="txtCustomerEmail_1")
	WebElement invoiceRecipientEmail;
	
	//Invoice Recipient
	public void clickOnInvoiceRecipientTab() {
		invoiceRecipientTab.click();
	}
	public void sendInvoceRecipientDetails() {
		gu.sendValueUsingJavaScriptAndBlur(driver, invoiceRecipientPersonName, "Person Name");
		gu.sendValueUsingJavaScriptAndBlur(driver, invoiceRecipientCompanyName, "Company Name");		
		gu.sendValueUsingJavaScriptAndBlur(driver, invoiceRecipientName2, "Name 2");
		gu.sendValueUsingJavaScriptAndBlur(driver, invoiceRecipientName3, "Name 3");
		gu.sendValueUsingJavaScriptAndBlur(driver, invoiceRecipientStreetName, "Wavre");
		gu.sendValueUsingJavaScriptAndBlur(driver, invoiceRecipientHouseNumber, "4561");		
		gu.selectDropdownWithVisibleText(invoiceRecipientZipCodeCountry, "Belgium");
		gu.sendValueUsingJavaScriptAndBlur(driver, invoiceRecipientZipCode, "10115:Berlin");
		gu.sendValueUsingJavaScriptAndBlur(driver, invoiceRecipientPhone, "2445454");
		gu.sendValueUsingJavaScriptAndBlur(driver, invoiceRecipientMobilePhone, "9874563210");
		gu.sendValueUsingJavaScriptAndBlur(driver, invoiceRecipientEmail, "bincy.paulose@beo.in");
	}
	
	
	// pickUp
	public void selectPickUpCountry(String pickUpCountry) {
		gu.selectDropdownWithVisibleText(pickUpCountryDropDown, pickUpCountry);
	}

	public void scrollUpPage() {
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		int scrollPixels = -5000;
		js.executeScript("window.scrollBy(0, arguments[0])", scrollPixels);*/
		
		Actions a = new Actions(driver);		
		a.moveToElement(editPickUpButton).clickAndHold().moveByOffset(0, -1000000).release().perform();
		
	}

	public void clickOnEditPickUpButton() {		
		editPickUpButton.click();
	}

	public void sendPickUpAddress() {
		gu.sendValueUsingJavaScript(driver, pickupPersonNameField, "Pickup Person");
		gu.blurThePlaceHolder(driver, pickupPersonNameField);
		gu.sendValueUsingJavaScript(driver, pickUpPersonCompanyField, "Pickup Person");
		gu.blurThePlaceHolder(driver, pickUpPersonCompanyField);
		gu.sendValueUsingJavaScript(driver, pickUpZipCode, "10115:Berlin");
		gu.blurThePlaceHolder(driver, pickUpZipCode);
		gu.sendValueUsingJavaScript(driver, pickUpEmailId, "bincy.paulose@beo.in");
		gu.blurThePlaceHolder(driver, pickUpEmailId);
		gu.sendValueUsingJavaScript(driver, pickUpPhoneNumber, "987456");
		gu.blurThePlaceHolder(driver, pickUpPhoneNumber);
		gu.sendValueUsingJavaScript(driver, pickUpMobileNumber, "987456321");
		gu.blurThePlaceHolder(driver, pickUpMobileNumber);
		gu.sendValueUsingJavaScript(driver, pickUpHouseNumber, "112233");
		gu.blurThePlaceHolder(driver, pickUpHouseNumber);
		gu.sendValueUsingJavaScript(driver, pickUpName2, "Name 2");
		gu.blurThePlaceHolder(driver, pickUpName2);
		gu.sendValueUsingJavaScript(driver, pickUpName3, "Name 3");
		gu.blurThePlaceHolder(driver, pickUpName3);
		gu.sendValueUsingJavaScript(driver, pickUpStreetName1, "Berlin");
		gu.blurThePlaceHolder(driver, pickUpStreetName1);
	}

	public void sendToName2and3Field() {
		toName2Field.sendKeys("Name 2");
		toName3Field.sendKeys("Name 3");
	}

	public void selectCarrierProduct(String carrierName) {
		gu.selectDropdownWithVisibleText(carrierProductName, carrierName);
	}

	public void sentToPhoneAreaCode(String phoneAreaCode) {
		gu.sendValueUsingJavaScript(driver, toPhoneAreaCode, phoneAreaCode);
		gu.blurThePlaceHolder(driver, toPhoneAreaCode);
	}

	public void sentToEmailAddressCode(String emailId) {
		gu.sendValueUsingJavaScript(driver, toEmailAddress, emailId);
		gu.blurThePlaceHolder(driver, toEmailAddress);
	}

	public void sentToPhoneNumber(String phoneNumber) {

		gu.sendValueUsingJavaScript(driver, toPhoneNumber, phoneNumber);
		gu.blurThePlaceHolder(driver, toPhoneNumber);
	}

	public void selectCarrier(String carrier) {
		carrierDrop.click();
		String path = "//select[@id='ddCarrier']//option[text()='" + carrier + "']";
		WebElement element = driver.findElement(By.xpath(path));
		element.click();
	}

	public void clcikOnProductNameDrop() {
		carrierProductName.click();
	}

	public void selectProductService(String service) {
		String productPath = "//select[@id='ddlservice']//option[text()='" + service + "']";// DPD EXPRESS
		WebElement element = driver.findElement(By.xpath(productPath));
		element.click();
	}

	public void fromSendPersonName(String name) {
		String senderName = name + gu.randon(1000);
		this.senderName = senderName;
		fromPersonNameField.clear();
		fromPersonNameField.sendKeys(senderName);
	}

	public String sendSendPersonName() {
		return senderName;
	}

	public void fromSendCompanyName(String companyName) {
		fromCompanyNameField.clear();
		fromCompanyNameField.sendKeys(companyName);
	}

	public void fromSendOnName3Field(String name3) {
		fromName3Field.clear();
		fromName3Field.sendKeys(name3);
	}

	public void fronSendOnStreetNameField(String street) {
		fromStreetNameField.clear();
		// fromStreetNameField.sendKeys(street);
		gu.sendValueUsingJavaScript(driver, fromStreetNameField, street);
		gu.blurThePlaceHolder(driver, fromStreetNameField);
	}

	public void fromSendOnhouseNumberField(String houseNumber) {
		fromHouseNumberField.clear();
		fromHouseNumberField.sendKeys(houseNumber);
	}

	public void fromSelectCountryFromDropDown(String country) {
		fromCountryDrop.click();
		String path = "//select[@id='txtZipCodeFCountry']//option[text()='" + country + "']";
		WebElement element = driver.findElement(By.xpath(path));
		element.click();
	}

	public void fromSendPostalCode(String postalCode) {
		fromPostalCodeField.clear();
		fromPostalCodeField.sendKeys(postalCode);
	}

	public void fromSendLandPhoneAreaCode(String landAreaCode) {
		fromLandPhoneAreaCode.clear();
		fromLandPhoneAreaCode.sendKeys(landAreaCode);
	}

	public void fromSendLandPhoneNumber(String landPhoneNumber) {
		fromLandPhoneNumberField.clear();
		fromLandPhoneNumberField.sendKeys(landPhoneNumber);
	}

	public void fromSendMobileNumber(String fromMobileNumber) {
		fromMobileNumberField.clear();
		// fromMobileNumberField.sendKeys(fromMobileNumber);
		gu.sendValueUsingJavaScript(driver, fromMobileNumberField, fromMobileNumber);
		gu.blurThePlaceHolder(driver, fromMobileNumberField);
	}

	public void fromSendEmailId(String email) {
		fromEmailIdField.clear();
		fromEmailIdField.sendKeys(email);
	}

	public void toSendPersonName(String name) {
		String toPersonName = name + gu.randon(1000);
		this.toPersonName = toPersonName;
		toPersonNameField.clear();
		toPersonNameField.sendKeys(toPersonName);
	}

	public void toSendCompanyName(String toCompanyName) {
		toCompanyField.clear();
		toCompanyField.sendKeys(toCompanyName);
	}

	public void toSendStreetName(String toStreet) {
		// toStreetNameField.clear();
		// toStreetNameField.sendKeys(toStreet);
		gu.sendValueUsingJavaScript(driver, toStreetNameField, toStreet);
		gu.blurThePlaceHolder(driver, toStreetNameField);
	}

	public void toSelectCountryFromDropDown(String country) {
		toCountryDrop.click();
		String path = "//select[@id='txtZipCodeTCountry']//option[text()='" + country + "']";
		WebElement element = driver.findElement(By.xpath(path));
		element.click();
	}

	public void toSendPostalCode(String postalCode) {
		toPostalCodeField.clear();
		toPostalCodeField.sendKeys(postalCode);
	}

	public void sendPackagePostingOffice(String postingOffice) {
		// packagePostingOffice.sendKeys(postingOffice);
		gu.sendValueUsingJavaScript(driver, packagePostingOffice, postingOffice);
		gu.blurThePlaceHolder(driver, packagePostingOffice);
	}

	public void sendArtikelDescription() throws InterruptedException {
		artikelDescription.sendKeys("Wood");
		artikelGoodsNumber.sendKeys("12345678");
		artikelPiece.sendKeys("1");
		artikelUnitPrice.sendKeys("1");
		artikelWeight.sendKeys("1");
		// artikelGoodsNumber.sendKeys("12345678");
		gu.sendValueUsingJavaScript(driver, artikelGoodsNumber, "12345678");
		gu.blurThePlaceHolder(driver, artikelGoodsNumber);

	}

	public void clickOnPrintButton() {
		printButton.click();
	}

	public void sendPackageMeasurements() {
		packageWeight.clear();
		packageLength.clear();
		packageWidth.clear();
		packageHeight.clear();
		// String weight = (gu.randon(4) + 1) + "";
		String weight = "6";
		String length = (gu.randon(4) + 1) + "";
		String width = (gu.randon(4) + 1) + "";
		String height = (gu.randon(4) + 1) + "";
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.height = height;
		packageWeight.sendKeys(weight);
		packageLength.sendKeys(length);
		packageWidth.sendKeys(width);
		packageHeight.sendKeys(height);
	}

	public void sendPackageMeasurementUsingCount() {
		for (int i = 0; i < noOfPackageList.size(); i++) {
			String weight = (gu.randon(2) + 1) + "";
			String length = (gu.randon(4) + 1) + "";
			String width = (gu.randon(4) + 1) + "";
			String height = (gu.randon(4) + 1) + "";
			this.weight = weight;
			this.length = length;
			this.width = width;
			this.height = height;
			String weightPath = "//input[@id='txtWeight_" + (i + 1) + "']";
			String lengthPath = "//input[@id='txtLength_" + (i + 1) + "']";
			String widthPath = "//input[@id='txtWidth_" + (i + 1) + "']";
			String heightPath = "//input[@id='txtHeight_" + (i + 1) + "']";
			WebElement weightPathElement = driver.findElement(By.xpath(weightPath));
			WebElement lengthPathElement = driver.findElement(By.xpath(lengthPath));
			WebElement widthPathElement = driver.findElement(By.xpath(widthPath));
			WebElement heightPathElement = driver.findElement(By.xpath(heightPath));
			weightPathElement.clear();
			lengthPathElement.clear();
			widthPathElement.clear();
			heightPathElement.clear();
			weightPathElement.sendKeys(weight);
			lengthPathElement.sendKeys(length);
			widthPathElement.sendKeys(width);
			heightPathElement.sendKeys(height);
		}
	}

	public String getMeasurement() {
		return length + " * " + width + " * " + height;
	}

	public String getWeight() {
		return weight;
	}

	public void clickOkButtonForPrint() {
		addressOkButton.click();
	}

	public void toSendHouseNumber() {
		toHouseNumberField.sendKeys("12");
	}

	public void clickOnArtikelAddButton() {
		addArtikelButton.click();
	}

	public void sendArtikelDescriptionByLimit(int i) {

		for (int count = 0; count < i; count++) {
			String artikelDescriptionPath = "//input[@id='txtArticleArtDesc_1_" + (count + 1) + "']";
			WebElement artikelDescriptionElement = driver.findElement(By.xpath(artikelDescriptionPath));
			artikelDescriptionElement.sendKeys("Wood");

			String artikelPiecePath = "//input[@id='txtArticlePiece_1_" + (count + 1) + "']";
			WebElement artikelPieceElement = driver.findElement(By.xpath(artikelPiecePath));
			artikelPieceElement.sendKeys("1");
			String artikelGoodsNumberPath = "//input[@id='txtArticleGoodsNum_1_" + (count + 1) + "']";
			WebElement artikelGoodsNumberElement = driver.findElement(By.xpath(artikelGoodsNumberPath));
			gu.sendValueUsingJavaScriptAndBlur(driver, artikelGoodsNumberElement, "12345678");
			//artikelGoodsNumberElement.sendKeys("12345678");
			String artikelUnitPricePath = "//input[@id='txtArticleUnitPrice_1_" + (count + 1) + "']";
			WebElement artikelUnitPriceElement = driver.findElement(By.xpath(artikelUnitPricePath));
			artikelUnitPriceElement.sendKeys("1");
			String artikelWeightPath = "//input[@id='txtArticleWgtperArt_1_" + (count + 1) + "']";
			WebElement artikelWeightElement = driver.findElement(By.xpath(artikelWeightPath));
			artikelWeightElement.sendKeys("1");
			String artikelAddRowPath = "//button[@id='btnArticleNew_1_" + (count + 1) + "']";
			WebElement artikelAddRowElement = driver.findElement(By.xpath(artikelAddRowPath));
			artikelAddRowElement.click();
		}
	}

	public void sendShipmentReferanceNumber() {
		String shpmntRefrnceNum = "SHPMNTRFNUM" + gu.generateCurrentDateAndTime();
		this.shpmntRefrnceNum = shpmntRefrnceNum;
		shipmentReferanceNumber.clear();
		// shipmentReferanceNumber.sendKeys(shpmntRefrnceNum);

		gu.sendValueUsingJavaScript(driver, shipmentReferanceNumber, shpmntRefrnceNum);
		gu.blurThePlaceHolder(driver, shipmentReferanceNumber);
	}

	public String getShipmentReferanceNumber() {
		return shpmntRefrnceNum;
	}

	public void sendDeliveryNoteNumber() {
		String deliveryNoteNumber = "DELNTNUM" + gu.generateCurrentDateAndTime();
		this.deliveryNoteNumber = deliveryNoteNumber;
		deliveryNoteNumberField.clear();
		// deliveryNoteNumberField.sendKeys(deliveryNoteNumber);
		gu.sendValueUsingJavaScript(driver, deliveryNoteNumberField, deliveryNoteNumber);
		gu.blurThePlaceHolder(driver, deliveryNoteNumberField);
	}

	public void clickOnFurtherPackageWithDataTransfer() {
		furtherPackageAddButton.click();
	}

	public void removeAnArticle() {
		removeArticle.click();
	}

	public String getDeliveryNoteNumber() {
		return deliveryNoteNumber;
	}

	public void clickOnShipmentSaveButton() {
		shipmentSaveButton.click();
	}

	public void clickOnMultiPackingButton(int i) {
		String elementPathId = "btnMultiplePacking_" + (i) + "";
		WebElement element = driver.findElement(By.id(elementPathId));
		element.click();
	}

	public void clickOnTwoStagePacking(int i) {
		String pathId = "liMultiplePack_" + i;
		WebElement element = driver.findElement(By.id(pathId));
		element.click();
	}
}
