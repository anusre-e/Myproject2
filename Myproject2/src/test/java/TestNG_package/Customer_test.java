package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Loginpage;
import pageElements.Customerpage;
import pageElements.Waiterspage;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Customer_test extends webDriverManager{
	static WebDriver driver;
	Loginpage objlog;
	Customerpage objcustomer;

  @Test(priority=15,enabled=true)
  public void Customerpagelaunch() throws Exception {
	  driver = webDriverManager.driver;
	  objlog=new Loginpage(driver);
	
	  //objlog.validlogin();
	  objcustomer.customerpagelaunch();
	  String expectedtext="Add Customer";
	  String actualtext=objcustomer.addcustomerbuttontext();
	  Assert.assertEquals(actualtext, expectedtext);
	
  }
  @Test(priority=16,enabled=true)
  public void Customerpagedetails() throws Exception {
	
	  objcustomer.customerpagedetails();
	  boolean actualtext=objcustomer.customernametext();
	   Assert.assertTrue(actualtext);

	   
	 
  }
  @Test(priority=17,enabled=true)
  public void Customersearch() throws Exception {
	
	  objcustomer.customersearch();
	  boolean actualtext=objcustomer.searchtext();
	  Assert.assertTrue(actualtext);

  }
//  @BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  objlog=new Loginpage(driver);
//	  objcustomer=new Customerpage(driver);
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  driver.close();
//  }

}
