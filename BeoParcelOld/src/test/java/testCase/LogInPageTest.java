package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LogInPage;
import elementRepository.HomePage;


public class LogInPageTest extends BaseClass {
	LogInPage lp;
	HomePage hp;
  @Test
  public void verifyLogIn() throws InterruptedException {
	  lp =new LogInPage(driver);
	  hp=new HomePage(driver);
	  lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
	  hp.changeLanguageAsEnglish();
	  hp.clickOnShippingDrop();	
	  hp.clickOnShipmentOverviewInShippingDrop();	 
	  Assert.assertEquals(hp.getShipmentOverviewHeading(), "Shipment Overview", ":: Shipment overView test not as expected");
	 // soocp.clickOnSettingButton();
	//  soocp.selectUserFromSettingsDrop();
  }
}
