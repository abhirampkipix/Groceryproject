package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Base {
	WebDriver driver;
  
  
  
  @BeforeMethod
  @Parameters("Browser")
  public void initialiseMethod(String browser) throws Exception {
	  if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new Exception("invalid browser");
		}
	  //driver=new	ChromeDriver();
	  driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
