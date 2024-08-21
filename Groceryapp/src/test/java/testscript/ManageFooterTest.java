package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import groceryapppackage.LoginForm;
import groceryapppackage.ManageFooterPage;

public class ManageFooterTest extends Base{
  @Test
  public void manageFooterDetails() {
	  String userNameField="admin";
	  String passwordfield="admin";
	 
	  LoginForm login=new LoginForm(driver);
	
	  login.enterUsername(userNameField);
	  login.enterPassword(passwordfield);
	  login.signinclick();
	  
	  
	  String enterAddress="Pk house ,mundakkal,khmpo,wayanad,673008";
	  String enterEmail="athul@gmail.com";
	  String enterPhone="9072408984";
	  
	  ManageFooterPage footer=new ManageFooterPage(driver);
	  footer.manageFooterMoreInfo();
	  footer.editFooterbuttonClick();
	  footer.clearEditaddresfield();
	  footer.editAddresInput(enterAddress);
	  footer.clearEmail();
	  footer.editEmalInput(enterEmail);
	  footer.clearPhone();
	  footer.edittPhoneInput(enterPhone);
	  footer.updateEditClick();
	  
	  boolean isadminSaveAlertDisplayed=footer.isadminSaveAlertDisplayed();
	  assertTrue(isadminSaveAlertDisplayed,"Alert is displayed");
	  
	  }
}
	  
		  
		  
	  
  
	  
	  
	  
	  
	  
	  
	  
  

