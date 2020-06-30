package basics.selenium06042020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOne {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/hotel/");

		String title = driver.getTitle();
		System.out.println(title);

		String outputpath = "C:\\Users\\murta\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\";
		ScreenShotUtility.screenShot(driver, outputpath, "HotelHomePage");

		WebElement singIn = driver.findElement(By.xpath("//span[@class='hide_xs']"));
		singIn.click();

		Thread.sleep(5000);
		ScreenShotUtility.screenShot(driver, outputpath, "SignIn");

		WebElement email = driver.findElement(By.xpath(
				"//input[@class='is_required validate account_input form-control' and @type='email' and @id='email']"));
		email.sendKeys("mak@gmail.com");

		WebElement password = driver.findElement(By.xpath(
				"//input[@class='is_required validate account_input form-control' and @type='password' and @id='passwd']"));
		password.sendKeys("12ab");

		WebElement clickSignIn = driver.findElement(By.xpath("//button[@type='submit' and @id='SubmitLogin']"));
		clickSignIn.click();
		ScreenShotUtility.screenShot(driver, outputpath, "ClickSignIn");

		driver.quit();

	}

}
