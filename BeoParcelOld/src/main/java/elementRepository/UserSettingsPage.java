package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class UserSettingsPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public UserSettingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="content_btnNew")
	WebElement addNewUserButton;
	@FindBy(id="content_txtEmail")
	WebElement userEmailIdField;
	@FindBy(id="content_drpTitle")
	WebElement userTitle;
	@FindBy(xpath="//select[@id='content_drpTitle']//option[2]")
	WebElement userTitleMr;
	@FindBy(id="content_txtFname")
	WebElement personName;
	@FindBy(id="drpCompanyName")
	WebElement companyNameDrop;
	@FindBy(xpath="//select[@id='drpCompanyName']//option[text()='Spirit Gmbh']")
	WebElement sprintGmbhCompany;
	@FindBy(id="content_ddlNationality")
	WebElement dropCountry;
	@FindBy(xpath="//select[@id='content_ddlNationality']//option[text()='Deutschland']")
	WebElement countryDeutschland;
	@FindBy(id="content_txtStreet")
	WebElement streetNameField;
	@FindBy(id="content_txtUserZip")
	WebElement zipCodeField;
	@FindBy(id="content_txtNumber")
	WebElement houseNumberField;
	@FindBy(id="content_txtAreaCode")
	WebElement phoneAreaCode;
	@FindBy(id="content_txtTelephone")
	WebElement telephoneNumber;
	@FindBy(id="content_txtMobile")
	WebElement mobileNumberField;
	@FindBy(id="checkboxBranchId_5")
	WebElement branchMainWorkCheck;
	@FindBy(id="content_btnSave")
	WebElement userSaveButton;
	
	public void clickOnAddNewUserButton() {
		addNewUserButton.click();
	}
	
	public void sendAllCredentialsForNewUserCreation(String emailId) throws InterruptedException {
		userEmailIdField.sendKeys(emailId);
		userTitle.click();
		userTitleMr.click();
		personName.clear();
		personName.sendKeys("Bincy"+ gu.randon(1000));
		companyNameDrop.click();
		sprintGmbhCompany.click();
		dropCountry.click();
		countryDeutschland.click();
		streetNameField.clear();
		streetNameField.sendKeys("Düsseldorf");
		Thread.sleep(1000);
		zipCodeField.clear();
		zipCodeField.sendKeys("40212:Düsseldorf");
		houseNumberField.clear();
		houseNumberField.sendKeys(""+gu.randon(1000));
		phoneAreaCode.clear();
		phoneAreaCode.sendKeys("0"+gu.randon(1000));
		telephoneNumber.clear();
		telephoneNumber.sendKeys("654321");
		mobileNumberField.clear();
		mobileNumberField.sendKeys("9876543210");
		branchMainWorkCheck.click();
	}
	public void clickOnUserSaveButton() {
		userSaveButton.click();
	}
}
