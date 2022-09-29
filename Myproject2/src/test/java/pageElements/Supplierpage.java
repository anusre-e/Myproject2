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

public class Supplierpage {
	WebDriver driver;
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objsend=new SendKeysActionHelper();
	ClickAction objclick=new ClickAction();
	GeneralUtilities objutility=new GeneralUtilities();
	ReadExcelXFileNew excelsupp = new ReadExcelXFileNew();
	public Supplierpage(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/a")
	public WebElement people;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/ul/li[3]/a/span")
	public WebElement suppliers;
	@FindBy(xpath="/html/body/div[2]/button")
	public WebElement addsuppliers;
	@FindBy(id="SupplierName")
	public WebElement suppliername;
	@FindBy(name="phone")
	public WebElement phn;
	@FindBy(id="SupplierEmail")
	public WebElement email;
	@FindBy(xpath="//*[@id=\"AddSupplier\"]/div/div/form/div[2]/button[2]")
	public WebElement submit;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement search;
	 @FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
	 public WebElement iconbar;
	 public String addstorebuttontext() {
			return objutility.getElementText(addsuppliers);
		}
		public boolean emailtext() {
			return objutility.elementenabled(email);
		}
		public boolean  searchtext() {
			return objutility.elementenabled(search);
			}
	public void addsuppbuttontext() throws Exception {
		objclick.clickUsingJS(driver, people);
		objwait.waitin();
		objclick.clickUsingJS(driver, suppliers);
		objwait.waitin();
		
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scroll(0,300);");
		  objwait.waitin();
		  js.executeScript("scroll(0,-300);");
		  objwait.waitin();
		  objclick.clickUsingJS(driver, addsuppliers);
			objwait.waitin();
		  
		  
	}
	public void addsuppliers() throws Exception {
//		objj.sendKeys(driver,  suppliername, "Anujith");
		suppliername.sendKeys(excelsupp.ReadExcelXFileNew(0, 8));
		  objwait.waitin();
//		  objj.sendKeys(driver,  phn, "7654227712");
		  phn.sendKeys(excelsupp.ReadExcelXFileNew(1, 8));
		  objwait.waitin();
//		  objj.sendKeys(driver,  email, "qwerty@gmail.com");
		  email.sendKeys(excelsupp.ReadExcelXFileNew(2, 8));
		  objwait.waitin();
		  objclick.clickUsingJS(driver, submit);
			objwait.waitin();
		
	}
	public void suppsearch() throws Exception {
		objclick.clickUsingJS(driver, search);
		objwait.waitin();
		
		search.sendKeys(excelsupp.ReadExcelXFileNew(0, 8));
		  objwait.waitin();
	
		  objclick.clickUsingJS(driver, iconbar);
		objwait.waitin();
		
	}
}
