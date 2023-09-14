package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class TemporaryEmailPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public TemporaryEmailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id=\"__next\"]//div[3]//section[1]//div//div[2]//div[1]//div[1]//div//p")
	WebElement emailId;
	@FindBy(xpath="//div[@id=\"__next\"]//div[3]//section[1]//div//div[3]//div[1]//div//div[2]//button//div//div[1]//p")
	WebElement mailPopUp;
	@FindBy(xpath="//div[@id=\"__next\"]//div[3]//section[1]//div//div[3]//div[2]//div//div//div[3]//a")
	WebElement mailLink;
	
	public String getTempEmailId() {
		return emailId.getText();
	}
	public void clickOnMailPopUp() {
		mailPopUp.click();
	}
	public void clickOnMailLink() {
		mailLink.click();
	}
}
