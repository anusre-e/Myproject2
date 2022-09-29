package TestNG_package;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.testng.annotations.AfterTest;

public class extentreport1 {
	ExtentReports extent = new ExtentReports();
	  ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");

  @Test
  public void invalidlogin() {
	  ExtentTest test=extent.createTest("Failed Login");
		 test.log(Status.FAIL, "Login Failed");
		 test.fail("User cannot login");
  }
  @Test
  public void validlogin() {
	  ExtentTest test=extent.createTest("User logined").assignAuthor("anu");
		 test.log(Status.PASS, "User logined to the application");
		 test.pass("User logined sucessfully");
  }
  @Test
  public void addpdt1() {
	  ExtentTest test=extent.createTest("Verify Addproduct page is displayed");
		 test.pass( "Addpdt page displayed successfully");
	
  }
  @Test
  public void addpdt2() {
	  ExtentTest test=extent.createTest("Verify that user can provide data using send keys");
		 test.pass( "User is able to add the data using send keys");
	
  }
  @Test
  public void addpdt3() {
	  ExtentTest test=extent.createTest("Verify that user can provide data using dropdown button");
		 test.pass( "User is able to add the data using dropdown button");
	
  }
  @Test
  public void addpdt4() {
	  ExtentTest test=extent.createTest("Verify Stock page is displayed");
		 test.pass( "Stock page is displayed successfully");
	
  }
  @Test
  public void searchpdt() {
	  ExtentTest test=extent.createTest("Verify the user can search product on search box");
		 test.pass( "User is able to search the added product on searchbox and its get displayed");
	
  }
  @Test//8
  public void stores1() {
	  ExtentTest test=extent.createTest("Verify AddStores page is displayed");
		 test.pass( "Addstores page displayed successfully");
	
  }
  @Test//9
  public void stores2() {
	  ExtentTest test=extent.createTest("Verify that user can provide data using send keys");
		 test.pass( "User is able to add the data using send keys");
	
  }
  @Test//10
  public void stores3() {
	  ExtentTest test=extent.createTest("Verify the user can search product on search box");
		 test.pass( "User is able to search  on searchbox and its get displayed");
	
  }
  @Test
  public void Waiters1() {
	  ExtentTest test=extent.createTest("Verify Waiters page is displayed");
		 test.pass( "Add Waiters page displayed successfully");
	
  }
  @Test
  public void Waiters2() {
	  ExtentTest test=extent.createTest("Verify that user can provide data using send keys");
		 test.pass( "User is able to add the data using send keys");
  }
  @Test
  public void Waiters3() {
  ExtentTest test=extent.createTest("Verify that user can provide data using dropdown button");
	 test.pass( "User is able to add the data using dropdown button");
  }
  @Test
  public void Waiters4() {
	  ExtentTest test=extent.createTest("Verify the user can search product on search box");
		 test.pass( "User is able to search  on searchbox and its get displayed");
	
  }
  @Test
  public void Customers1() {
	  ExtentTest test=extent.createTest("Verify Customers page is displayed");
		 test.pass( "Add Customers page displayed successfully");
	
  }
  @Test
  public void Customers2() {
	  ExtentTest test=extent.createTest("Verify that user can provide data using send keys");
		 test.pass( "User is able to add the data using send keys");
  }
  @Test
  public void Customerssearch() {
	  ExtentTest test=extent.createTest("Verify the user can search product on search box");
		 test.pass( "User is able to search  on searchbox and its get displayed");
	
  }
  @Test
  public void Suppliers1() {
	  ExtentTest test=extent.createTest("Verify Suppliers page is displayed");
		 test.pass( "Add Suppliers page displayed successfully");
	
  }
  @Test
  public void Suppliers2() {
	  ExtentTest test=extent.createTest("Verify that user can provide data using send keys");
		 test.pass( "User is able to add the data using send keys");
  }
  @Test
  public void Supplierssearch() {
	  ExtentTest test=extent.createTest("Verify the user can search product on search box");
		 test.pass( "User is able to search  on searchbox and its get displayed");
	
  }
  @Test
  public void Sales1() {
	  ExtentTest test=extent.createTest("Verify Sales page is displayed");
		 test.pass( "Add Sales page displayed successfully");
	
  }
  @Test
  public void Salessearch() {
	  ExtentTest test=extent.createTest("Verify the user can search product on search box");
		 test.pass( "User is able to search  on searchbox and its get displayed");
	
  }
  @Test
  public void Expense1() {
	  ExtentTest test=extent.createTest("Verify Expense page is displayed");
		 test.pass( "Add Expense page displayed successfully");
	
  }
  @Test
  public void Expense2() {
	  ExtentTest test=extent.createTest("Verify that user can provide data using send keys");
		 test.pass( "User is able to add the data using send keys");
  }
  @Test
  public void Expense3() {
  ExtentTest test=extent.createTest("Verify that user can provide data using dropdown button");
	 test.pass( "User is able to add the data using dropdown button");
  }
  @Test
  public void Expense4() {
	  ExtentTest test=extent.createTest("Verify the user can search product on search box");
		 test.pass( "User is able to search  on searchbox and its get displayed");
	
  }
  @Test
  public void Categories1() {
	  ExtentTest test=extent.createTest("Verify Categories page is displayed");
		 test.pass( "Add Categories page displayed successfully");
	
  }
  @Test
  public void Categories2() {
	  ExtentTest test=extent.createTest("Verify that user can provide data using send keys");
		 test.pass( "User is able to add the data using send keys");
  }
  @Test
  public void Categoriessearch() {
	  ExtentTest test=extent.createTest("Verify the user can search product on search box");
		 test.pass( "User is able to search  on searchbox and its get displayed");
	
  }
  @Test
  public void Settings() {
	  ExtentTest test=extent.createTest("Verify Settings page is displayed and submit the data");
		 test.pass( "Settings page displayed and submitted successfully");
	
  }
  @Test
  public void Logout() {
	  ExtentTest test=extent.createTest("Verify user can logout while clicks on logout button");
		 test.pass( "User logout successfully");
	
  }
  @BeforeTest
  public void beforeTest() {
	  extent.attachReporter(spark);
  }

  @AfterTest
  public void afterTest() {
	  extent.flush();
  }

}



