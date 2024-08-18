package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import groceryapppackage.AdminUserPage;
import groceryapppackage.LoginForm;

public class AdminUserTest extends Base {
  @Test(priority=1)
	public void adminLogin() {
		  String userNameField="admin";
		  String passwordfield="admin";
		 
		  LoginForm login=new LoginForm(driver);
		
		  login.enterUsername(userNameField);
		  login.enterPassword(passwordfield);
		  login.signinclick();
		  
		  String enterUserName="Abhiram3";
		  String enterAdminPasword="Abhiram@13";
         
		  AdminUserPage adminclick=new AdminUserPage(driver);

		  adminclick.adminuserCardClick();
		  adminclick.adminNewbuttonClick();
		  adminclick.enteradminUsername(enterUserName);
		  adminclick.enteradminPassword(enterAdminPasword);
		  adminclick.selectUserType("Admin");
		  adminclick.userSave();
		  boolean isadminSaveAlertDisplayed=adminclick.isadminSaveAlertDisplayed();
		  assertTrue(isadminSaveAlertDisplayed,"Alert is displayed");
		  
          		  
	}
   @Test(priority=2)
   public void reLogin() {
	      String userNameField="Abhiram3";
	      String passwordfield="Abhiram@13";
	 
	      LoginForm login=new LoginForm(driver);
	      login.enterUsername(userNameField);
	      login.enterPassword(passwordfield);
	      login.signinclick();
}

	}
			