package pageElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.reactivex.rxjava3.functions.Action;
import utilities.ClickAction;
import utilities.GeneralUtilities;
import utilities.ReadExcelXFileNew;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;
import utilities.webDriverManager;

public class Expensepage {
	WebDriver driver;
	GeneralUtilities objutility=new GeneralUtilities();
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objsend=new SendKeysActionHelper();
	ClickAction objclick=new ClickAction();
	webDriverManager objdrop=new webDriverManager();
	ReadExcelXFileNew excelexpense = new ReadExcelXFileNew();
	public Expensepage(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[6]/a/span")
public WebElement expense;
@FindBy(xpath="/html/body/div[2]/button")
public WebElement addexpense;
@FindBy(id="Date")
public WebElement date;
@FindBy(name="reference")
public WebElement reference;
@FindBy(id="Amount")
public WebElement Amount;
@FindBy(id="Category")
public WebElement Category;
@FindBy(xpath="//*[@id=\"store_id\"]")
public WebElement store;
@FindBy(xpath="//*[@id=\"attachment\"]")
public WebElement attachment;
@FindBy(xpath="//*[@id=\"addform\"]/div[2]/button[2]")
public WebElement submit;
@FindBy(xpath="//*[@id=\"table_filter\"]/label/input")
public WebElement search;
@FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
public WebElement iconbar;
public String addexpensebuttontext() {
	return objutility.getElementText(addexpense);
}
public boolean amounttext() {
	return objutility.elementenabled(Amount);
}
public boolean  storedroptext() {
	return objutility.elementenabled(store);
	}
public boolean searchtext() {
	return objutility.elementdisplayed(search);
}
public void expensepagelaunch() throws Exception {
	objclick.clickUsingJS(driver, expense);
	objwait.waitin();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("scroll(0,300);");
	  objwait.waitin();
	  js.executeScript("scroll(0,-300);");
	  objwait.waitin();
	  objclick.clickUsingJS(driver, addexpense);
		objwait.waitin();
	 
}
public void addexpensedetails() throws Exception {

	//objsend.sendKeys(driver,  reference, "876985");
	reference.sendKeys(excelexpense.ReadExcelXFileNew(0, 5));
	  objwait.waitin();
	  Amount.sendKeys(excelexpense.ReadExcelXFileNew(1, 5));
	  //objsend.sendKeys(driver,  Amount, "25");
	  objwait.waitin();
      date.sendKeys(excelexpense.ReadExcelXFileNew(2, 5));
	  //objsend.sendKeys(driver,  date, "09/03/2022");
   
	

}
public void expensedropdown() throws Exception {
	objdrop.dropdownbyindex(Category, 1);
	objwait.waitin();
	objdrop.dropdownbyindex(store,2);
	objwait.waitin();
	   objclick.clickUsingJS(driver, submit);
	  	objwait.waitin();
	
    

	
	
}

public void expensesearch() throws Exception {
	objclick.clickUsingJS(driver, search);
	objwait.waitin();
	search.sendKeys(excelexpense.ReadExcelXFileNew(0, 5));
//	objsend.sendKeys(driver,  search, "876985");
//	  objwait.waitin();
	  objclick.clickUsingJS(driver, iconbar);
		objwait.waitin();

}
}
