package basics.selenium06072020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		String url = "http://tek-school.com/retail/";
		driver.get(url);

		// Create object of Action class
		Actions action = new Actions(driver);

		// Navigate to drag and drop page
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Thread.sleep(5000);
		action.dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);

		driver.close();
	}

}
