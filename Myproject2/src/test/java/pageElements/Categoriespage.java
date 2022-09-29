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

public class Categoriespage {
	WebDriver driver;
	GeneralUtilities objutility=new GeneralUtilities();
	 ReadExcelXFileNew excelcategory = new ReadExcelXFileNew();
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objj=new SendKeysActionHelper();
	ClickAction objclick=new ClickAction();
	public Categoriespage(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
		}
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[7]/a")
public WebElement categories;
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[7]/ul/li[1]/a/span")
public WebElement product;
@FindBy(xpath="/html/body/div[2]/button")
public WebElement addcategory;
@FindBy(id="CategoryName")
public WebElement categoryname;
@FindBy(xpath="//*[@id=\"Addcategory\"]/div/div/form/div[2]/button[2]")
public WebElement submit;
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[7]/ul/li[2]/a/span")
public WebElement expense;
@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
public WebElement search;
@FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
public WebElement iconbar;
public String addcategorybuttontext() {
	return objutility.getElementText(addcategory);
}
public boolean categorynametext() {
	return objutility.elementenabled(categoryname);
}
public boolean searchtext() {
	return objutility.elementdisplayed(search);
}
public void categorypagelaunch() throws Exception {
	objclick.clickUsingJS(driver, categories);
	objwait.waitin();
	objclick.clickUsingJS(driver, product);
	
	objwait.waitin();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("scroll(0,300);");
	  objwait.waitin();
	  js.executeScript("scroll(0,-300);");
	  objwait.waitin();
	  objclick.clickUsingJS(driver, addcategory);
		objwait.waitin();
	  
	}
public void addcategorydetails() throws Exception {
//	objj.sendKeys(driver,  categoryname, "fruits");
	categoryname.sendKeys(excelcategory.ReadExcelXFileNew(0, 3));
	  objwait.waitin();
	
	  objclick.clickUsingJS(driver, submit);
	objwait.waitin();

	
}
public void categorysearch() throws Exception {
	objclick.clickUsingJS(driver, search);
	objwait.waitin();
//	objj.sendKeys(driver,  search, "fruits");
	search.sendKeys(excelcategory.ReadExcelXFileNew(0, 3));
	  objwait.waitin();
	
	
	
	  objclick.clickUsingJS(driver, iconbar);
	objwait.waitin();
}

}
