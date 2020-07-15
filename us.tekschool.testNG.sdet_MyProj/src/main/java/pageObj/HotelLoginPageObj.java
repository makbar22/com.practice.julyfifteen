package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.DriverUtility;

public class HotelLoginPageObj extends Base {

	public HotelLoginPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[@class='hide_xs']")
	private WebElement signIn;
	// find WebElement of email field
	@FindBy(how = How.ID, using = "email")
	private WebElement emailAddress;

	// find WebElement of password field
	@FindBy(how = How.ID, using = "passwd")
	private WebElement password;
	// find WebElement of login button
	@FindBy(how = How.XPATH, using = "//*[@id=\"SubmitLogin\"]/span")
	private WebElement signInButton;
	// actual methods

	public void clickOnSignIn() {
		signIn.click();

	}

	public void enterEmail(String emailID) {
		DriverUtility.enterText(emailAddress, emailID);

	}

	public void enterPassword(String passwordID) {
		DriverUtility.enterText(password, passwordID);

	}

	public void clickOnSignInButton() {
		signInButton.click();

	}
}
