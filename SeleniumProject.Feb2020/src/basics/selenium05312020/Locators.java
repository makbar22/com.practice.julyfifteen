package basics.selenium05312020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		// 1. By.id fastest locator, usually id is unique
		// 2. By.name
		// 3. By.className
		// 4. By.xpath slow but you can travel from parent to child and child to parent
		// and sibilings
		// 5. By.linkText
		// 6. By.Cssselector faster

		/*
		 * Syntax for locators WebElement elementName =
		 * driver.findElement(By.id("value of ID")); WebElement elementName =
		 * driver.findElement(By.name("value of name")); WebElement elementName =
		 * driver.findElement(By.className("value of class")); WebElement elementName =
		 * driver.findElement(By.cssSelector("value of cssSelector")); WebElement
		 * elementName = driver.findElement(By.xpath("value of xpath")); WebElement
		 * elementName = driver.findElement(By.linkText("value of linklist"));
		 */

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// by id
		WebElement username = driver.findElement(By.id("email"));

		// by name
		WebElement username = driver.findElement(By.name("email"));

		// by class name
		WebElement username = driver.findElement(By.className("inputtext login_form_input_box"));

		/*
		 * by xpath Syntax for xpath: syntax for xpath //tag[@attribute='value']
		 * Interview: Types of xpath: 1. Absolute xpath: starts with singe slash (/);
		 * starts from head of the HTML and goes all the to element location; not
		 * recommended for automation at all because it travels from parent to child and
		 * if developer change something in the code, it will not work 2. Relative
		 * xpath: starts with double slash (//), starts mainly from element tag; 95%
		 * used in automation - UI Automation.
		 */
		// by relative xpath
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

		// by CSS selector - syntax: tag[attribute=value] for id, name and class
		WebElement username = driver.findElement(By.cssSelector("input[name='email']"));
	
	}

}
