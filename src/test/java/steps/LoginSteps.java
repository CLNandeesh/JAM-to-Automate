package steps;

import org.testng.Assert;

import base.BaseClass;
import base.SeleniumDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import customexception.SomethingWentWrongException;
import pages.LoginPage;

public class LoginSteps extends BaseClass {

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		SeleniumDriver.openPage();

	}

	@When("^User enter valid Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enter_valid_Username_and_Password(String username, String password) throws Throwable {
		if (loginPage == null) {
			loginPage = new LoginPage();
		}
		loginPage.setUserID(username);
		logger.info("Username entered");
		loginPage.setPassword(password);
		logger.info("Password entered");

	}

	@When("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		dashboardPage = loginPage.clickSigin();
		logger.info("Clicked on Sigin button");
	}

	@Then("^User lands on Dashboard Page$")
	public void user_lands_on_Dashboard_Page() throws Throwable {
		try {
			Assert.assertEquals(dashboardPage.verifyUserIsOnDashboardPage(), true);
		} catch (Exception e) {
			throw new SomethingWentWrongException("Something went wrong while Login");
		}
	}

}
