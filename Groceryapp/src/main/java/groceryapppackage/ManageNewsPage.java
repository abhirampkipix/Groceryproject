package groceryapppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
WebDriver driver;
public ManageNewsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@name='username']")WebElement userName;
@FindBy(xpath="//input[@name='password']")WebElement passwordpsd;
@FindBy(xpath="//button[@type='submit']")WebElement signinbutton;

@FindBy(xpath="(//a[@class='small-box-footer'])[9]")WebElement managenewsclick;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newsnewclick;
@FindBy(xpath="(//textarea[@id='news'])[1]")WebElement newsfield;
@FindBy(xpath="//button[@type='submit']")WebElement newssave;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement newssavealert;





public void manageNewsinfo() {
	managenewsclick.click();
}
public void newsnewButtonClick() {
	newsnewclick.click();
}
public void enterNews(String inputnews) {
	newsfield.sendKeys(inputnews);
}
public void newsSaveClick() {
	newssave.click();
}
public boolean isnewssaveAlertDisplyed() {
	return newssavealert.isDisplayed();
}
}