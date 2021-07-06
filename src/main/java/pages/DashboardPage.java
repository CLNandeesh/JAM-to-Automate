package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import base.SeleniumDriver;
import utilities.CommonUtils;

public class DashboardPage extends BaseClass {

	public DashboardPage() {
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}

	@FindBy(xpath = "//span[text()='Dashboard']")
	@CacheLookup
	public WebElement dashboardLabel;

	public boolean verifyUserIsOnDashboardPage() {
		return CommonUtils.verifyElementVisibleOnPage(dashboardLabel);
	}

}
