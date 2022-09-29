package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Categoriespage;

import pageElements.Loginpage;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Categories_test extends webDriverManager {
	Loginpage objlog;
	Categoriespage objcategory;
  @Test(priority=27,enabled=true)
  public void Categorypagelaunch() throws Exception{
	  driver = webDriverManager.driver;
	  objcategory=new Categoriespage(driver);
	 // objlog.validlogin();
	  objcategory.categorypagelaunch();
	  
	  String expectedtext="Add Category";
	  String actualtext=objcategory.addcategorybuttontext();
	  Assert.assertEquals(actualtext, expectedtext);
	 
  }
  @Test(priority=28,enabled=true)
  public void Addcategorydetails() throws Exception{
	 objcategory.addcategorydetails();
	 boolean actualtext=objcategory.categorynametext();
	   Assert.assertTrue(actualtext);
  }
  @Test(priority=29,enabled=true)
  public void Categorysearch() throws Exception{
	  objcategory.categorysearch();
	  boolean actualtext=objcategory.searchtext();
	   Assert.assertTrue(actualtext);
  }
  
//  @BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  objlog=new Loginpage(driver);
//	  objcategory=new Categoriespage(driver);
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  driver.close();
//  }

}
