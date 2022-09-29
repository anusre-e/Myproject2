package pageElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ClickAction;
import utilities.GeneralUtilities;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class Logoutpage {
	WebDriver driver;

	Waitconditions objwait=new Waitconditions();
	GeneralUtilities objutility=new GeneralUtilities();
	ClickAction objclick=new ClickAction();
	public Logoutpage(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[2]/li[3]/a/i")
	public WebElement logout;
	 @FindBy(xpath="//*[@id=\"login-modal\"]/div/div/form/input[3]")
	 public WebElement login;
	
	 public boolean backtologinpage() {
		return objutility.elementenabled(login) ;
		}
	 
	public void logoutaction() throws Exception {
		
		  objclick.clickUsingJS(driver, logout);
			objwait.waitin();
	}
}
