package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class webDriverManager {

	public static	WebDriver driver;
	
	 public static void launchBrowser(String  browser,String url){
		
			
		if(browser.equalsIgnoreCase("chrome"))
			{
				
			
				System.setProperty("webdriver.chrome.driver", "C:\\Selinium\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();//for launching chromebrowser 
				
				driver.get(url);//for launching the url(app)on the chromebrowser
				driver.manage().window().maximize();//maximise the webpage
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			}
				else if(browser.equalsIgnoreCase("IE"))
				{
				
					System.setProperty("webdriver.edge.driver", "C:\\Selinium\\edgedriver_win64\\msedgedriver.exe");
					driver=new EdgeDriver();//for launching 
					
					driver.get(url);//for launching the url(app)
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			  
		        }
				else if(browser.equalsIgnoreCase("firefox"))
				{
				
					System.setProperty("webdriver.gecko.driver", "C:\\Users\\jithi\\Downloads\\Geckodriver-v0.31.0-win32\\geckodriver.exe");
					driver=new FirefoxDriver();//for launching 
					
					driver.get(url);//for launching the url(app)
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			  
		        }}
		public void Dropdown(By element ,String value) throws InterruptedException
		
		{
			WebElement test=driver.findElement(element);
			 Select objd= new Select(test);
			    objd.selectByValue(value);
				
			
		}

	 public static void Screenshots() throws IOException {

			Date d=new Date();//current date
			SimpleDateFormat sdf= new SimpleDateFormat("ddMMyy_HHmmss");
			String timestamp=sdf.format(d);
			
			TakesScreenshot objscreen = (TakesScreenshot)driver;
			File out= objscreen.getScreenshotAs(OutputType.FILE);
			File expe = new File("C:\\Screenshot\\test"+timestamp+"jpeg");
			FileUtils.copyFile(out, expe);
			
		
			
			}
		
	 public void dropdownbyvalue(WebElement element, String value1) {
			
			Select objselect = new Select(element);
			objselect.selectByValue(value1);
		}

		public void dropdownbyvisibletext(WebElement element, String value1) {
		
			Select objselect = new Select(element);
			objselect.selectByVisibleText(value1);
		}

		public void dropdownbyindex(WebElement element, int value1) {

			Select objselect = new Select(element);
			objselect.selectByIndex(value1);
		
}}
