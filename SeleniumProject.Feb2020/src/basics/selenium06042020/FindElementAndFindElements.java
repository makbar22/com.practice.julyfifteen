package basics.selenium06042020;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElements {

	public static void main(String[] args) {

		// Set system property
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		// Create an obj of WebDriver
		WebDriver driver = new ChromeDriver();

		// Maximize Browser
		driver.manage().window().maximize();

		// Set page load timeout
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// Set implicit wait for 20 second
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Delete Cookies
		driver.manage().deleteAllCookies();

		// Open Test Environment
		driver.get("http://tek-school.com/retail/");

		// findElement - explanation on OneNote 06/04/2020
		WebElement desktops = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and text()='Desktops']"));
		desktops.click();

		// findElements - list because
		List<WebElement> allLinks = driver.findElements(By.tagName("a")); // a tag contains all the links

		System.out.println(allLinks.size()); // to find the number of links on the page

		for (int i = 0; i < allLinks.size(); i++) { // iterate through all
			String textOfElements = allLinks.get(i).getText(); // iterates and returns the text for each link. We store
																// it in a String because it's string
			System.out.println(textOfElements);

			if (textOfElements.equals("Desktop")) {
				allLinks.get(i).click();
				break; // to exit the iteration of loop

			}

		}

		// take screenshot of page we opened
		String outputpath = "C:\\Users\\murta\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\"; // we need to
																										// right click
																										// on the
																										// package and
																										// create a new
																										// folder so
																										// that it will
																										// be stored in
																										// the output
																										// folder. Make sure put \\ after the path so it stores inside the output folder
		ScreenShotUtility.screenShot(driver, outputpath, "TestEnvScreenshot");
	}
}
