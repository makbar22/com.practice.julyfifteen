package basics.selenium06072020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		
		String url ="http://tek-school.com/retail/";
		driver.get(url);
		
		//Create object of Action class
		Actions action = new Actions(driver);
		
		//Create WebElement using xpath for Component element of UI
		WebElement component = driver.findElement(By.xpath("//a[text()='Components']"));
		
		//Using moveElement action method move your mous to that element
		action.moveToElement(component).build().perform();
		Thread.sleep(5000);
		
		//Double click on Component element
		action.doubleClick().build().perform();
		Thread.sleep(5000);
		
		//Right click on component element
		action.contextClick().build().perform();
		Thread.holdsLock(5000);
		
		//Move to bottom of the page to Terms & Condition link
		WebElement termsCondition = driver.findElement(By.xpath("//a[text()='Terms & Conditions']"));
		
		//Double click on Terms and Condition
		action.moveToElement(termsCondition).build().perform();
		Thread.holdsLock(5000);
		
		action.contextClick(termsCondition).build().perform();
		Thread.holdsLock(5000);
		
		driver.close();
		
	}

}
