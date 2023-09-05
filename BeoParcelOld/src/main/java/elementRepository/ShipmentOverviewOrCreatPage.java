package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ShipmentOverviewOrCreatPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public ShipmentOverviewOrCreatPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "imgBtnUs")
	WebElement englishLanguage;
	@FindBy(id = "6")
	WebElement settingsButton;
	@FindBy(id = "mnuUsers")
	WebElement userInSettingsDrop;

	public void changeLanguageAsEnglish() {
		englishLanguage.click();
	}

	public void clickOnSettingButton() {
		settingsButton.click();
	}

	public void selectUserFromSettingsDrop() {
		userInSettingsDrop.click();
	}
}
