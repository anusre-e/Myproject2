package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Loginpage;
import pageElements.Customerpage;
import pageElements.Supplierpage;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Suppliers_test extends webDriverManager{
	static WebDriver driver;
	Loginpage objlog;
	Supplierpage objsupp;
  @Test(priority=18,enabled=true)
  public void  Supplierpagelaunch() throws Exception {
	driver = webDriverManager.driver;
		  objsupp=new Supplierpage(driver);
	 // objlog.validlogin();
	  
	  objsupp.addsuppbuttontext();
	  
	  String expectedtext="Add Supplier";
	  String actualtext=objsupp.addstorebuttontext();
	  Assert.assertEquals(actualtext, expectedtext);
	  
  }
  @Test(priority=19,enabled=true)
  public void Supplierspagedetails() throws Exception {
	
	  objsupp.addsuppliers();
	 boolean actual=objsupp.emailtext();
	 Assert.assertTrue(actual);
  }
  @Test(priority=20,enabled=true)
  public void  Suppliersearch() throws Exception {
	
	  objsupp.suppsearch();
	  boolean actual=objsupp.searchtext();
		 Assert.assertTrue(actual);
	  
  }
// @BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  objlog=new Loginpage(driver);
//	  objsupp=new Supplierpage(driver);
//
//  }
//
// @AfterTest
//  public void afterTest() {
//	  driver.close();
//  }
//  

}
