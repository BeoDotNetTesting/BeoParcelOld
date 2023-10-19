package elementRepository;

import java.util.List;

import org.openqa.selenium.By;
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
	@FindBy(xpath="//table[@id='content_gvOrderResponse']//tbody//tr//td[17]//img[@id='content_gvOrderResponse_btnSavedEdit_0']")
	WebElement firstEditButtonInShipmentOverView;
	@FindBy(id="content_btnCompletedOrder")
	WebElement savedShipmentButton;
	@FindBy(id="content_gvOrderResponse_btnSavedDelete_0")
	WebElement savedFirstDeleteButton;
	@FindBy(id="content_txtSearch")
	WebElement searchFieldInShipment;
	@FindBy(id="content_btnSearch1")
	WebElement displayButton;
	@FindBy(xpath="//table[@id='content_gvOrderResponse']//tbody//tr//td[text()='No Data Found']")
	WebElement noDataFoundText;
	@FindBy(id="content_gvOrderResponse_btnCancel_0")
	WebElement firstCancelPrintedButton;

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
		wu.explicitWaitForWebElementAlert(driver);
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
				String editPath = "//table[@id='content_gvOrderResponse']//tbody//tr//td[17]//img[@id='content_gvOrderResponse_btnSavedEdit_"+(i)+"']";						
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
	public void waitForDisplayButton() {
		wu.explicitWaitForWebElement(driver, displayButton, 10);
	}
	public void clickOnDisplayButon() {
		displayButton.click();
	}
	public String getnoDataFoundText() {
		return noDataFoundText.getText();
	}
	public void clickOnFirstCancelPrintedButton() {
		firstCancelPrintedButton.click();
	}
}
