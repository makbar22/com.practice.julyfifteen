package GroupStudy06152020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// Select Class

		System.setProperty("Hash1", "C:\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		System.out.println("This is the title " + driver.getTitle());

		WebElement fName = driver.findElement(By.xpath("//input[@id='u_0_m']"));
		fName.click();
		fName.clear();
		fName.sendKeys("John");

		WebElement lName = driver.findElement(By.xpath("//input[@id='u_0_o']"));
		lName.click();
		lName.clear();
		lName.sendKeys("Herris");
		Thread.sleep(1000);

		WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='u_0_r']"));
		phoneNumber.click();
		phoneNumber.clear();
		phoneNumber.sendKeys("5719929909");
		Thread.sleep(3000);

		WebElement passWord = driver.findElement(By.xpath("//input[@id='u_0_w']"));
		passWord.click();
		passWord.clear();
		passWord.sendKeys("@@Car123$");

		Select select;

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		select = new Select(month);
		select.selectByVisibleText("Sep");

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		select = new Select(day);
		select.selectByVisibleText("20");

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		select = new Select(year);
		select.selectByVisibleText("1983");

		WebElement gender = driver.findElement(By.xpath("//input[@id='u_0_7']"));
		gender.click();

		WebElement button = driver.findElement(By.xpath("//button[@id='u_0_13']"));
		button.click();
		Thread.sleep(3000);

	}

}
