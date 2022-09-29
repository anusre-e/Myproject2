package utilities;

import org.openqa.selenium.WebElement;

public class GeneralUtilities {

	public String getElementText(WebElement element) {
		String text=element.getText();
		return text;
	}

	public boolean elementdisplayed(WebElement element) {
		boolean textdisplay=element.isDisplayed();
		return  textdisplay;
	}
	
	public boolean elementenabled(WebElement element) {
		boolean textselect=element.isEnabled();
		return textselect;
		
	}
}
