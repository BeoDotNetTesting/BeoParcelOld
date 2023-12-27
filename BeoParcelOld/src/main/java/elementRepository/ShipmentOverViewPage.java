package elementRepository;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GeneralUtilities;
import utilities.WaitUtilities;

public class ShipmentOverViewPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	WaitUtilities wu = new WaitUtilities();

	public ShipmentOverViewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@id='content_gvOrderResponse_lblshipfrom_0']//text()[2]")
	WebElement fromPersonName;
	@FindBy(xpath = "//table[@id='content_gvOrderResponse']//tbody//tr//td[16]//span")
	List<WebElement> shipmentCustomReferenceNumberCell;
	@FindBy(xpath = "//table[@id='content_gvOrderResponse']//tbody//tr//td[5]//span")
	List<WebElement> fromNameTableCell;
	@FindBy(xpath = "//table[@id='content_gvOrderResponse']//tbody//tr//td[5]//span//text()[2]")
	List<WebElement> fromPersonNameList;
	@FindBy(id = "content_gvOrderResponse_btnDuplicateShipment_0")
	WebElement duplicateButton;
	@FindBy(id = "content_gvOrderResponse_btnSavedEdit_0")
	WebElement editFirstShipmentButton;
	@FindBy(xpath = "//table[@id='content_gvOrderResponse']//tbody//tr//td[13]//span")
	List<WebElement> shipmentOverViewStatusColumn;
	@FindBy(id = "content_btnOpenshipments")
	WebElement printShipmentButton;
	@FindBy(xpath = "//table[@id='content_gvOrderResponse']//tbody//tr//td[17]//img[@id='content_gvOrderResponse_btnSavedEdit_0']")
	WebElement firstEditButtonInShipmentOverView;
	@FindBy(id = "content_btnCompletedOrder")
	WebElement savedShipmentButton;
	@FindBy(id = "content_gvOrderResponse_btnSavedDelete_0")
	WebElement savedFirstDeleteButton;
	@FindBy(id = "content_txtSearch")
	WebElement searchFieldInShipment;
	@FindBy(id = "content_btnSearch1")
	WebElement displayButton;
	@FindBy(xpath = "//table[@id='content_gvOrderResponse']//tbody//tr//td[text()='No Data Found']")
	WebElement noDataFoundText;
	@FindBy(id = "content_gvOrderResponse_btnCancel_0")
	WebElement firstCancelPrintedButton;
	@FindBy(id = "content_lblPickupTrack")
	WebElement trackingNumber;
	@FindBy(id = "content_btnTrackClose")
	WebElement trackNumberCloseBackButton;
	@FindBy(id = "content_btnAbholbereit")
	WebElement readyButton;
	@FindBy(xpath = "//table[@id='content_GvFinallist']//tbody//tr[@class='Parc_Grid_RW final']")
	List<WebElement> finalListTable;
	@FindBy(id = "content_GvFinallist_checkAll")
	WebElement finalListCheckAllButton;
	@FindBy(id = "content_imgFinalComplete")
	WebElement finalCompleteButton;
	@FindBy(xpath="//table[@id='content_gvOrderResponse']//tbody//tr[@class='Parc_Grid_RW']")
	List<WebElement> printedTableSize;
	@FindBy(id="content_btnshowList")
	WebElement printButtonOfCmrFreightNumber;
	
	
	public String checkPrintingStatusUsingSenderName(String senderName) {
		String status = null;
		for (int i = 0; i < fromPersonNameList.size(); i++) {
			if (fromPersonNameList.get(i).getText().equals(senderName)) {
				String path = "//table[@id='content_gvOrderResponse']//tbody//tr//td[" + (i + 1) + "]//span//text()";
				WebElement statusElement = driver.findElement(By.xpath(path));
				status = statusElement.getText();
				break;
			}
		}
		return status;
	}

	public String checkPrintingStatusUsingShipmntCustmRfnceNum(String senderName) {
		String status = "";
		for (int i = 0; i < shipmentCustomReferenceNumberCell.size(); i++) {
			if (shipmentCustomReferenceNumberCell.get(i).getText().equals(senderName)) {
				String path = "//table[@id='content_gvOrderResponse']//tbody//tr[" + (i + 2) + "]//td[13]//span";
				WebElement statusElement = driver.findElement(By.xpath(path));
				status = statusElement.getText();
				break;
			}
		}
		return status;
	}
	public void clickOnCMR_UsingShipmntCustmRfnceNum(String senderName) {
		
		for (int i = 0; i < shipmentCustomReferenceNumberCell.size(); i++) {
			if (shipmentCustomReferenceNumberCell.get(i).getText().equals(senderName)) {			
				String pathCMR="//table[@id='content_gvOrderResponse']//tbody//tr["+(i+2)+"]//td[17]//a//img[@id='content_gvOrderResponse_btnCRM_"+i+"']";
				WebElement statusElement = driver.findElement(By.xpath(pathCMR));
				statusElement.click();
				break;
			}
		}
		
	}
	public String checkPrintingStatusUsingShipmntFromName(String senderName) {
		String status = "";
		for (int i = 0; i < fromNameTableCell.size(); i++) {
			if (fromNameTableCell.get(i).getText().equals(senderName)) {
				String path = "//table[@id='content_gvOrderResponse']//tbody//tr[" + (i + 2) + "]//td[13]//span";
				WebElement statusElement = driver.findElement(By.xpath(path));
				status = statusElement.getText();
				break;
			}
		}
		return status;
	}

	public String getShipmentOverViewTableElementText(int rowNum, int columnNum) {

		String path = "//table[@id='content_gvOrderResponse']//tbody//tr[" + rowNum + "]//td[" + columnNum + "]//span";
		WebElement statusElement = driver.findElement(By.xpath(path));
		return statusElement.getText();
	}

	public void clickOnDuplicateButton() {
		duplicateButton.click();
	}

	public void accepAlert() {
		gu.alertAccept(driver);
	}

	public void waitForAlert() {
		wu.fluventWaitAlertIsPresent(driver,100);
	}

	public void clickOnEditFirstShipmentButton() {
		editFirstShipmentButton.click();
	}

	public void clickOnFirstEditButtonInShipmentOverView() {
		firstEditButtonInShipmentOverView.click();
	}

	public void clickOnEditButtonWRTStatus(String status) {
		for (int i = 0; i < shipmentOverViewStatusColumn.size(); i++) {
			if (shipmentOverViewStatusColumn.get(i).getText().equals(status)) {
				String editPath = "//table[@id='content_gvOrderResponse']//tbody//tr//td[17]//img[@id='content_gvOrderResponse_btnSavedEdit_"
						+ (i) + "']";
				WebElement editPathElement = driver.findElement(By.xpath(editPath));
				wu.explicitWaitForWebElement(driver, editPathElement, 10);
				editPathElement.click();
			}
		}
	}

	public void clickOnPrintShipmentButton() {
		printShipmentButton.click();
	}

	public void clickOnSavedShipmentButton() {
		savedShipmentButton.click();
	}

	public void clickOnSavedFirstDeleteButton() {
		savedFirstDeleteButton.click();
	}

	public void sendDataOnSearchField(String data) {
		searchFieldInShipment.sendKeys(data);
	}
	public void sendDataOnSearchFieldWait() {
		wu.fluventWaitElementsvisibilityOf(driver, searchFieldInShipment, 100);
	}
	public void waitForDisplayButton() {
		wu.explicitWaitForWebElement(driver, displayButton, 10);
	}
	public void waitForDisplayButtonFluent() {
		wu.fluventWaitElementsToBeClickable(driver, displayButton, 100);
	}
	public void clickOnDisplayButon() {
		displayButton.click();
	}

	public String getnoDataFoundText() {
		return noDataFoundText.getText();
	}
	public void waitForNoDataFound() {
		wu.fluventWaitElementsTextToBePresent(driver, noDataFoundText, "No Data Found",100);
	}
	public void clickOnFirstCancelPrintedButton() {
		firstCancelPrintedButton.click();
	}

	public void clickOnCheckBoxOfFirstColumn(int limit) {
		for (int i = 0; i < limit; i++) {
			String elementId = "content_gvOrderResponse_chkSelect_" + i;
			WebElement element = driver.findElement(By.id(elementId));
			element.click();
		}
	}

	public void clickOnReadyButton() {
		readyButton.click();
	}

	public void clickOnCheckBoxOfFinalListTableFirstColumn(int i) {
		String elementId = "content_GvFinallist_chkSelect_" + i;
		WebElement element = driver.findElement(By.id(elementId));
		element.click();
	}

	public int getFinalListTableSize() {
		return finalListTable.size();
	}

	public boolean getAttributeStatus(int columnNumber) {
		String elementId = "content_GvFinallist_chkSelect_" + columnNumber;
		WebElement element = driver.findElement(By.id(elementId));
		return gu.checkAttributePresentOrNot(element, "disabled");
	}

	public String getStatusOffinalListTable(int columnNumber) {
		String elementId = "content_GvFinallist_lblCompleted_" + columnNumber;
		WebElement element = driver.findElement(By.id(elementId));
		return element.getText();
	}

	public void clickOnFinalListCheckAllButton() {
		finalListCheckAllButton.click();
	}

	public void clickOnFinalCompleteButton() {
		finalCompleteButton.click();
	}

	public void clickOnInvoicePrintButton(int i) {
		String elementId = "content_gvOrderResponse_btnPrntInvoices_" + i;
		WebElement element = driver.findElement(By.id(elementId));
		element.click();
	}

	public void reportMaker(String details) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(
						System.getProperty("user.dir") + "\\src\\main\\resources\\UploadedFiles\\MyFile.txt"),
				"UTF-8"));
		bufferedWriter.append(details);
		bufferedWriter.close();
	}

	public String getCurrentUrl() {
		return gu.getCurrentUrlOfPage(driver);
	}

	public boolean checkPackageListElementPresentOrNot(int i) {
		gu.pageScroll(10, 1000, driver);
		String elementId = "content_gvOrderResponse_btnPackList_" + i;
		WebElement element = driver.findElement(By.id(elementId));
		return gu.elementIsDisplayed(element);
	}
	public void clickPackageListElementPresented(int i) {
		String elementId = "content_gvOrderResponse_btnPackList_" + i;
		WebElement element = driver.findElement(By.id(elementId));
		element.click();
	}
	public boolean checkCMRFreightLetterElementPresentOrNot(int i) { //09985052798434
		//gu.pageScroll(10, 1000, driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		String elementId = "content_gvOrderResponse_btnCRM_" + i;
		WebElement element = driver.findElement(By.id(elementId));
		return gu.elementIsDisplayed(element);
	}
	public void clickCMRFreightLetterElementPresented(int i) {
		String elementId = "content_gvOrderResponse_btnCRM_" + i;
		WebElement element = driver.findElement(By.id(elementId));
		element.click();
	}
	public int getShipmentOverViewTableSize() {
		return printedTableSize.size();
	}
	public void clickOnPrintButtonOfCmrFreightNumber() {
		printButtonOfCmrFreightNumber.click();
	}
	public String cmrFreightLinkUrl() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String dateGenerate= formatter.format(date);
		String link ="http://11.100.101.23/BEO-Parcel/Pdf/CMRPDF/"+dateGenerate+"_cmr.pdf";
		return link;
	}
	public boolean checkPackageListWordPresentInURL(String subString,String scentence) {
		
		return gu.checkAWordPresentInScentence(subString,scentence);
	}
}
