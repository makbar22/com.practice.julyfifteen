package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.DriverUtility;

public class RegisterPageObj extends Base {

	public RegisterPageObj() {
		PageFactory.initElements(driver, this); // this give reference to this class
	}

	@FindBy(how = How.XPATH, using = "(//a[text()='Register'])[1]")
	private WebElement register;

	@FindBy(how = How.XPATH, using = "//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(how = How.XPATH, using = "//input[@id='input-lastname']")
	private WebElement lasttNameField;

	@FindBy(how = How.XPATH, using = "//input[@id='input-email']")
	private WebElement emailField;

	@FindBy(how = How.XPATH, using = "//input[@id='input-telephone']")
	private WebElement telephoneField;

	@FindBy(how = How.XPATH, using = "//input[@id='input-password']")
	private WebElement passwordField;

	@FindBy(how = How.XPATH, using = "//input[@id='input-confirm']")
	private WebElement passwordConfirmField;

	@FindBy(how = How.XPATH, using = "(//input[@name='newsletter'])[1]")
	private WebElement yesSubscibe;

	@FindBy(how = How.XPATH, using = "(//input[@name='newsletter'])[2]")
	private WebElement noSubscibe;

	@FindBy(how = How.XPATH, using = "//input[@name='agree']")
	private WebElement privacyPolicy;

	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
	private WebElement continueButtonReg;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Your Account Has Been Created!')]")
	private WebElement yourAcctCreatedMessage;

	// create methods
	public void clickOnRegister() {
		DriverUtility.clickOnElement(register); // we user DriverUtility methods to reduce redundancy
	}

	public void enterFNameValue(String fName) {
		DriverUtility.enterText(firstNameField, fName);
	}

	public void enterLNameValue(String lName) {
		DriverUtility.enterText(lasttNameField, lName);
	}

	public void enterEmailValue(String email) {
		DriverUtility.enterText(emailField, email);
	}

	public void entertelephoneValue(String telephone) {
		DriverUtility.enterText(telephoneField, telephone);
	}

	public void enterPasswordValue(String passord) {
		DriverUtility.enterText(passwordField, passord);

	}

	public void passwordConfirmValue(String passwordConf) {
		DriverUtility.enterText(passwordConfirmField, passwordConf);
	}

	public boolean noIsSelected() {
		if (noSubscibe.isSelected()) {
			return true;
		} else {
			return false;
		}
	}

	public void selectYesonSubscribe() {
		DriverUtility.clickOnElement(yesSubscibe);
	}

	public void selectNoSubscribe() {
		DriverUtility.clickOnElement(noSubscibe);
	}

	public boolean isPrivacyPolicyDisplayed() {
		boolean displayed = DriverUtility.isElementDisplayed(privacyPolicy);
		return displayed;
	}

	public void clickonPrivacyPolicy() {
		DriverUtility.clickOnElement(privacyPolicy);
	}

	public void clickonContinueButtonREG() {

		DriverUtility.clickOnElement(continueButtonReg);
	}

	public String getSuccessfullAcctCreationMessage() {
		String acctCreationMessage = DriverUtility.getText(yourAcctCreatedMessage);
		return acctCreationMessage;
	}

}