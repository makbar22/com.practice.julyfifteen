package basics.selenium05312020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTwo {

	public static void main(String[] args) throws InterruptedException {

		// 1. Set Property
		System.setProperty("webdriver.chrome.driver", "c:\\chromedrive.exe");

		// 2. Launch ChromeDriver via WebDriver interface
		WebDriver driver = new ChromeDriver();

		// 3. Manage driver screen - maximize
		driver.manage().window().maximize();

		// 4. Manage timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 4. Access the website https://mail.yahoo.com/
		driver.get("https://mail.yahoo.com/");

		// 5. get title of the website
		String websiteTitle = driver.getTitle();
		System.out.println(websiteTitle);

		// 6. If statement
		if (websiteTitle.equals("Yahoo Mail")) {
			System.out.println("Test Successful - Title Matches!");
		} else
			System.out.println("Test Failed - Title Mismatch!");

		// 7. Insert hard break
		Thread.sleep(5000);

		// 8. Close the browser
		driver.quit();

	}
}
