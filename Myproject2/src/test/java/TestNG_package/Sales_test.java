package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Loginpage;
import pageElements.Waiterspage;
import pageElements.Salespage;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Sales_test extends webDriverManager{
	static WebDriver driver;
	Loginpage objlog;
	Salespage objsales;
	 @Test(priority=21,enabled=true)
	  public void Salespagelaunch() throws Exception{
		  driver = webDriverManager.driver;
		  objsales=new Salespage(driver);
	     // objlog.validlogin();
	      objsales.Salespagelaunch();
boolean actualtext=objsales.salestext();
Assert.assertTrue(actualtext);

	  }
	 @Test(priority=22,enabled=true)
	  public void Salessearch() throws Exception{
		 
		 objsales.Salessearch();
		 boolean actualtext=objsales.searchtext();
		 Assert.assertTrue(actualtext);
	  }
	 
//	 @BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  objlog=new Loginpage(driver);
//	  objsales=new Salespage(driver);
//  }
//
// @AfterTest
//  public void afterTest() {
//	  driver.close();
//  }

}
