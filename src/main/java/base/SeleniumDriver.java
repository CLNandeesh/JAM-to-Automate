package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver extends BaseClass {

	private SeleniumDriver() throws IOException {

		// Reading config.properties file code
		File file = new File("src\\test\\resources\\configurationfiles\\config.properties");
		prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop.load(fis);

		// Logger class initialization code
		logger = Logger.getLogger("JAM Logs");
		PropertyConfigurator.configure("src\\test\\resources\\configurationfiles\\log4j.properties");

		// Read browser type from config.properties file
		browser = prop.getProperty("browser");

		// Invoke browser code
		switch (browser) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			SeleniumDriver.driver = new ChromeDriver();
			logger.info("Chrome Browser Started ");
			break;

		case "ie":
			WebDriverManager.iedriver().setup();
			SeleniumDriver.driver = new InternetExplorerDriver();
			logger.info("IE Browser Started ");
			break;

		case "headless":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			SeleniumDriver.driver = new ChromeDriver(options);
			logger.info("Headless Chrome Browser Started ");
			break;

		case "htmlunit":
			SeleniumDriver.driver = new HtmlUnitDriver();
			logger.info("HTML Unit Browser Started ");
			break;

		default:
			WebDriverManager.firefoxdriver().setup();
			SeleniumDriver.driver = new FirefoxDriver();
			logger.info("Firefox Browser Started ");

		}

		// Maximize window and set timeout
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

	}

	// Open Application URL code
	public static void openPage() {
		driver.get(prop.getProperty("url"));
		logger.info("Application URL "+prop.getProperty("url")+" opened");
	}

	// To get Driver class refrence code
	public static WebDriver getDriver() {
		return driver;
	}

	// Initialize driver by calling Constructor which will be called in Hooks class
	public static void setUpDriver() {
		if (seleniumDriver == null)
			try {
				seleniumDriver = new SeleniumDriver();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	//To close the driver which has been called in Hooks class
	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}
	
	

}
