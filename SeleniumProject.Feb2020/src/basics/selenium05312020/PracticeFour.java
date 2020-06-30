package basics.selenium05312020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFour {

	public static void main(String[] args) throws InterruptedException {

		// 1. Set property
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		// 2. Create an instance of chrome driver through webdriver interface
		WebDriver driver = new ChromeDriver();

		// 3. Manage to maximize the screen
		driver.manage().window().maximize();

		// 4. Manage pageload timeout
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// 5. Open page https://districtsitter.com/
		driver.get("https://districtsitter.com/");

		// 6. Get the title
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("District Sitter, Your Hassle-free Childcare Agency. Join Today! – District Sitter, LLC.")) {
			System.out.println("Passed, title matches!");
		} else
			System.out.println("Failed, title mismatch");

		// 7. Hard break
		Thread.sleep(10000);

		// 8. Close the browser
		driver.quit();
	}

}
