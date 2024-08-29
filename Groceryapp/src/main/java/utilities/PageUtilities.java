package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities {
	WebDriver driver;
public void selectIndex(WebElement elementindex) {
	Select select=new Select(elementindex);
	select.selectByIndex(0);
	
}
public void selectText(WebElement elementtext) {
	Select select=new Select(elementtext);
	select.selectByVisibleText("Admin");
	
}
public void scrollDown() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("Wingow.scrollBy(250,250)");
}
public void scrollup() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("Wingow.scrollTo(0,0)");
}
}