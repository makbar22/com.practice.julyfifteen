package basics.selenium06092020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import basics.selenium06042020.ScreenShotUtility;

public class ChromeHeadlessBrowser {

	public static void main(String[] args) {
		/*
		 * HEADLESS BROWSWER: which opens but we can't see them. Usually used in client
		 * systems. Fast and not taking any UI space.
		 */

		// 1. Set system property
		System.setProperty("webdrive.chrome.driver", "c:\\chromedriver.exe");

		// NEW - IMPORTANT
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		// pass it to the new ChromeDriver below:

		// 2. Create chrome driver instance through WebDriver Interface
		WebDriver driver = new ChromeDriver(options);

		// 3. Open Canvas page https://canvas.instructure.com/login/canvas
		driver.get("https://canvas.instructure.com/login/canvas");
		System.out.println(driver.getTitle());
		
		// 4. Set implicit wait for 30 sec
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// 5. Maximize the browser
		driver.manage().window().maximize();

		// 6. To find web element in UI page we will use .findElement() method
		WebElement email = driver.findElement(By.id("pseudonym_session_unique_id"));

		// b. Find web element of password by ID

		WebElement password = driver.findElement(By.id("pseudonym_session_password"));

		// c. Find webelement for Login button using ID for locator (since there is no
		// ID, we can right click and copy and use xpath
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
		login.click();

		// To send a value, we will use sendKeys method
		// To click on a button or element we will use .click method
		// a. Find web element of email by ID

		// a. Send value to user name
		email.sendKeys("murtaza.akbar.us@gmail.com");

		// b. Send value to password
		password.sendKeys("Telivision95");

		// c. Click on Login
		login.click();
		
		String output ="C:\\Users\\murta\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\";
				ScreenShotUtility.screenShot(driver, output, "HeadlessBrowser");
		
				driver.quit();
		
	}

}
