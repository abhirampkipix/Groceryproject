package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import groceryapppackage.LoginForm;

public class LoginFormTest extends Base {
  @Test(priority=1)
   public void usernamenamdpassword() {
	  String userNameField="admin";
	  String passwordfield="admin";
	  LoginForm login=new LoginForm(driver);
	  login.enterUsername(userNameField);
	  login.enterPassword(passwordfield);
	  login.signinclick();
	  boolean isDashboardDisplayed=login.isDashboardDisplayed();
assertTrue(isDashboardDisplayed, "dashboard missing");  

}
  @Test(priority=2)
  public void manageProductsSection() {
	  String userNameField="admin";
	  String passwordfield="admin";
	  LoginForm mngProduct=new LoginForm(driver);
	  mngProduct.enterUsername(userNameField);
	  mngProduct.enterPassword(passwordfield);
	  mngProduct.signinclick();

	  mngProduct.manageProductClick();
	  boolean manageProductPageTitle=mngProduct.manageProductPageTitle();
	  assertTrue(manageProductPageTitle, "Page title is present"); 
	  mngProduct.productNewClick();
	  
	  }
}
