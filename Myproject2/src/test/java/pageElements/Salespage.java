package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ClickAction;
import utilities.GeneralUtilities;
import utilities.ReadExcelXFileNew;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class Salespage {
	WebDriver driver;
	GeneralUtilities objutility=new GeneralUtilities();
	ReadExcelXFileNew excelsales = new ReadExcelXFileNew();
	Waitconditions objwait=new Waitconditions();
	ClickAction objclick=new ClickAction();
	public Salespage(WebDriver driver) {
	
		this.driver = driver;
		  PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[5]/a/span")
	public WebElement sales;
	@FindBy(xpath="//*[@id=\"table_filter\"]/label/input")
	public WebElement search;
	 @FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
	 public WebElement iconbar;
	 public boolean salestext() {
		return objutility.elementdisplayed(iconbar);
		 
	 }
	 public boolean searchtext() {
			return objutility.elementdisplayed(search);
		}
	 
	public void Salespagelaunch() throws InterruptedException {
		sales.click();
		objwait.waitin();
		
		
	}
	public void Salessearch() throws Exception {
		objclick.clickUsingJS(driver, search);
		objwait.waitin();
		
		search.sendKeys(excelsales.ReadExcelXFileNew(0, 6));
		  objwait.waitin();

		  objclick.clickUsingJS(driver, iconbar);
	objwait.waitin();
	
	}
}
