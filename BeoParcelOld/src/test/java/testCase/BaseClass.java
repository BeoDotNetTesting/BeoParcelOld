package testCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import constant.Constant;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExcelUtilities;
import utilities.ScreenShotCapture;

public class BaseClass {
	WebDriver driver;
	ScreenShotCapture sc;
	public static Properties pro;

	public static void testBasic() throws IOException {
		pro = new Properties();
		FileInputStream fp = new FileInputStream(System.getProperty("user.dir") + Constant.propertyFileLocation);
		pro.load(fp);
	}

	public static String logIndata(int usr) throws IOException, InvalidFormatException {
		ArrayList<String> data = ExcelUtilities.readDataFromExcel(Constant.ExcelFileLocation,
				Constant.ExcelLogInSheetName);
		return data.get(usr);
	}

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void beforeMethod(String browserName) throws IOException {
		if (browserName.equals("chrome")) {
			testBasic();
			System.setProperty(pro.getProperty("chromeDriver"),
					System.getProperty("user.dir") + Constant.ChromeDriverFileLocation);

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(cp);
			driver = new ChromeDriver(options);

		} else if (browserName.equals("fireFox")) {
			testBasic();
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(pro.getProperty("BaseURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethode(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			sc = new ScreenShotCapture();
			sc.captureFailureScreenShot(driver, iTestResult.getName());
		}
		driver.quit();
	}
}
