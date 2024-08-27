package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import groceryapppackage.LoginForm;
import groceryapppackage.ManageFooterPage;
import utilities.ExcelUpload;

public class ManageFooterTest extends Base{
  @Test
  public void manageFooterDetails() throws IOException {
//	  String userNameField="admin";
//	  String passwordfield="admin";
	  String userNameField=ExcelUpload.getStringData(4, 0, "Sheet1");
	  String passwordfield=ExcelUpload.getStringData(4, 1, "Sheet1");
	  LoginForm login=new LoginForm(driver);
	
	  login.enterUsername(userNameField);
	  login.enterPassword(passwordfield);
	  login.signinclick();
	  
	  
//	  String enterAddress="Pk house ,mundakkal,khmpo,wayanad,673008";
//	  String enterEmail="athul@gmail.com";
//	  String enterPhone="9072408984";
	  String enterAddress=ExcelUpload.getStringData(1, 0, "ManageFooter");
	  String enterEmail=ExcelUpload.getStringData(1, 1, "ManageFooter");
	  String enterPhone=ExcelUpload.getStringData(1, 2, "ManageFooter");

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
	  assertTrue(isadminSaveAlertDisplayed,Constants.SUCCSESSALERTMESSAGE);
	  
	  }
}
	  
		  
		  
	  
  
	  
	  
	  
	  
	  
	  
	  
  

