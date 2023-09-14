package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GeneralUtilities;

public class CreatShipmentOrderPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

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
	@FindBy(id="content_txtMobilePhoneF")
	WebElement fromMobileNumberField;
	@FindBy(id="content_txtEmailF")
	WebElement fromEmailIdField;
	@FindBy(id="content_txtnameT")
	WebElement toPersonNameField;
	@FindBy(id="content_txtCompanyT")
	WebElement toCompanyField;
	@FindBy(id="content_txtStreetT")
	WebElement toStreetNameField;
	@FindBy(id="txtZipCodeTCountry")
	WebElement toCountryDrop;
	@FindBy(id="txtZipCodeT")
	WebElement toPostalCodeField;
	@FindBy(id="txtPostigOffice_1")
	WebElement packagePostingOffice;
	
	@FindBy(id="txtArticleArtDesc_1_1")
	WebElement artikelDescription;
	@FindBy(id="txtArticlePiece_1_1")
	WebElement artikelPiece;
	@FindBy(id="txtArticleUnitPrice_1_1")
	WebElement artikelUnitPrice;
	@FindBy(id="txtArticleWgtperArt_1_1")
	WebElement artikelWeight;
	@FindBy(id="txtArticleGoodsNum_1_1")
	WebElement artikelGoodsNumber;
	@FindBy(id="btnorder_R")
	WebElement printButton;
	@FindBy(id="txtWeight_1")
	WebElement packageWeight;
	@FindBy(id="content_btnAddressTrue")
	WebElement addressOkButton;
	@FindBy(id="content_txtNumberT")
	WebElement toHouseNumberField;

	public void selectCarrier(String carrier) {
		carrierDrop.click();
		String path = "//select[@id='ddCarrier']//option[text()='" + carrier + "']";
		WebElement element = driver.findElement(By.xpath(path));
		element.click();
	}

	public void fromSendPersonName(String name) {
		fromPersonNameField.clear();
		fromPersonNameField.sendKeys(name);
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
	public void toSendPersonName(String toPersonName) {
		toPersonNameField.clear();
		toPersonNameField.sendKeys(toPersonName);
	}
	public void toSendCompanyName(String toCompanyName) {
		toCompanyField.clear();
		toCompanyField.sendKeys(toCompanyName);
	}
	public void toSendStreetName(String toStreet) {
		//toStreetNameField.clear();
		toStreetNameField.sendKeys(toStreet);
	}
	public void toSelectCountryFromDropDown(String country) {
		toCountryDrop.click();
		String path = "//select[@id='txtZipCodeTCountry']//option[text()='"+country+"']";
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
	public void sendArtikelDescription() {
		artikelDescription.sendKeys("Wood");
		artikelPiece.sendKeys("2");
		artikelUnitPrice.sendKeys("1");
		artikelWeight.sendKeys("1");
		artikelGoodsNumber.sendKeys("12345678");
	}
	public void clickOnPrintButton() {
		printButton.click();
	}
	public void sendPackageWeight(String weight) {
		packageWeight.clear();
		packageWeight.sendKeys(weight);
	}
	public void clickOkButtonForPrint() {
		addressOkButton.click();
	}
	public void toSendHouseNumber() {
		toHouseNumberField.sendKeys("12");
	}
}
