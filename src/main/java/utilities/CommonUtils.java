package utilities;

import java.sql.Timestamp;
import java.util.Date;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import base.SeleniumDriver;

public class CommonUtils extends BaseClass {

	// Returns current Time stamp
	public static Timestamp getTimeStamp() {
		Date d = new Date();
		long time = d.getTime();
		Timestamp ts = new Timestamp(time);
		return ts;
	}

	// Click on element with retry
	public static void clickElementWithRetry(WebElement element) {
		boolean elementFound = false;
		int counter = 0;
		while (!elementFound) {
			if (counter > 5) {
				break;
			}
			counter++;
			try {
				element.click();
				elementFound = true;
			} catch (ElementClickInterceptedException ex) {
			} catch (ElementNotInteractableException ex) {
			}
		}

	}

	// Click on element
	public static void clickElement(WebElement element) {
		waitTillElementToBeClickable(element);
		element.click();
	}

	// Initialize wait
	public static WebDriverWait getDriverWait() {
		return new WebDriverWait(SeleniumDriver.getDriver(), webDriverWait);
	}

	// Wait until element is clickable
	public static void waitTillElementToBeClickable(WebElement element) {
		getDriverWait().until(ExpectedConditions.elementToBeClickable(element));
	}

	// Verify element present in the page
	public static boolean verifyElementVisibleOnPage(WebElement element) {
		waitTillElementVisibleOnPage(element);
		return element.isDisplayed();
	}

	// Wait till element present on page
	public static void waitTillElementVisibleOnPage(WebElement element) {
		getDriverWait().until(ExpectedConditions.visibilityOf(element));
	}

}
