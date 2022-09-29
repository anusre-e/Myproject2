package pageElements;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.ClickAction;
import utilities.GeneralUtilities;
import utilities.ReadExcelXFileNew;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;
import utilities.webDriverManager;

public class Addpdtpage {
	WebDriver driver;
	ReadExcelXFileNew excelpdt = new ReadExcelXFileNew();
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objsend=new SendKeysActionHelper();
	ClickAction objclick=new ClickAction();
	webDriverManager objdrop=new webDriverManager();
	GeneralUtilities objutility=new GeneralUtilities();
public Addpdtpage(WebDriver driver) {
	this.driver = driver;
	  PageFactory.initElements(driver, this);
	
	}
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[2]/a/span")
public WebElement pdt;
@FindBy(xpath="/html/body/div[2]/button")
public WebElement addpdt;
@FindBy(id="Type")
public WebElement type;
@FindBy(id="Category")
public WebElement category;
@FindBy(name="supplier")
public WebElement supplier;
@FindBy(name="code")
public WebElement code;
@FindBy(id="ProductName")
public WebElement productname;
@FindBy(id="taxType")
public WebElement taxtype;

@FindBy(id="Tax")
public WebElement tax;
@FindBy(name="unit")
public WebElement unit;

@FindBy(xpath="//*[@id=\"addform\"]/div[2]/button[2]") 
public WebElement productsubmit;
@FindBy(id="Price")  
public WebElement price;

@FindBy(id="quantity")
public WebElement stockbox;
@FindBy(xpath="//*[@id=\"stockModal\"]/div/div[3]/button[2]") 
public WebElement stocksubmit;
@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")//search
public WebElement search;
@FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
public WebElement iconbar;

public String addpdtbuttontext() {
	return objutility.getElementText(addpdt);
}
public boolean codetext() {
	return objutility.elementdisplayed(code);
}
public boolean  categorydroptext() {
	return objutility.elementenabled(category);
	}
public boolean  stocksubmittext() {
	return objutility.elementenabled(stocksubmit);
	}
public boolean searchtext() {
	return objutility.elementdisplayed(search);
}
public void pdtpage() throws Exception {
	objclick.clickUsingJS(driver, pdt);
	objwait.waitin();
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("scroll(0,300);");
	  
	  js.executeScript("scroll(0,-300);");
	  objclick.clickUsingJS(driver, addpdt);
	objwait.waitin();
	
	 }
public void pdtpagedrop() throws InterruptedException, IOException {
	
	

	objdrop.dropdownbyindex(type, 0);
	objwait.waitin();

	objdrop.dropdownbyindex(category, 1);
		objwait.waitin();
supplier.sendKeys(excelpdt.ReadExcelXFileNew(0, 1));
	objwait.waitin();
taxtype.sendKeys(excelpdt.ReadExcelXFileNew(1, 1));
//    objdrop.dropdownbyvisibletext(taxtype,"exclusive");
	
}
public void pdtpagetextdetails() throws Exception {
	
//		objsend.sendKeys(driver, code,"311");
	code.sendKeys(excelpdt.ReadExcelXFileNew(2, 1));
	objwait.waitin();
	productname.sendKeys(excelpdt.ReadExcelXFileNew(3, 1));
//	objsend.sendKeys(driver, productname,"Badam Shake");
	objwait.waitin();
	tax.sendKeys(excelpdt.ReadExcelXFileNew(3, 1));
//	objsend.sendKeys(driver, tax,"2");
	unit.sendKeys(excelpdt.ReadExcelXFileNew(4, 1));
	objwait.waitin();
//	objsend.sendKeys(driver, unit,"3");
	objwait.waitin();
	price.sendKeys(excelpdt.ReadExcelXFileNew(5, 1));
//	objsend.sendKeys(driver, price,"1");
	objwait.waitin();

}


public void pdtsubmit() throws Exception {


	  objclick.clickUsingJS(driver, price);
	  objwait.waitin();
	objclick.clickUsingJS(driver, productsubmit);
	  objwait.waitin();
}
public void pdtstockbox() throws Exception {
	  stockbox.clear();
	  objwait.waitin();
	  stockbox.sendKeys(excelpdt.ReadExcelXFileNew(6, 1));
//	  objsend.sendKeys(driver, stockbox, "4");
	  objwait.waitin();
	  objclick.clickUsingJS(driver, stocksubmit);
	  
	  objwait.waitin();

}
public void pdtsearch() throws Exception {

			
	
	objclick.clickUsingJS(driver, search);
	  objwait.waitin();
	  objsend.sendKeys(driver, search,"Badam Shake");
	
	
	  objwait.waitin();
	  objclick.clickUsingJS(driver, iconbar);
		  objwait.waitin();

}
}
