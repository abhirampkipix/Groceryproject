package groceryapppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginForm {
	WebDriver driver;
	public LoginForm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//defining page factory
	}
	@FindBy(xpath="//input[@name='username']")WebElement userName;
	@FindBy(xpath="//input[@name='password']")WebElement passwordpsd;
	@FindBy(xpath="//button[@type='submit']")WebElement signinbutton;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	
	@FindBy(xpath="//p[text()='Manage Product']")WebElement manage_product;
	@FindBy(xpath="//h1[text()='List Products']")WebElement listproduct;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement manageNew;
	
	
	
	
	public void enterUsername(String username) {
		userName.sendKeys(username);
		
	}
	public void enterPassword(String password) {
		passwordpsd.sendKeys(password);
	}
	public void signinclick() {
	
	signinbutton.click();

	}
    public boolean isDashboardDisplayed()	{
	return dashboard.isDisplayed();
    }
    public void manageProductClick() {
	manage_product.click();
    }
    public boolean manageProductPageTitle() {
	return listproduct.isDisplayed();
   }
    public void productNewClick() {
    	manageNew.click();
    }
}

