package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtenetReport implements ITestListener {
	ExtentSparkReporter sparkReporter;
	ExtentReports reports;
	ExtentTest test;	

	public void configureReport() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_hhmmss");
		String strDate = formatter.format(date);

		File reportPath = new File(System.getProperty("user.dir") + "//ExtentReport");

		if (!reportPath.exists()) {
			reportPath.mkdir();
		}
		sparkReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "//ExtentReport//" + "BEO-Parcel_" + strDate + ".html");
		reports = new ExtentReports();
		reports.attachReporter(sparkReporter);
		reports.setSystemInfo("Project", "Parcel Web");
		reports.setSystemInfo("PC Name", "Akhil's PC");
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("Test Done By", "Akhil Sathyan");
		sparkReporter.config().setDocumentTitle("BEO-Parcel Report ");
		sparkReporter.config().setReportName("Report Summary");
		sparkReporter.config().setTheme(Theme.STANDARD);
	}

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.PASS,
				MarkupHelper.createLabel("Name of the Passed Test Case is : " + result.getName(), ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.FAIL,
				MarkupHelper.createLabel("Name of the Failed Test Case is : " + result.getName(), ExtentColor.RED));
		if (result.getStatus() == ITestResult.FAILURE) {
			test.fail("Test failed");
			String failureReason = result.getThrowable().getMessage();
			test.log(Status.FAIL, "Failure Reason: " + failureReason);
			test.fail(result.getThrowable());
			 test.addScreenCaptureFromPath( System.getProperty("user.dir") + "\\OutputScreenshots\\" + result.getName() +  ".png");
			}
		//test.addScreenCaptureFromPath(absolutePath);
	}

	public void onTestSkipped(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.SKIP,
				MarkupHelper.createLabel("Name of the skipped test case is : " + result.getName(), ExtentColor.YELLOW));
		if (result.getStatus() == ITestResult.SKIP) {
			test.skip("Test skipped");
			String skipReason = result.getThrowable().getMessage();
			test.log(Status.SKIP, "Skip Reason: " + skipReason);
			test.skip(result.getThrowable());
		}
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.FAIL,
				MarkupHelper.createLabel("Name of the Failed Test Case is : " + result.getName(), ExtentColor.GREY));
	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		configureReport();
		// Delete the testoutput folder before the suite starts
		File testOutputFolder = new File("target/testoutput");
		if (testOutputFolder.exists()) {
			deleteFolder(testOutputFolder);
		}
		File screenshotOutputFolder = new File("C:\\Users\\akhil.sathyan\\git\\BeoParcelOld\\BeoParcelOld\\OutputScreenshots");
		if (screenshotOutputFolder.exists()) {
			deleteFolder(screenshotOutputFolder);
		}
	}

	private void deleteFolder(File folder) {
		File[] files = folder.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					deleteFolder(file); 
				} else {
					file.delete();
				}
			}
		}
		folder.delete();
	}

	public void onFinish(ITestContext context) {		
		reports.flush();
	}
}
