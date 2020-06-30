package basics.selenium05312020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOne {

	public static void main(String[] args) throws InterruptedException {

		// 1. Setup System Property
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		// 2. We need to use Webdriver Interface to lunch ChromeBrowser
		WebDriver driver = new ChromeDriver();

		// 3. Manage driver - full screen/maximize
		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();

		// 4. PageLoad timeout: sometime test case might fail because of page timeout so
		// we use this to handle the timeout
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// 5. Lunch ChromeBrowser to navigate to https://zoom.us/
		driver.get("https://zoom.us/");

		// 6. Get title page - return a string and we can verify if we are in the right website
		String siteTitle = driver.getTitle();
		System.out.println(siteTitle);

		if (siteTitle.equals("Video Conferencng, Web Conferencing, Webinars, Screen Sharing - Zoom")) {
			System.out.println("Test is Successful");
		} else
			System.out.println("Test Failed");

		// 7. Add a hard break
		Thread.sleep(5000);

		// 8. Close the browser
		driver.close();
		driver.quit();

	}

}
