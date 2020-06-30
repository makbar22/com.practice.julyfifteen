package basics.selenium06092020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		String url = "http://www.londonfreelance.org/courses/frames/index.html";
		driver.get(url);

		// switch to different frames and print their titles

		WebElement headerFrame = driver.findElement(By.xpath("//frame[@name='main']"));
		driver.switchTo().frame(headerFrame);
		// or use the String argument: driver.switchTo().frame("main");

		WebElement header = driver.findElement(By.xpath("//h2[text()='Title bar ']"));
		System.out.println(header.getText()); // print the title

		// Practice - go to navigation frame, click on home and then go to footer frame
		// and print the title

		
		//First we need to switch to default to come out of the previous frame to default html content
		driver.switchTo().defaultContent(); 
		//1.Go to Navigation frame
		WebElement navFrame = driver.findElement(By.xpath("//frame[@name='navbar']"));	
		driver.switchTo().frame(navFrame);
		
		//2.Click on home and print the title
		WebElement home = driver.findElement(By.xpath("/html/body/p[2]/a"));
		home.click();
		System.out.println(home.getText());

		//3.Switch back to default html content
		driver.switchTo().defaultContent();

		//4.Go to Footer frame
		WebElement footerFrame = driver.findElement(By.xpath("//frame[@name='bot']"));
		driver.switchTo().frame(footerFrame);

		//5.Click on Footer and print it's title
		WebElement footer = driver.findElement(By.xpath("//h2[text()='Footer ']"));
		footer.click();
		System.out.println(footer.getText());

		driver.quit();

	}
}
