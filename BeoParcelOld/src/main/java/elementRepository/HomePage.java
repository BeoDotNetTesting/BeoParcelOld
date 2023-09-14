package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class HomePage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "imgBtnUs")
	WebElement englishLanguage;
	@FindBy(id = "6")
	WebElement settingsButton;
	@FindBy(id = "mnuUsers")
	WebElement userInSettingsDrop;
	@FindBy(id="1")
	WebElement shippingDrop;
	@FindBy(id="mnuShipmentOverview")
	WebElement shipmentOverviewInShippingDrop;
	@FindBy(id="content_lblShipmentOverview")
	WebElement shipmentOverviewHeading;
	@FindBy(id="mnuCreateOrder")
	WebElement createShipmentInShippingDrop;
	
	
	public void changeLanguageAsEnglish() {
		englishLanguage.click();
	}

	public void clickOnSettingButton() {
		settingsButton.click();
	}

	public void selectUserFromSettingsDrop() {
		userInSettingsDrop.click();
	}
	public void clickOnShippingDrop() {
		shippingDrop.click();
		}
	public void clickOnShipmentOverviewInShippingDrop() {
		shipmentOverviewInShippingDrop.click();
	}
	public String getShipmentOverviewHeading() {
		return shipmentOverviewHeading.getText();
	}
	public void clickOnCreateShipmentInShippingDrop() {
		createShipmentInShippingDrop.click();	}
	
}
