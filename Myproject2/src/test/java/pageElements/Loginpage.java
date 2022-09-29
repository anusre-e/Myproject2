package pageElements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.ClickAction;
import utilities.GeneralUtilities;
import utilities.ReadExcelXFileNew;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;


public class Loginpage {
	WebDriver driver;
	GeneralUtilities objutility=new GeneralUtilities();
	ReadExcelXFileNew excellogin = new ReadExcelXFileNew();
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objsend=new SendKeysActionHelper();
ClickAction objclick=new ClickAction();
	public Loginpage(WebDriver driver) {
		
		this.driver = driver;
		  PageFactory.initElements(driver, this); //initialization of pagefactory
		}
	 @FindBy(xpath="//*[@id=\"login-modal\"]/div/div/form/input[1]")
	 public WebElement Username;
	 @FindBy(xpath="//*[@id=\"login-modal\"]/div/div/form/input[2]")
	 public WebElement Password;
	 @FindBy(xpath="//*[@id=\"login-modal\"]/div/div/form/input[3]")
	 public WebElement login;
	 @FindBy(className="icon-bar")
	 public WebElement iconbar;
public boolean homepagelaunch() {
	
	return objutility.elementenabled(login) ;
	
}
	 
	 
	 public void invalidlogin(String username, String pwd) throws Exception {
		 
		 objsend.sendKeys(driver, Username, "admin");
	      objwait.waitin();
		 objsend.sendKeys(driver, Password, pwd);
	      objwait.waitin();
	  
	      objclick.clickUsingJS(driver,login);
		   objwait.waitin();
		   Username.clear();
		  objwait.waitin();
	 }
	 
	 public void validlogin() throws Exception {
		 

		  Username.sendKeys(excellogin.ReadExcelXFileNew(0, 0));
	      objwait.waitin();

	      Password.sendKeys(excellogin.ReadExcelXFileNew(1, 0));
	      objwait.waitin();

	      objclick.clickUsingJS(driver, login);
	     objwait.waitin();
	     objclick.clickUsingJS(driver, iconbar);
		  
		    objwait.waitin();
		 

	
}}
