package basics.selenium06092020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		/*
		 * Pass username and Password in url to bypass authentication popup syntax:
		 * http://<username>:<password>@<rest of the url after http>
		 */

		String username = "admin";
		String password = "admin";

		String url = "http://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";

		System.out.println(url);

		driver.get(url);
		System.out.println(driver.getTitle());

	}
}
