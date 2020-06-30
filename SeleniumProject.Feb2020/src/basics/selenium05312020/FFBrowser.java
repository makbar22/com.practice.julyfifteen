package basics.selenium05312020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFBrowser {

	public static void main(String[] args) throws InterruptedException {

		// 1. Set Property - FireFox is default browser of selenium and we do not need
		// to set property
		System.setProperty("webdriver.gecko.driver", "c:\\geckdriver.exe");

		// 2. Run FF through interface of WebDriver
		WebDriver driver = new FirefoxDriver();

		// 3. Set the window to maximum and timeout
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// 4. Run the website
		driver.get("http://tek-school.com/retail/");

		// 5. Get the title
		String title = driver.getTitle();
		System.out.println(title);

		//6. Add a hard break
		Thread.sleep(5000);
		
		// 7. Close the browser
		driver.quit();

	}

}
