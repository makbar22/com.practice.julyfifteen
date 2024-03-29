package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;

	private String propertyPath = ".\\src\\test\\resources\\properties\\ProjectProperty.properties"; // private because
																										// we are using
																										// using
																										// constuctor so
																										// the child
																										// class can
																										// access it via
																										// the
																										// constuctor

	// create a constructor to load property of this class anytime child classes use
	// its property

	public Base() {

		try {
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(propertyPath));

			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		logger = logger.getLogger("Logger_file");
		PropertyConfigurator.configure(".\\src\\test\\resources\\properties\\log4j.properties");

	}

	// getBrowser method
	public static String getBrowserName() {
		String browserName = properties.getProperty("browserName");
		return browserName;
	}

	// getURL method
	public static String getURL() {
		String url = properties.getProperty("url");
		return url;
	}

	// getPageLoad method
	public static long getPageLoadTime() {
		String pageLoadTime = properties.getProperty("pageLoadTime");
		return Long.parseLong(pageLoadTime);
	}

	// getImplicitWait method
	public static long getImplicitWait() {
		String implicitWait = properties.getProperty("implicitWait");
		return Long.parseLong(implicitWait);
	}

	// getUserName method
	public static String getUserName() {
		String userName = properties.getProperty("userName");
		return userName;
	}

	// getPassword method
	public static String getPassword() {
		String password = properties.getProperty("password");
		return password;
	}

	// initialize the driver

	public static void initializeDriver() {

		if (Base.getBrowserName().equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Base.getBrowserName().equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		} else if (Base.getBrowserName().equalsIgnoreCase("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		// methods to do the job
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Base.getPageLoadTime(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getImplicitWait(), TimeUnit.SECONDS);
		driver.get(Base.getURL());
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}
