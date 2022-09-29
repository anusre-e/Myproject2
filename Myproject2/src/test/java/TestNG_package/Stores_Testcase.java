package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Loginpage;
import pageElements.Storespage;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Stores_Testcase extends webDriverManager{
	static WebDriver driver;
	
	Loginpage objlog;
	Storespage objstore;
  @Test(priority=8,enabled=true) 
  public void Storepagelaunch() throws Exception {

//objlog.validlogin();
 driver = webDriverManager.driver;
 objstore=new Storespage(driver);
	  objstore.storepagelaunch();
	  String actual=objstore.addstorebuttontext();
	  String expected="Add Store";
	  Assert.assertEquals(actual,expected);
}

  @Test(priority=9,enabled=true) 
  public void Storepagedetails() throws Exception {
	  
	  objstore.addstoresdetails();
boolean actual=objstore.countrytext();
Assert.assertTrue(actual);
	  }
  @Test(priority=10,enabled=true)
  public void Storepagesearch() throws Exception {
	  
	  objstore.storepagesearch();
boolean actual=objstore.storesearch();
Assert.assertTrue(actual);
	
  }
//  @BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  objlog=new Loginpage(driver);
//	  objstore=new Storespage(driver);
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  driver.close();
//	
//  }

}
