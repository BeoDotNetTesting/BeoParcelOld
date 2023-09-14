package testCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Capabilities;
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
import utilities.ScreenShotCapture;

public class BaseClass {
	WebDriver driver;
	ScreenShotCapture sc;
	public static Properties pro;

	public static void testBasic() throws IOException {
		pro = new Properties();
		FileInputStream fp = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\Properties\\config.properties");
		pro.load(fp);
	}

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void beforeMethod(String browserName) throws IOException {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\Driver\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(cp);
			driver = new ChromeDriver(options);

		} else if (browserName.equals("fireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://11.100.101.23/BEO-Parcel/Index.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			sc = new ScreenShotCapture();
			sc.captureFailureScreenShot(driver, iTestResult.getName());
		}
		driver.close();
	}
}
