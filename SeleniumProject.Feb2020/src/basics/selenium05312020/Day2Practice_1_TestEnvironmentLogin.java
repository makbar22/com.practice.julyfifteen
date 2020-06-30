package basics.selenium05312020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Practice_1_TestEnvironmentLogin {

	public static void main(String[] args) {

		// Step 1. Set system property
		System.setProperty("webdrive.chrome.driver", "c:\\chromedriver.exe/");

		// Step 2. Create an instance of ChromeDriver through WebDriver interface
		WebDriver driver = new ChromeDriver();

		// Step 3. Maximize the window
		driver.manage().window().maximize();

		// Step 4. Set a 10 second page load wait time and 7 second implicit wait time
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		// Step 5. Open Test Environment using URL: http://tek-school.com/retail/
		driver.get("http://tek-school.com/retail/");

		// Step 6. Create a web element of 'My Account' and click on it
		WebElement myAccount = driver
				.findElement(By.xpath("//span[@class='hidden-xs hidden-sm hidden-md' and text()='My Account']"));
		myAccount.click();

		// Step 7. Create a web element of 'Login' and click on it
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();

		// Step 8. Create a web element of 'username' and input sdet@tekschool.com
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("sdet@tekschool.com");

		// Step 9. Create a web element of 'password' and input Welcome1
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Welcome1");

		// Step 10. Create a web element of 'loginBotton' and click on it
		WebElement loginBotton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginBotton.click();

		try {
			Thread.sleep(5000);

		} catch (Exception e) {

		}
		driver.quit();
	}

}
