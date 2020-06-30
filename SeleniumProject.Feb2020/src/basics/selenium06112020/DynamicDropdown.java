package basics.selenium06112020;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import basics.selenium06072020.JavaScriptUtility;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		String url = "https://www.aa.com/homePage.do";
		driver.get(url);

		// 1. Get locator of element by xpath, class, etc.
		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));

		// 2. Use find element
		// 3. Click on the element
		from.click();
		// 4. Clear the value of element
		from.clear();
		
		Thread.sleep(3000);
		// 5. Type value using sendKeys
		from.sendKeys("wash");
		// 6. Once dynamic dropdown list is opened

		// 7. Store all values of dropdown in a list - We find the parent and we move to
		// child and grandchild //ul[@id='ui-id-1']/li/a
		List<WebElement> departure = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));

		// 8. Write a loop or iterator
		for (WebElement city : departure) {

			// 9. Inside the loop you write an if condition
			try {
				if (city.getText().trim().contains("WAS")) // .trim will remove extra space
					JavaScriptUtility.clickElementWithJS(city, driver);
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();

			}
		}
			Thread.sleep(5000);

			// arrival to las vegas
			// 2. Use find element
			WebElement to = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));

			// 3. Click on the element
			to.click();

			// 4. Clear the value of element
			to.clear();

			// 5. Type value using sendKeys
			to.sendKeys("las");

			// 6. Once dynamic dropdown list is opened
			// 7. Store all values of dropdown in a list - We find the parent and we move to
			// child and grandchild //ul[@id='ui-id-2']/li
			List<WebElement> arrival = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));

			// 8. Write a loop or iterator
			for (WebElement cityArrival : arrival) {
				try {
					if (cityArrival.getText().trim().contains("LAS"))
						JavaScriptUtility.clickElementWithJS(cityArrival, driver);
				} catch (StaleElementReferenceException e) {
					e.printStackTrace();
				}
			}
			Thread.sleep(3000);

			// select passengers from static dropdown
			WebElement numPassenger = driver
					.findElement(By.xpath("//*[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
			Select select = new Select(numPassenger);

			// select 9 pass
			select.selectByVisibleText("9");

			Thread.sleep(3000);

			// calendar
			WebElement departureDate = driver.findElement(By.xpath("//input[@name='departDate']"));
			WebElement arrivalDate = driver.findElement(By.xpath("//input[@name='returnDate']"));
			WebElement searchButton = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
			
			// departure date 06/20/2020
			String depDate = "06/20/2020";
			String retDate = "07/31/2020";

			JavaScriptUtility.selectCalendarWithJS(driver, depDate, departureDate);
			JavaScriptUtility.selectCalendarWithJS(driver, retDate, arrivalDate);

			Thread.sleep(3000);

			searchButton.click();

		}
	}


// 10. You write logical operator to click on value
// 11. For click you can use JSExecutor or .click() method
