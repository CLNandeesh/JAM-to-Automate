package base;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pages.DashboardPage;
import pages.LoginPage;

public class BaseClass {

	// Driver utilities
	public static WebDriver driver;
	public static Properties prop = null;
	public static Logger logger;
	public static SeleniumDriver seleniumDriver;

	// Wait utilities
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;
	public final static int webDriverWait = 40;

	// User defined variables
	public String browser = null;
	public static String allocationName = null;

	// Pages class refrence variables
	public LoginPage loginPage = null;
	public DashboardPage dashboardPage = null;

}
