package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class LogInPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtUserName")
	WebElement userNameField;
	@FindBy(id = "txtPassword")
	WebElement passwordField;
	@FindBy(id="btnLogin")
	WebElement logInButton;
	
	
	
	public void login(String userName,String password) {
		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		logInButton.click();		
		}
	public String getTitleOfParcelWeb() {
		return driver.getTitle();
	}
	
}
