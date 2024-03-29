package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;


public class DriverUtility extends Base {

	// utility method to select from drop down by visible text

	public static void selectByVisibleText(WebElement ele, String text) {
		Select select = new Select(ele);
		select.selectByVisibleText(text);
	}

	public static void selectByValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByValue(value);

	}

	public static void selectByIndex(WebElement ele, int index) {
		Select select = new Select(ele);
		select.selectByIndex(index);
	}

	public static void clickOnElement(WebElement ele) {
		ele.click();
	}

	public static void enterText(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public static void waitForAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());

	}

	public static void wait(int milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void verifyElementisDisplayed(WebElement ele) {
	//	Assert.assertTrue("Element is Displayed", isElementDisplayed(ele));

	}

	public static boolean isElementDisplayed(WebElement ele) {
		if (ele.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isElementEnabled(WebElement ele) {
		if (ele.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public static void moveToElementAction(WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();

	}

	public static void scrollToElementAction(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);

	}

	public static void switchToWindow() {
		Set<String> WindowsHandles = driver.getWindowHandles();
		Iterator<String> it = WindowsHandles.iterator();

		String window = it.next();
		driver.switchTo().window(window);

	}

	public static void clearTextUsingSendKeys(WebElement ele) {
		ele.sendKeys(Keys.CONTROL + "a");
		ele.sendKeys(Keys.DELETE);

	}

	public static void clearText(WebElement ele) {
		ele.clear();

	}

	// Java Script Utilities

	// javaScriptExecutor is:

	// create static methods

	// scrollPageDown using javaScript Executor
	public static void scrollPageDownWithJS() {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scroll is the the bottom of the page(0)

	}
	// click on element using JSExecutor

	public static void clickElementWithJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

	// sendkeys using JSExecutor
	// we can use SendKeys with JSExecutor if WebElement has either one of ID, Name
	// or Class at
	public static void sendKeysWithJS(String element, String value) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementById('" + element + "').value='" + value + "'");

	}

	// select calendar date using JSExecutor
	public static void selectCalendarWithJS(String date, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + date + "');", element);

	}

	public static String getText(WebElement ele) {
		String ElementText = ele.getText();
		return ElementText;

	}

	public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement);

	}

	public static String screenShotFileName() {
		Date date = new Date();
		String screenShotName = date.toString().replace(":", "_").replace(" ", "_") + ".png";
		return screenShotName;
	}

	public static void screenShot() {

		// Take Screenshot
		// Store Screenshot in a folder or location
		String location = System.getProperty("user.dir") + "\\screenshots\\";
		String screenShotFileName = screenShotFileName();
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // takes screenshot

		try {
			FileUtils.copyFile(file, new File(location + screenShotFileName + ".png")); // executes the code
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in execution");
		}

	}
}
