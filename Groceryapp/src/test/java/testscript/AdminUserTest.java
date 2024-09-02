package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import groceryapppackage.AdminUserPage;
import groceryapppackage.LoginForm;
import utilities.ExcelUpload;

public class AdminUserTest extends Base {
  @Test(priority=1,retryAnalyzer = retry.Retry.class)
	public void adminLogin() throws IOException {
//		  String userNameField="admin";
//		  String passwordfield="admin";
	  String userNameField=ExcelUpload.getStringData(4, 0, "Sheet1");
	  String passwordfield=ExcelUpload.getStringData(4, 1, "Sheet1");
		 
		  LoginForm login=new LoginForm(driver);
		
		  login.enterUsername(userNameField);
		  login.enterPassword(passwordfield);
		  login.signinclick();
		  
//		  String enterUserName="Abhiram3";
//		  String enterAdminPasword="Abhiram@13";
		  String enterUserName=ExcelUpload.getStringData(2, 0, "AddAdmin");
		  String enterAdminPasword=ExcelUpload.getStringData(2, 1, "AddAdmin");
         
		  AdminUserPage adminclick=new AdminUserPage(driver);

		  adminclick.adminuserCardClick();
		  adminclick.adminNewbuttonClick();
		  adminclick.enteradminUsername(enterUserName);
		  adminclick.enteradminPassword(enterAdminPasword);
		  adminclick.selectUserType("Admin");
		  adminclick.userSave();
		  boolean isadminSaveAlertDisplayed=adminclick.isadminSaveAlertDisplayed();
		  assertTrue(isadminSaveAlertDisplayed,Constants.SUCCSESSALERTMESSAGE);
		  
          		  
	}
   @Test(priority=2)
   public void reLogin() throws IOException {
//	      String userNameField="Abhiram3";
//	      String passwordfield="Abhiram@13";
	      String userNameField=ExcelUpload.getStringData(2, 0, "AddAdmin");
		  String passwordfield=ExcelUpload.getStringData(2, 1, "AddAdmin");
	 
	      LoginForm login=new LoginForm(driver);
	      login.enterUsername(userNameField);
	      login.enterPassword(passwordfield);
	      login.signinclick();
}

	}
			