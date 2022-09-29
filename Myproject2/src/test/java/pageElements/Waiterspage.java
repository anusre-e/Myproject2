package pageElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ClickAction;
import utilities.GeneralUtilities;
import utilities.ReadExcelXFileNew;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;
import utilities.webDriverManager;

public class Waiterspage {
	WebDriver driver;
	ReadExcelXFileNew excelwaiters = new ReadExcelXFileNew();
	Waitconditions objwait=new Waitconditions();
	webDriverManager objdrop=new webDriverManager();
	ClickAction objclick=new ClickAction();
	GeneralUtilities objutility=new GeneralUtilities();
	public Waiterspage(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/a")
public WebElement people;
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/ul/li[1]/a/span")
public WebElement waiters;
@FindBy(xpath="/html/body/div[2]/button")
public WebElement addwaiters;
@FindBy(id="WaiterName")
public WebElement waitersname;
@FindBy(id="WaiterPhone")
public WebElement phoneno;
@FindBy(name="store_id")
public WebElement waiterstore;
@FindBy(xpath="//*[@id=\"AddWaiter\"]/div/div/form/div[2]/button[2]")
public WebElement submit;
@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
public WebElement search;
@FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
public WebElement iconbar;

public String addwaiterbuttontext() {
	return objutility.getElementText(addwaiters);
	}
public boolean phonenumtext() {
	return objutility.elementdisplayed(phoneno);
}
public boolean waiterstoretext() {
	return objutility.elementenabled(waiterstore);
}
public boolean searchtext() {
	return objutility.elementenabled(search);
}
	public void waiterspagelaunch() throws Exception {
		objclick.clickUsingJS(driver, people);
		objwait.waitin();
		objclick.clickUsingJS(driver, waiters);
		objwait.waitin();
		
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scroll(0,300);");
		  objwait.waitin();
		  js.executeScript("scroll(0,-300);");
		  objwait.waitin();
		  objclick.clickUsingJS(driver, addwaiters);
			objwait.waitin();
		  
		}
	public void addwaitersdetails() throws Exception {
//		 objj.sendKeys(driver, waitersname, "Amal");
		waitersname.sendKeys(excelwaiters.ReadExcelXFileNew(0, 7));
		  objwait.waitin();
		  phoneno.sendKeys(excelwaiters.ReadExcelXFileNew(1, 7));
		  objwait.waitin();
	
		
	}
	public void waiterspagedropdowndetails() throws Exception {
//		Select wst=new Select(waiterstore);
//		wst.selectByIndex(2);
		objdrop.dropdownbyindex(waiterstore, 2);
		objwait.waitin();
		objclick.clickUsingJS(driver, submit);
		objwait.waitin();
		
	}
	
	public void waitersearch() throws Exception {
		//objj1.clickUsingJS(driver, search);
		search.click();
		objwait.waitin();
//		objj.sendKeys(driver, search, "Amal");
		
		search.sendKeys(excelwaiters.ReadExcelXFileNew(0, 7));
		  objwait.waitin();	
		  objclick.clickUsingJS(driver, iconbar);
		objwait.waitin();
		
	}
	
	
}
