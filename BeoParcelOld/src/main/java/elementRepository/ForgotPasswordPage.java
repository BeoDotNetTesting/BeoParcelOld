package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ForgotPasswordPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtNewPwd")
	WebElement newPassword;
	@FindBy(id="txtRetypePwd")
	WebElement reTypePassword;
	@FindBy(id="BtnNewPassword")
	WebElement newPasswordOkButton;
	
	public void sendNewPassword() {
		newPassword.sendKeys("Tester@123");
	}
	public void sendRePassword() {
		reTypePassword.sendKeys("Tester@123");
	}
	public void clickOnNewPasswordOkButton() {
		newPasswordOkButton.click();
	}
}
