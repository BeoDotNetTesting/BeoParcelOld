package testCase;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import elementRepository.ForgotPasswordPage;
import elementRepository.LogInPage;
import elementRepository.HomePage;
import elementRepository.TemporaryEmailPage;
import elementRepository.UserSettingsPage;

public class UserSettingsPageTest extends BaseClass {
	LogInPage lp;
	HomePage hp;
	UserSettingsPage usp;
	TemporaryEmailPage tep;
	ForgotPasswordPage fpp;

	@Test
	public void f() throws InterruptedException {
		lp = new LogInPage(driver);
		usp = new UserSettingsPage(driver);
		hp = new HomePage(driver);
		tep = new TemporaryEmailPage(driver);
		fpp = new ForgotPasswordPage(driver);
		lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
		hp.changeLanguageAsEnglish();
		hp.clickOnSettingButton();
		hp.selectUserFromSettingsDrop();
		usp.clickOnAddNewUserButton();
		((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");
		((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");
		Set<String> windowHandles = driver.getWindowHandles();
		String firstTab = windowHandles.toArray()[0].toString();
		String secondTab = windowHandles.toArray()[1].toString();
		driver.switchTo().window(secondTab);
		driver.get("https://internxt.com/temporary-email");
		for (int i = 0; i < 2; i++) {
			driver.navigate().refresh();
		}
		Thread.sleep(2000);
		String TempEmailId = tep.getTempEmailId();
		driver.switchTo().window(firstTab);
		usp.sendAllCredentialsForNewUserCreation(TempEmailId);
		usp.clickOnUserSaveButton();
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		tep.clickOnMailPopUp();
		Thread.sleep(2000);
		tep.clickOnMailLink();
		fpp.sendNewPassword();
		fpp.sendRePassword();
		fpp.clickOnNewPasswordOkButton();
		String thirdTab = windowHandles.toArray()[2].toString();
		driver.switchTo().window(thirdTab);
		driver.get("http://11.100.101.23/BEO-Parcel/Index.aspx");
		lp.login(TempEmailId, "Tester@123");
	}
}
