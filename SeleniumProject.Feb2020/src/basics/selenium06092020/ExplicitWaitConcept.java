package basics.selenium06092020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {

		/*
		 * WAIT TYPE: IMPLICIT WAIT: this wait is set on overall of webdriver execution
		 * before throwing an exception EXPLICIT WAIT: this wait is set for specific
		 * element before webdriver throws an exception FLUENT WAIT: set to handle
		 * ElementNotVisibleException
		 */

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://tek-school.com/real-estate/");

		// we need to create object of Webdriverwait class
		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement find = driver.findElement(By.xpath("//a[text()='Find']"));
		wait.until(ExpectedConditions.elementToBeClickable(find));
		
		find.click();
		
		// Explicit waits we can use for single element can be
		// elementTobeClickable
		// elementTobePresent
		// elementTobeVisible, etc.

		/*
		 * Interview: what is the difference between implicit and explicit wait? Ans:
		 * Implicit wait applies to entired webdriver execution and webdriver will throw
		 * exception before certain time. Explicit wait applies to specific element and
		 * time sets for that element before it throws exception and handling ajax.
		 */

	}

}
