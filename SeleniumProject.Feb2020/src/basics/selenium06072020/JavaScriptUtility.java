package basics.selenium06072020;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {

	// javaScriptExecutor is:

	// create static methods

	// scrollPageDown using javaScript Executor
	public static void scrollPageDownWithJS(WebDriver driver) {

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
	public static void sendKeysWithJS(WebDriver driver, String element, String value) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementById('" + element + "').value='" + value + "'");

	}

	// select calendar date using JSExecutor
	public static void selectCalendarWithJS(WebDriver driver, String date, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + date + "');", element);

	}
}