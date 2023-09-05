package testCase;

import org.testng.annotations.Test;

import elementRepository.LogInPage;
import elementRepository.ShipmentOverviewOrCreatPage;


public class LogInPageTest extends BaseClass {
	LogInPage lp;
	ShipmentOverviewOrCreatPage soocp;
  @Test
  public void verifyLogIn() {
	  lp =new LogInPage(driver);
	  lp.login("bincy.paulose@beo.in", "bincy@9847JIBIN");
	  soocp.clickOnSettingButton();
	  soocp.selectUserFromSettingsDrop();
  }
}
