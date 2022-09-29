package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Loginpage;
import pageElements.Logoutpage;
import pageElements.Salespage;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Logout_test extends webDriverManager{
	static WebDriver driver;
	//Loginpage objlogin;
	Logoutpage objlogout;
	
  @Test(priority=31,enabled=true,groups= {"Functional"})
  public void Logout() throws Exception {
	  driver = webDriverManager.driver;
	  objlogout=new Logoutpage(driver);
	  //objlogin.validlogin();
	  objlogout.logoutaction();
	  boolean actual=objlogout.backtologinpage();
		Assert.assertTrue(actual);
	 
  }
//  @BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  objlogin=new Loginpage(driver);
//	  objlogout=new Logoutpage(driver);
//  }

 @AfterTest
  public void afterTest() {
	  driver.close();
  }
}
