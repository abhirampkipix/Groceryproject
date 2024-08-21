package groceryapppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtilities;

public class AdminUserPage {
	WebDriver driver;
	public AdminUserPage(WebDriver driver) {     
		this.driver=driver;
		PageFactory.initElements(driver, this);//defining page factory
	}
	@FindBy(xpath="//input[@name='username']")WebElement userName;
	@FindBy(xpath="//input[@name='password']")WebElement passwordpsd;
	@FindBy(xpath="//button[@type='submit']")WebElement signinbutton;
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]")WebElement adminUserMoreClick;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newButton;
	@FindBy(xpath="(//input[@id='username'])[1]")WebElement adminUsername;
	@FindBy(xpath="(//input[@id='password'])[1]")WebElement adminPassword;
	@FindBy(xpath="(//select[@id='user_type'])[1]")WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")WebElement adminsave;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement adminsavealert;

	
	
	public void enterUsername(String username) {
		userName.sendKeys(username);
		
	}
	public void enterPassword(String password) {
		passwordpsd.sendKeys(password);
	}
	public void signinclick() {
	    signinbutton.click();
	}
	public void adminuserCardClick() {
		adminUserMoreClick.click();
	}
	public void adminNewbuttonClick() {
		newButton.click();
	}
	public void enteradminUsername(String inputusername) {
	    adminUsername.sendKeys(inputusername);
	}
    public void enteradminPassword(String inputpassword) {
		adminPassword.sendKeys(inputpassword);	 
	}
//	public void selectUserType(String userType) {
//		Select dropdown=new Select(usertype);
//		dropdown.selectByVisibleText(userType);
//	}
    public void selectUserType(String userType) {
    	PageUtilities dropselect=new PageUtilities();
    	dropselect.selectText(usertype);
    }
	public void userSave() {
		adminsave.click();
	}
	public boolean isadminSaveAlertDisplayed() {
		return adminsavealert.isDisplayed();
	}
}


