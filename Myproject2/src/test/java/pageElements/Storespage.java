package pageElements;

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

public class Storespage {
	 WebDriver driver;
	 ReadExcelXFileNew excelstore = new ReadExcelXFileNew();
	 Waitconditions objwait=new Waitconditions();
     ClickAction objclick=new ClickAction();
     GeneralUtilities objutility=new GeneralUtilities();
	public Storespage(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[3]/a/span")
	public WebElement stores;
@FindBy(xpath="/html/body/div[2]/button")
public WebElement addstores;
@FindBy(id="StoreName")
public WebElement storename;
@FindBy(name="email")
public WebElement email;

@FindBy(id="StorePhone")
public WebElement storephone;
@FindBy(name="country")
public WebElement country;
@FindBy(xpath="//*[@id=\"AddStore\"]/div/div/form/div[2]/button[2]")
public WebElement submit;
@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
public WebElement search;
@FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
public WebElement iconbar;
public String addstorebuttontext() {
	return objutility.getElementText(addstores);
}
public boolean countrytext() {
	return objutility.elementenabled(country);
}
public boolean  storesearch() {
	return objutility.elementenabled(search);
	}
	public void storepagelaunch() throws Exception {
		objclick.clickUsingJS(driver, stores);
		objwait.waitin();
		
	
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scroll(0,300);");
		  objwait.waitin();
		  js.executeScript("scroll(0,-300);");
		  objwait.waitin();
		  objclick.clickUsingJS(driver, addstores);
			objwait.waitin();
		
	}
	
	public void addstoresdetails() throws Exception {

		storename.sendKeys(excelstore.ReadExcelXFileNew(0, 2));
		objwait.waitin();

		email.sendKeys(excelstore.ReadExcelXFileNew(1, 2));
		objwait.waitin();

		storephone.sendKeys(excelstore.ReadExcelXFileNew(2, 2));
		objwait.waitin();
		

		country.sendKeys(excelstore.ReadExcelXFileNew(3, 2));
		objwait.waitin();
		objclick.clickUsingJS(driver, submit);
		objwait.waitin();
			 
	}
	
	
	public void storepagesearch() throws Exception {
		objclick.clickUsingJS(driver, search);
		objwait.waitin();
		search.sendKeys(excelstore.ReadExcelXFileNew(4, 2));

		objwait.waitin();
		
		objclick.clickUsingJS(driver, iconbar);
		objwait.waitin();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
