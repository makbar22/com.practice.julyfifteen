package basics.selenium06092020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountRegisterTestCase {

	// set basic system property for chrome
	// set pageload to 30
	// set implicit wait to 30
	// set windows to maximize
	// open test environment
	// open register form 15 min to write the code
	// =-------------------------------
	// check if Yes radio button is not selected return false
	// click on Yes radio button j
	// verify yes radio button is selected
	// verify privacy policy is displayed
	// verify Continue button is enabled.

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		String url = "http://tek-school.com/retail/";
		driver.get(url);

		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccount.click();

		Thread.sleep(3000);

		WebElement register = driver.findElement(By.xpath(
				"//a[text()='Register' and @href='http://tek-school.com/retail/index.php?route=account/register']"));
		register.click();
		Thread.sleep(3000);

		WebElement yesRadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		System.out.println(yesRadioButton.isSelected());
		if (!yesRadioButton.isSelected()) {
			yesRadioButton.click();
			System.out.println(yesRadioButton.isSelected());
			WebElement privacyPolicy = driver.findElement(By.xpath("//b[text()='Privacy Policy']"));
			System.out.println(privacyPolicy.isDisplayed());

			WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
			System.out.println(continueButton.isEnabled());

		}

	}

}
