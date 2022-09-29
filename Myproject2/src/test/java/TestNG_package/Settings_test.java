package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Loginpage;
import pageElements.Salespage;
import pageElements.Settingspage;
import utilities.webDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Settings_test extends webDriverManager {
	static WebDriver driver;
	Loginpage objlog;
	Settingspage objsettings;
	@Test(priority=30,enabled=true)
	  public void Settings() throws Exception{
		driver = webDriverManager.driver;
		objsettings=new Settingspage(driver);
		//objlog.validlogin();
        objsettings.Setting();
		  boolean actual=objsettings.settingsubmit();
		  Assert.assertTrue(actual);
		 
	  }

//	
//	 @BeforeTest
//	  public void beforeTest() {
//		  launchBrowser("chrome","https://qalegend.com/restaurant/");
//		  driver = webDriverManager.driver;
//		  objlog=new Loginpage(driver);
//		  objsettings=new Settingspage(driver);
//	  }
//
//	  @AfterTest
//	  public void afterTest() {
//		  driver.close();
//	  }
}
