package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.RegisterPageObj;
import utilities.DriverUtility;

public class RegisterStepDefinition extends Base {

	RegisterPageObj registerPageObj = new RegisterPageObj();

	@When("^User click on Register$")
	public void user_click_on_Register() throws Throwable {
		try {
			registerPageObj.clickOnRegister();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		DriverUtility.screenShot();
	}

	@When("^User fills Register form with below information$")
	public void user_fills_Register_form_with_below_information(DataTable personalInfo) throws Throwable {
//		List<List<String>> dataValues = personalInfo.raw();
//		registerPageObj.enterFNameValue(dataValues.get(0).get(0));
//		registerPageObj.enterLNameValue(dataValues.get(0).get(1));
//		registerPageObj.enterEmailValue(dataValues.get(0).get(2));
//		registerPageObj.entertelephoneValue(dataValues.get(0).get(3));
//		registerPageObj.enterPasswordValue(dataValues.get(0).get(4));
//		registerPageObj.passwordConfirmValue(dataValues.get(0).get(4));
//		logger.info("Register Form was filled successfully");

		// when we use List<List> for processing DataTables we use .raw method
		// when we use List<Map> for processing DataTables we use .asMaps(String.class,
		// String.class)
		// also if the data on feature file doesn't have heather we use list, if it does
		// then we use list
		List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);
		registerPageObj.enterFNameValue(dataValues.get(0).get("firstName"));
		// write codes for rest of the fields - lastname, email, etc...
		registerPageObj.enterLNameValue(dataValues.get(0).get("LastName"));
		registerPageObj.enterEmailValue(dataValues.get(0).get("E-mail"));
		registerPageObj.entertelephoneValue(dataValues.get(0).get("Telephone"));
		registerPageObj.enterPasswordValue(dataValues.get(0).get("password"));
		registerPageObj.passwordConfirmValue(dataValues.get(0).get("password"));
		DriverUtility.screenShot();
	}

	@When("^User select '(.+)' for Subscribe$")
	public void user_select_yes_for_Subscribe(String yesNo) throws Throwable {
		if (yesNo.equalsIgnoreCase("yes")) {
			if (registerPageObj.noIsSelected()) {
				registerPageObj.selectYesonSubscribe();
				logger.info("Yes to subscibe is selected");
			}
		} else {
			if (!registerPageObj.noIsSelected()) {
				registerPageObj.selectNoSubscribe();
				logger.info("No to subscibe is selected");
			}
		}
		DriverUtility.screenShot();
	}

	@When("^User click privacy and policy button$")
	public void user_click_privacy_and_policy_button() throws Throwable {
		Assert.assertTrue(registerPageObj.isPrivacyPolicyDisplayed());
		registerPageObj.clickonPrivacyPolicy();
		logger.info("Privacy Policy is selected");
		DriverUtility.screenShot();

	}

	@And("^User click Continue button$")
	public void User_click_Continue_button() throws Throwable {
		try {
			registerPageObj.clickonContinueButtonREG();
			logger.info("Continue button clicked");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

		DriverUtility.screenShot();
	}

	@Then("^User should see message '(.+)'$")
	public void user_should_see_message_Your_Account_Has_Been_Created(String message) throws Throwable {
		DriverUtility.wait(5000);
		Assert.assertEquals(registerPageObj.getSuccessfullAcctCreationMessage(), message);
		logger.info("Assertion passed");
		DriverUtility.screenShot();
	}
}
