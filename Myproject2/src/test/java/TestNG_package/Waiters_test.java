package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Loginpage;
import pageElements.Waiterspage;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Waiters_test extends webDriverManager {
	static WebDriver driver;
	Loginpage objlog;
	Waiterspage objwaiters;
	
  @Test(priority=11,enabled=true)
  public void Waiterspagelaunch() throws Exception{
	  driver = webDriverManager.driver;
	  objwaiters=new Waiterspage(driver);
	//objlog.validlogin();
	objwaiters.waiterspagelaunch();
	String actualtext=objwaiters.addwaiterbuttontext();
	 String expectedtext="Add Waiter";
	 Assert.assertEquals(actualtext, expectedtext);
	 }
  @Test(priority=12,enabled=true)
	  public void Addwaitersdetails() throws Exception {
	  objwaiters.addwaitersdetails();
	  
	boolean actual=objwaiters.phonenumtext();
	Assert.assertTrue(actual);
	  }
  @Test(priority=13,enabled=true)
  public void Waiterspagedropdowndetails() throws Exception {
	  objwaiters.waiterspagedropdowndetails();
	  boolean actual=objwaiters.waiterstoretext();
	  Assert.assertTrue(actual);
  }
  @Test(priority=14,enabled=true)
  public void Waitersearch() throws Exception {
	  objwaiters.waitersearch();
	  boolean actualtext=objwaiters.searchtext();
		
		Assert.assertTrue(actualtext);
  }
  
 
//  @BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  objlog=new Loginpage(driver);
//	  objwaiters=new Waiterspage(driver);
//  }
//
// @AfterTest
//  public void afterTest() {
//	  driver.close();
//		
//  }

}
