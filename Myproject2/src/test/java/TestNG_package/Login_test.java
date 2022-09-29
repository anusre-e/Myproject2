package TestNG_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import pageElements.Loginpage;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Login_test extends webDriverManager{
 
	static WebDriver driver;
	Loginpage objlog;
	
	  @Test(priority=1,enabled=true,groups= {"Functional"},dataProvider="SearchProvider", dataProviderClass =Datapro.class)
	  public void Invalidlogin(String username , String pwd) throws Exception  {
		 
			
		   objlog.invalidlogin(username,pwd);
		   
		boolean actual=objlog.homepagelaunch();
		Assert.assertTrue(actual, "Login Failed");
		  
		    
		  
		
	}
	@Test(priority=2,enabled=true,groups= {"Functional"} )        
  public void Validlogin() throws Exception { 
		   
	
		objlog.validlogin();	
		  String expectedtitle="POS - point of sale Presto Cafeteria";
		   String actualtitle=driver.getTitle();
		   Assert.assertEquals(expectedtitle,actualtitle,"Title mismatch");
		 

  }
	
	
	
	@BeforeTest(alwaysRun=true)
	@Parameters({"Browser","Url"})
	  public void beforeTest()throws InterruptedException 
	   {
		  launchBrowser("chrome","https://qalegend.com/restaurant/");
		  driver = webDriverManager.driver;
			objlog=new Loginpage(driver);
		
  }

 //String browser,String url
 //browser,url
	//"chrome","https://qalegend.com/restaurant/"
//  @AfterTest
//  public void afterTest() {
//	  
//	  driver.close();
//  }

}
