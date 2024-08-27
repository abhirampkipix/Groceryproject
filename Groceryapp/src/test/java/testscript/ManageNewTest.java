package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import groceryapppackage.LoginForm;
import groceryapppackage.ManageNewsPage;
import utilities.ExcelUpload;

public class ManageNewTest extends Base {
	  @Test(priority=1)
		public void adminLogin() throws IOException {
//			  String userNameField="admin";
//			  String passwordfield="admin";
			  String userNameField=ExcelUpload.getStringData(4, 0, "Sheet1");
			  String passwordfield=ExcelUpload.getStringData(4, 1, "Sheet1");
			 
			  LoginForm login=new LoginForm(driver);
			
			  login.enterUsername(userNameField);
			  login.enterPassword(passwordfield);
			  login.signinclick();
			  
			  
			 // String enterNewscontent="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,";
			  String enterNewscontent=ExcelUpload.getStringData(0, 0, "News");

			  ManageNewsPage moreinfo=new ManageNewsPage(driver);
			  moreinfo.manageNewsinfo();
			  moreinfo.newsnewButtonClick();
			  moreinfo.enterNews(enterNewscontent);
			  moreinfo.newsSaveClick();
			  boolean isnewssaveAlertDisplyed=moreinfo.isnewssaveAlertDisplyed();
			  assertTrue(isnewssaveAlertDisplyed,Constants.SUCCSESSALERTMESSAGE);
  }
	  
	  
		  
	  }

