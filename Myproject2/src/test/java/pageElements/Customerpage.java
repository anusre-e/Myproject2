package pageElements;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ClickAction;
import utilities.GeneralUtilities;
import utilities.ReadExcelXFileNew;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class Customerpage {
	WebDriver driver;
	ReadExcelXFileNew excelcustomer = new ReadExcelXFileNew();
	Waitconditions objwait=new Waitconditions();
	GeneralUtilities objutility=new GeneralUtilities();
	
	ClickAction objclick=new ClickAction();
	public Customerpage(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/a")
	public WebElement people;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/ul/li[2]/a/span")
	public WebElement customers;
	@FindBy(xpath="/html/body/div[2]/button")
	public WebElement addcustomers;
	@FindBy(name="name")
	public WebElement customername;
	
	@FindBy(id="CustomerPhone")
	public WebElement customerphn;
	@FindBy(id="CustomerEmail")
	public WebElement customeremail;
	@FindBy(name="discount")
	public WebElement customerdisc;
	@FindBy(xpath="//*[@id=\"AddCustomer\"]/div/div/form/div[2]/button[2]")
	public WebElement submit;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement search;
	 @FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
	 public WebElement iconbar;
	 public String addcustomerbuttontext() {
			return objutility.getElementText(addcustomers);
		}
		public boolean customernametext() {
			return objutility.elementenabled(customername);
		}
		public boolean searchtext() {
			return objutility.elementdisplayed(search);
		}
	public void customerpagelaunch() throws Exception {
		objclick.clickUsingJS(driver, people);
		objwait.waitin();
		objclick.clickUsingJS(driver, customers);
		objwait.waitin();
		 
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scroll(0,300);");
		  objwait.waitin();
		  js.executeScript("scroll(0,-300);");
		  objwait.waitin();
		  objclick.clickUsingJS(driver,addcustomers);
			objwait.waitin();
		  
	}
	public void customerpagedetails() throws Exception {
		customername.sendKeys(excelcustomer.ReadExcelXFileNew(0, 4));

		  objwait.waitin();
		  customerphn.sendKeys(excelcustomer.ReadExcelXFileNew(1, 4));
		  objwait.waitin();

		customeremail.sendKeys(excelcustomer.ReadExcelXFileNew(2, 4));
		  objwait.waitin();
		  customerdisc.sendKeys(excelcustomer.ReadExcelXFileNew(3, 4));

		  objwait.waitin();
		
		  objclick.clickUsingJS(driver, submit);
			objwait.waitin();
		
	}
	public void customersearch() throws Exception {
	objclick.clickUsingJS(driver, search);
		//search.click();
		objwait.waitin();
		  search.sendKeys(excelcustomer.ReadExcelXFileNew(4, 4));

		  objwait.waitin();
		 
		  objclick.clickUsingJS(driver, iconbar);
			objwait.waitin();
	
	}
}
