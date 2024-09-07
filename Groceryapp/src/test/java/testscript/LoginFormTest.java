package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import groceryapppackage.LoginForm;
import utilities.ExcelUpload;

public class LoginFormTest extends Base {
	@DataProvider(name="credentials")
	public Object[][] testData(){				
		Object[][] input = new Object[2][2];
		input[0][0] = "admin";
		input[0][1] = "admin";
		input[1][0] = "admin@123";
		input[1][1] = "admin123";
		return input;
	}	
  @Test(priority=4,dataProvider="credentials",retryAnalyzer = retry.Retry.class,groups=("smoke"))
   public void actualusernameandpassword(String userNameField,String passwordfield) throws IOException {
//	  String userNameField="admin";
//	  String passwordfield="admin";
	  LoginForm login=new LoginForm(driver);
	 // String userNameField=ExcelUpload.getStringData(4, 0, "Sheet1");
	//  String passwordfield=ExcelUpload.getStringData(4, 1, "Sheet1");
	  login.enterUsername(userNameField);
	  login.enterPassword(passwordfield);	
	  login.signinclick();
	  boolean isDashboardDisplayed=login.isDashboardDisplayed();
assertTrue(isDashboardDisplayed,Constants.SUCCSESSALERTMESSAGE); 
  
}
  @Test(priority=1)
  @Parameters({"Username","Password"})
  public void inavlidPasswordValidusername() throws IOException {
//    String userNameField="admin";
//    String passwordfield="ad7897min";
       LoginForm login=new LoginForm(driver);

	String userNameField=ExcelUpload.getStringData(1, 0, "Sheet1");
	 String passwordfield=ExcelUpload.getStringData(1, 1, "Sheet1");

	  login.enterUsername(userNameField);
	  login.enterPassword(passwordfield);
	  login.signinclick();
//	  boolean isDashboardDisplayed=login.isDashboardDisplayed();////div[@class='alert alert-danger alert-dismissible']
//assertTrue(isDashboardDisplayed, "dashboard missing");  
//	  
	  	  
  }
  
  @Test(priority = 2 , dataProvider = "credentials")
  public void inavlidPasswordInValidusername(String userNameField,String passwordfield) throws IOException { 
	  
//	  String userNameField="admiuyuyn";
//	  String passwordfield="ad7897min";
	  LoginForm login=new LoginForm(driver);
	//  String userNameField=ExcelUpload.getStringData(2, 0, "Sheet1");
	//  String passwordfield=ExcelUpload.getStringData(2, 1, "Sheet1");
	  login.enterUsername(userNameField);
	  login.enterPassword(passwordfield);
	  login.signinclick();
//	  boolean isDashboardDisplayed=login.isDashboardDisplayed();
//assertTrue(isDashboardDisplayed, "dashboard missing");  
  }
  @Test(priority=3)
  public void usernamePasswordwithSpaces() throws IOException {
//	  String userNameField="adm in";
//	  String passwordfield="adm in";
	  LoginForm login=new LoginForm(driver);
	  String userNameField=ExcelUpload.getStringData(3, 0, "Sheet1");
	  String passwordfield=ExcelUpload.getStringData(3, 1, "Sheet1");
	  login.enterUsername(userNameField);
	  login.enterPassword(passwordfield);
	  login.signinclick();
  }
//  @Test(priority=2)
//  public void manageProductsSection() throws IOException {
////	  String userNameField="admin";
////	  String passwordfield="admin";
//	  LoginForm mngProduct=new LoginForm(driver);
//	  String userNameField=ExcelUpload.getStringData(1, 0, "Sheet1");
//	  String passwordfield=ExcelUpload.getStringData(1, 1, "Sheet1");
//	  mngProduct.enterUsername(userNameField);
//	  mngProduct.enterPassword(passwordfield);
//	  mngProduct.signinclick();
//
//	  mngProduct.manageProductClick();
//	  boolean manageProductPageTitle=mngProduct.manageProductPageTitle();
//	  assertTrue(manageProductPageTitle, "Page title is present"); 
//	  mngProduct.productNewClick();
//	  
//	  }
}
