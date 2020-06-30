package basics.selenium06072020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import basics.selenium06042020.ScreenShotUtility;

public class UserStoryPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/retail/");

		WebElement laptopsAndNotebooks = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		laptopsAndNotebooks.click();

		WebElement showAll = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
		showAll.click();

		WebElement sortBy = driver.findElement(By.xpath("//select[@id='input-sort' and @class='form-control']"));
		sortBy.click();

		Select sortByAtoZ = new Select(sortBy);
		sortByAtoZ.selectByVisibleText("Name (A - Z)");

		WebElement show = driver.findElement(By.xpath("//select[@id='input-limit' and @class='form-control']"));
		show.click();

		Select selectShow = new Select(show);
		selectShow.selectByVisibleText("100");

		String outputpath = "C:\\Users\\murta\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\";
		ScreenShotUtility.screenShot(driver, outputpath, "UserStoryPractice");

		Thread.sleep(5000);

		driver.quit();

	}
}
