package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitconditions extends webDriverManager{
	public static void implicitwait(long time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
		


		public void explicitwaitelementToBeClickable(WebElement element,long seconds ) {
			WebDriverWait wait = new WebDriverWait(driver,seconds );
			wait.until(ExpectedConditions.elementToBeClickable( element));
		}
		public void explicitwaitelementToBeSelected(WebElement element,long seconds ) {
			WebDriverWait wait = new WebDriverWait(driver,seconds);
			wait.until(ExpectedConditions.elementToBeSelected(element));
		}
		
		public void explicitwaitpresenceOfAllElementsLocated(By element,long seconds ) {
			WebDriverWait wait = new WebDriverWait(driver,seconds );
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
		}
		
		
				public void explicitwaitvisibility(WebElement element,long seconds ) {
					WebDriverWait wait = new WebDriverWait(driver,seconds );
					wait.until(ExpectedConditions.visibilityOf(element));
				}
				public void waitin() throws InterruptedException {
					Thread.sleep(3000);
				}
		//implementation of Fluent wait
				
				public void Fluentwait( long timeout ) {
					FluentWait wait=new FluentWait(driver);
					wait.until(ExpectedConditions.alertIsPresent());
					wait.ignoring(NoSuchElementException.class);
				}
}


