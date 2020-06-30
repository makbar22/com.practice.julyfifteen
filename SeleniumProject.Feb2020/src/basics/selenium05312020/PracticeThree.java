package basics.selenium05312020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeThree {

	public static void main(String[] args) throws InterruptedException {

		// 1. Set property
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		// 2. Run Chrome through interface of webdriver
		WebDriver driver = new ChromeDriver();

		// 3. Manage the window size
		driver.manage().window().maximize();

		// 4. manage load time
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 4. Open the website https://twitter.com/explore
		driver.get("https://twitter.com/explore");

		// 5. get the title
		String siteTitle = driver.getTitle();
		System.out.println(siteTitle);

		// 6. check if the title matches to pass the test
		if (siteTitle.equals("Twitter")) {
			System.out.println("The title matches, test successfully passed!");
		} else
			System.out.println("The title doesn't match, test failed!");

		// 7. Insert a break
		Thread.sleep(6000);

		// 8. Closer the browser
		driver.quit();

	}

}
