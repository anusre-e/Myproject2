package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Categoriespage;
import pageElements.Expensepage;
import pageElements.Loginpage;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Expense_test extends webDriverManager{
	Loginpage objlog;
	Expensepage objexpense;
	  @Test(priority=23,enabled=true)
	  public void Expensepagelaunch() throws Exception{
		  driver = webDriverManager.driver;
			 objexpense=new Expensepage(driver);
		// objlog.validlogin();

		 objexpense.expensepagelaunch();

		 String expectedtext="Add Expence";
		  String actualtext=objexpense.addexpensebuttontext();
		  Assert.assertEquals(actualtext, expectedtext);

	  }
	  @Test(priority=24,enabled=true)
	  public void Addexpensedetails() throws Exception{
		 objexpense.addexpensedetails();
		 boolean actualtext=objexpense.amounttext();
		   Assert.assertTrue(actualtext);
	  }
	  @Test(priority=25,enabled=true)
	  public void Expensedropdown() throws Exception{
		 objexpense.expensedropdown();
		 boolean actualtext=objexpense.storedroptext();
		 Assert.assertTrue(actualtext);
	  }
	  @Test(priority=26,enabled=true)
	  public void Expensesearch() throws Exception{
		 objexpense.expensesearch();
		 boolean actualtext=objexpense.searchtext();
		 Assert.assertTrue(actualtext);
	  }
 
//  @BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  objlog=new Loginpage(driver);
//	  objexpense=new Expensepage(driver);
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  driver.close();
//  }
}
