package testscript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import groceryapppackage.LoginForm;
import groceryapppackage.ManageProductsPage;

public class ManageProductTest extends Base {
	@Test(priority=1)
	public void adminLogin() {
		String userNameField="admin";
		  String passwordfield="admin";
		  LoginForm login=new LoginForm(driver);
		  login.enterUsername(userNameField);
		  login.enterPassword(passwordfield);
		  login.signinclick();
		  boolean isDashboardDisplayed=login.isDashboardDisplayed();
	assertTrue(isDashboardDisplayed, "dashboard missing");  
	ManageProductsPage manageproduct=new ManageProductsPage(driver);
	  manageproduct.manageProductClick();
	
	  boolean manageProductPageHeading=manageproduct.manageProductPageHeading();
	  assertTrue(manageProductPageHeading,"Page titleis preseny");
	  manageproduct.productNewClicks();
		
	}
	@Test(priority=2)
	//Entering valid title
	public void titleField() {
        adminLogin();/// re using methoud
		String fieldtitle="Nuts";
		ManageProductsPage titleInputs=new ManageProductsPage(driver);
		titleInputs.enterTitle(fieldtitle);

	}
			
 
  
	 

	  
	  
  }

