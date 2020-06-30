package GroupStudy06152020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();		

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://tek-school.com/retail/");
		System.out.println(driver.getTitle());
		
		Actions action = new Actions(driver);
		
		WebElement camera = driver.findElement(By.xpath("//a[text()='Cameras']"));
		Thread.sleep(5000);
		//action.moveToElement(camera).build().perform();
		action.contextClick(camera).build().perform();		//action class have to always use build().perform()
		
		Thread.sleep(5000);
		WebElement showAll = driver.findElement(By.xpath("//a[text()='Show All Cameras']"));
		showAll.click();	//select class
		Thread.sleep(5000);
	}

}
