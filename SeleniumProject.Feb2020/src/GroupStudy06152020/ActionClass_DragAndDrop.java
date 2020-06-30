package GroupStudy06152020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		System.out.println(driver.getTitle());
		
		Actions action = new Actions(driver);
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(3000);
		action.dragAndDrop(draggable, droppable).build().perform();
		
	}

}
