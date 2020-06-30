package basics.selenium06072020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		String url = "https://xndev.com/display-image/";
		driver.get(url);

		// We need to find a Locator of WebElement
		WebElement uploadFile = driver.findElement(By.xpath("//*[@id=\"post-2554\"]/div/input"));
		Thread.sleep(5000);
		String filePath = "C:\\Users\\murta\\Downloads\\Test.xlsx";

		uploadFile.sendKeys(filePath);
		Thread.sleep(5000);

		driver.close();
	}
}
