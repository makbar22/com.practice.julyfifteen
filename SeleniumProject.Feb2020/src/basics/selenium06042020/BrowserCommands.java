package basics.selenium06042020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		// 1. Set system property for Chrome Browser
		System.setProperty("webriver.chrome.driver", "c:\\chromedriver.exe");

		// 2. Create object of Webdriver that instantiates Chrome Browser
		WebDriver driver = new ChromeDriver();

		// 3. Maximize the window
		driver.manage().window().maximize();

		// 4. Set PageLoad Timeout
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// 5. Set Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// 6. Delete cookies to know the actual behavior of the application
		driver.manage().deleteAllCookies();

		// 7. Go to the website address
		// driver.get -- will open the browser and will wait until the element of the
		// website is visible
		// driver.navigate().to -- will open the browser and navigate as per the flow of
		// the execution.

		driver.get("http://tek-school.com/");

		// 8. Wait for 5 seconds and navigate to Test Environment

		Thread.sleep(5000);

		driver.navigate().to("http://tek-school.com/retail/");

		// 9. Wait for another 5 seconds and navigate back to http://tek-school.com/
		Thread.sleep(5000);
		driver.navigate().back();

		// 10 Wait for another 5 seconds and navigate forward to http://tek-school.com/retail/
		Thread.sleep(5000);
		driver.navigate().forward();

		// 11. Wait for another 5 seconds and close browser
		Thread.sleep(5000);
		driver.quit();

	}

}
