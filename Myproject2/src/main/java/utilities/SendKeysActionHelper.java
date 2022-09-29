package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendKeysActionHelper {

	/**
	 * method to set text to the input field
	 * @throws Exception 
	 */
	public void sendKeys(WebDriver driver, WebElement element, String inputText) throws Exception {
		try {
			element.sendKeys(inputText);
		}catch(Exception e) {
			throw new Exception("sendKeys (SendKeysActionHelper) "+e.getMessage());
		}
	}}
