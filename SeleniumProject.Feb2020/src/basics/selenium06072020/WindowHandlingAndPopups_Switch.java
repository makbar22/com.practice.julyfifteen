package basics.selenium06072020;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAndPopups_Switch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		String url = "https://ksrtc.in/oprs-web/";
		driver.get(url);

		// Handle window pop ups
		// Switch method and then Alert method
		// We can either accept an alert or deny if decline option is available
		// We can print out the alert message too
		WebElement searchBus = driver
				.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		searchBus.click();

		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(5000);

		driver.switchTo().alert().accept();
//		Thread.sleep(5000);

		String pageTitle;

		pageTitle = driver.getTitle();
		System.out.println("This is before switching windows: " + pageTitle);

		// Click on CRM element on UI
		WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
		crm.click();

		// Switching between parent and child windows
		Set<String> windowsHandles = driver.getWindowHandles();

		// Iterate through the SET to next index
		Iterator<String> it = windowsHandles.iterator();

		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow); // we are already on parent window
		pageTitle = driver.getTitle();
		System.out.println("This is after switching window: " + pageTitle);

		driver.switchTo().window(parentWindow);
		System.out.println("This is after we switched back to the main window: " + driver.getTitle());
		Thread.sleep(3000);

		driver.quit();

	}
}
