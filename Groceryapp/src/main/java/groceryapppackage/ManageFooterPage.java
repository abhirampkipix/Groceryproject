package groceryapppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {
	WebDriver driver;
	public ManageFooterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@name='username']")WebElement userName;
	@FindBy(xpath="//input[@name='password']")WebElement passwordpsd;
	@FindBy(xpath="//button[@type='submit']")WebElement signinbutton;
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[10]")WebElement manage_footer;
	@FindBy(xpath="(//a[@class='btn btn-sm btn btn-primary btncss'])[1]")WebElement editfootercontent;
	@FindBy(xpath="(//textarea[@name='address'])[1]")WebElement editaddress;
	@FindBy(xpath="//input[@name='email']")WebElement editemail;
	@FindBy(xpath="//input[@name='phone']")WebElement editphone;
	@FindBy(xpath="//button[@name='Update']")WebElement updateedit;

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertdisplay;


public void enterUsername(String username) {
	userName.sendKeys(username);
	
}
public void enterPassword(String password) {
	passwordpsd.sendKeys(password);
}
public void signinclick() {
    signinbutton.click();
}
public void manageFooterMoreInfo() {
	manage_footer.click();
}
public void editFooterbuttonClick() {
	editfootercontent.click();
}
public void clearEditaddresfield() {
	editaddress.clear();
}
public void editAddresInput(String inputtext) {
	editaddress.sendKeys(inputtext);

}
public void clearEmail() {
	editemail.clear();
}
public void editEmalInput(String emailinput) {
	editemail.sendKeys(emailinput);
}
public void clearPhone() {
	editphone.clear();
}
public void edittPhoneInput(String num) {
	editphone.sendKeys(num);
}
public void updateEditClick() {
	updateedit.click();
}
public boolean isadminSaveAlertDisplayed() {
	return alertdisplay.isDisplayed();
}
}



