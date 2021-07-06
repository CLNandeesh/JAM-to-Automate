package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.BaseClass;
import base.SeleniumDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.CommonUtils;

public class Hooks extends BaseClass {

	@Before
	public static void setUp(Scenario scenario) {

		// Initialize driver
		SeleniumDriver.setUpDriver();
		logger.info(scenario.getName() + " started execution");
		allocationName = "ImpactAutomatedAllocation" + CommonUtils.getTimeStamp();

	}

	@After
	public static void tearDown(Scenario scenario) {

		WebDriver driver = SeleniumDriver.getDriver();

		// Check status and if status is failed generate screenshot and attach to report
		if (scenario.isFailed()) {
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");
		}

		logger.info(scenario.getName() + " finished execution");
		logger.info(scenario.getName() + " status is " + scenario.getStatus().toUpperCase());

		// Close the driver
		SeleniumDriver.tearDown();
	}
}
