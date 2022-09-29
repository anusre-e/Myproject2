package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Addpdtpage;
import pageElements.Loginpage;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Addpdt_test extends webDriverManager{
	static WebDriver driver;
	Loginpage objlog;
		Addpdtpage objpdt;
	@Test(priority=3,enabled=true)   
	//TC2      //click on pdt,swipe and click on add pdt
	  public void Productpagelaunch() throws Exception{   
		  
		  driver = webDriverManager.driver;		 
		  objpdt=new Addpdtpage(driver);
		//objlog.validlogin();
		objpdt.pdtpage();
String expectedtext="Add Product";
String actualtext=objpdt.addpdtbuttontext();
	Assert.assertEquals(actualtext, expectedtext);
	}
	@Test(priority=4,enabled=true)  //TC3  //for sending values on textboxes of add pdt page using send keys
	  public void Productpagetextdetails() throws Exception{
		
	   objpdt.pdtpagetextdetails();
	  boolean actualtext=objpdt.codetext();		
	   Assert.assertTrue(actualtext);
	}

	@Test(priority=5,enabled=true)  //TC4 //Dropdown on add pdt page
	
	public void Productpagedropdowndetails() throws Exception{
		  
	   objpdt.pdtpagedrop();
	   objpdt.pdtsubmit();
	   boolean actualtext=objpdt.categorydroptext()	;		
		  Assert.assertTrue(actualtext);
	   
}

@Test(priority=6,enabled=true)   //TC5            
	
	public void  Productstockpage() throws Exception {
	 objpdt.pdtstockbox();
	 boolean actualtext=objpdt.stocksubmittext()	;		
	  Assert.assertTrue(actualtext);
	
	  
}
@Test(priority=7,enabled=true) //TC6
public void  Productsearch() throws Exception {
	 objpdt.pdtsearch();
	boolean actualtext=objpdt.searchtext();
	
	Assert.assertTrue(actualtext);
}
	
//@BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  objlog=new Loginpage(driver);
//	  objpdt=new Addpdtpage(driver);
//	 
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  driver.close();
//  }

}
