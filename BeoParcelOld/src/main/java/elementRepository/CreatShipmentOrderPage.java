package elementRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	@FindBy(id = "content_txtStreetF2")
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

	public void selectCarrier(String carrier) {
		carrierDrop.click();
		String path = "//select[@id='ddCarrier']//option[text()='" + carrier + "']";
		WebElement element = driver.findElement(By.xpath(path));
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
		fromStreetNameField.sendKeys(street);
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
		fromMobileNumberField.sendKeys(fromMobileNumber);
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
		toStreetNameField.sendKeys(toStreet);
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
		packagePostingOffice.sendKeys(postingOffice);
	}

	public void sendArtikelDescription() throws InterruptedException {
		artikelDescription.sendKeys("Wood");
		artikelGoodsNumber.sendKeys("12345678");
		artikelPiece.sendKeys("1");
		artikelUnitPrice.sendKeys("1");
		artikelWeight.sendKeys("1");
		artikelGoodsNumber.sendKeys("12345678");

	}

	public void clickOnPrintButton() {
		printButton.click();
	}

	public void sendPackageMeasurements() {
		packageWeight.clear();
		packageLength.clear();
		packageWidth.clear();
		packageHeight.clear();
		String weight = (gu.randon(2) + 1) + "";
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
			artikelGoodsNumberElement.sendKeys("12345678");
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
		shipmentReferanceNumber.sendKeys(shpmntRefrnceNum);
	}

	public String getShipmentReferanceNumber() {
		return shpmntRefrnceNum;
	}

	public void sendDeliveryNoteNumber() {
		String deliveryNoteNumber = "DELNTNUM" + gu.generateCurrentDateAndTime();
		this.deliveryNoteNumber = deliveryNoteNumber;
		deliveryNoteNumberField.clear();
		deliveryNoteNumberField.sendKeys(deliveryNoteNumber);
	}

	public String getDeliveryNoteNumber() {
		return deliveryNoteNumber;
	}

	public void clickOnShipmentSaveButton() {
		shipmentSaveButton.click();
	}
}
