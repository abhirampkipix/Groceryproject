package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import groceryapppackage.LoginForm;
import groceryapppackage.ManageNewsPage;

public class ManageNewTest extends Base {
	  @Test(priority=1)
		public void adminLogin() {
			  String userNameField="admin";
			  String passwordfield="admin";
			 
			  LoginForm login=new LoginForm(driver);
			
			  login.enterUsername(userNameField);
			  login.enterPassword(passwordfield);
			  login.signinclick();
			  
			  String enterNewscontent="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,";
			  ManageNewsPage moreinfo=new ManageNewsPage(driver);
			  moreinfo.manageNewsinfo();
			  moreinfo.newsnewButtonClick();
			  moreinfo.enterNews(enterNewscontent);
			  moreinfo.newsSaveClick();
			  boolean isnewssaveAlertDisplyed=moreinfo.isnewssaveAlertDisplyed();
			  assertTrue(isnewssaveAlertDisplyed,"Alert is displyed");
  }
	  
	  
		  
	  }

