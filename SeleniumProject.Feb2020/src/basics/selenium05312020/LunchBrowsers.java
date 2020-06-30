package basics.selenium05312020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowsers {

	public static void main(String[] args) throws InterruptedException {

		// 1. Setup System Property
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		// 2. We need to use Webdriver Interface to lunch ChromeBrowser
		WebDriver driver = new ChromeDriver(); // creating an object of web driver which lunches chrome driver

		// 3. Manage driver
		// driver.manage().window().fullscreen(); // open browser in full screen
		driver.manage().window().maximize();	// keeps it maximized

		//4. PageLoad timeout: sometime test case might fail because of page timeout so we use this to handle the timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);	//two arg for pageLoadTimout - one is the amount and the second one is the unit.
		
		//Or Implicit TimeWait: We have three type of time wait:
		//Implicit wait is used to wait for the entire execution time before it throws an error
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// 5. Lunch ChromeBrowser to navigate to http://tek-school.com/retail/
		// .get method is used to launch a website.
		driver.get("http://tek-school.com/retail/");

		// 6. Get title page - return a string and we can verify if we are in the
		// correct page
		String siteTitle = driver.getTitle(); // return type is String that's why we choose String.

		System.out.println(siteTitle); // to verify manually go to website on chorme, right click and choose inspect
										// look for head and then title and it should match

		// 7. Add a hard break
		Thread.sleep(5000); // in terms of millisecond
		// 8. Close the browser
		driver.close();
		driver.quit();
		// difference between close and quit:
		// driver.close: will close only one window/tab that is opened by webdriver
		// driver.quit: will close all the windows that are opened by webdriver.
	}

}
