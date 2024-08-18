package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import groceryapppackage.LoginForm;

public class LoginFormTest extends Base {
  @Test(priority=3)
   public void actualusernameandpassword() {
	  String userNameField="admin";
	  String passwordfield="admin";
	  LoginForm login=new LoginForm(driver);
	  login.enterUsername(userNameField);
	  login.enterPassword(passwordfield);
	  login.signinclick();
	  boolean isDashboardDisplayed=login.isDashboardDisplayed();
assertTrue(isDashboardDisplayed, "dashboard missing");  

}
  @Test(priority=1)
  public void inavlidPasswordValidusername() {
	  String userNameField="admin";
	  String passwordfield="ad7897min";
	  LoginForm login=new LoginForm(driver);
	  login.enterUsername(userNameField);
	  login.enterPassword(passwordfield);
	  login.signinclick();
//	  boolean isDashboardDisplayed=login.isDashboardDisplayed();////div[@class='alert alert-danger alert-dismissible']
//assertTrue(isDashboardDisplayed, "dashboard missing");  
//	  
	  	  
  }
  
  @Test(priority=2)
  public void inavlidPasswordInValidusername() {
	  String userNameField="admiuyuyn";
	  String passwordfield="ad7897min";
	  LoginForm login=new LoginForm(driver);
	  login.enterUsername(userNameField);
	  login.enterPassword(passwordfield);
	  login.signinclick();
//	  boolean isDashboardDisplayed=login.isDashboardDisplayed();
//assertTrue(isDashboardDisplayed, "dashboard missing");  
  }
  @Test(priority=2)
  public void usernamePasswordwithSpaces() {
	  String userNameField="adm in";
	  String passwordfield="adm in";
	  LoginForm login=new LoginForm(driver);
	  login.enterUsername(userNameField);
	  login.enterPassword(passwordfield);
	  login.signinclick();
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
