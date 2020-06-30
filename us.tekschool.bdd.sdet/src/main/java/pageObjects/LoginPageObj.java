package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObj extends Base {

	// create a constructor

	public LoginPageObj() {

		// we will use initElements to initialize all webElements in this page
		PageFactory.initElements(driver, this);
	}

	// store webElements for myAccount
	// @FindBy annotation used in pageFactory to find WebElement
	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	private WebElement myAccount;

	// store webElements for login
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Login')]")
	private WebElement login;

	// store webElements for email
	@FindBy(how = How.ID, using = "input-email")
	private WebElement email;

	// store webElements for password
	@FindBy(how = How.ID, using = "input-password")
	private WebElement password;

	// store webElements for loginButton
	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
	private WebElement loginButton;

	// store webElements for logoutButton
	@FindBy(how = How.XPATH, using = "(//a[text()='Logout'])[2]")
	private WebElement logoutButton;

	// start writing methods
	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLogin() {
		login.click();
	}

	public void enterEmail(String emailAddress) { // in order to not hard code it, we will add a String so we can have
													// different emails
		email.clear();
		email.sendKeys(emailAddress);
	}

	public void enterPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();

	}

	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;

	}

	public void clickOnLogoutButton() {
		logoutButton.click();
	}

}