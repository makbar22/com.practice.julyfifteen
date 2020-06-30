package basics.selenium05312020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowser {

	public static void main(String[] arg) {

		// 1. Set property
		System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe");

		// 2. Create an object of IE driver using webdriver interface
		WebDriver driver = new InternetExplorerDriver();

		//
		// 3. Open test environment website
		driver.get("http://tek-school.com/retail/");

		// 4. Wait for 5 second
		try { // we used try and catch instead of throws method
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 5. Closer driver
		driver.quit();

	}
}
