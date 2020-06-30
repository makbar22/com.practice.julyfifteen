package ramin06132020;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	//outputType will store it in a folder after it executes the screenshot
		Files.copy(src, new File("C:\\Users\\murta\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\Practice.png"));

		driver.close();
	}



	
	
}
