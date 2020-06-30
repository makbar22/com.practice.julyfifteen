package GroupStudy06152020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClass_UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://xndev.com/display-image/");

		WebElement apploadFile = driver.findElement(By.xpath("//input[@type='file']"));

		String filePath = "C:\\Users\\murta\\Downloads\\BDD Framework and POM design pattern Blue Print.jpg";
		apploadFile.sendKeys(filePath);
	}

}
