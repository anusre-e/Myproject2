package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickAction extends webDriverManager{

	JavascriptExecutor js = (JavascriptExecutor) driver;
public void clickUsingJS(WebDriver driver, WebElement element) throws Exception {
		try {
			
			js.executeScript("arguments[0].click();", element);
		}catch(Exception e) {
			throw new Exception("clickUsingJS (ClickAction) : "+e.getMessage());
		}

}}

