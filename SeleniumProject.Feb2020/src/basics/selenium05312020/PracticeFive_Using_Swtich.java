package basics.selenium05312020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFive_Using_Swtich {

	public static void main(String[] args) throws InterruptedException {

		// 1. Set Property
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		// 2. Creating instance of chrome driver via webdrive interface
		WebDriver driver = new ChromeDriver();

		// 3. Managing the screen size
		driver.manage().window().maximize();

		// 4. Managing timouts - loadtime and Implicit time
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		// 5. Open website https://www.irs.gov/
		driver.get("https://www.irs.gov/");

		// 6. Print title of the website
		String title = driver.getTitle();
		System.out.println(title);

		switch (title) {
		case "Internal Revenue Service | An official website of the United States government":
			System.out.println("Passed, title matches!");
			break;
		case "":
			System.out.println("Failed, title doesn't match");
		}

			// 7. Hard break
			Thread.sleep(5000);

			// 8. Close browser
			driver.quit();

		}
	}
