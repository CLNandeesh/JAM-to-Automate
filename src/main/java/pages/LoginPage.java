package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import base.SeleniumDriver;
import utilities.CommonUtils;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	@CacheLookup
	public WebElement userIDTextBox;

	@FindBy(xpath = "//input[@placeholder='Password']")
	@CacheLookup
	public WebElement passwordTextBox;

	@FindBy(xpath = "//span[text()='Login']")
	@CacheLookup
	public WebElement loginButton;

	@FindBy(xpath = "//img[@src='/img/Allocate$mart.4da7df3c.png']")
	@CacheLookup
	public WebElement loginPageLabel;

	public void setUserID(String userID) throws InterruptedException {
		userIDTextBox.clear();
		userIDTextBox.sendKeys(userID);
	}

	public void setPassword(String password) throws InterruptedException {
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
	}

	public DashboardPage clickSigin() throws InterruptedException {
		CommonUtils.clickElement(loginButton);
		return new DashboardPage();

	}

}
