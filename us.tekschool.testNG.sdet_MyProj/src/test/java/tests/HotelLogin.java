package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.Base;
import pageObj.HotelLoginPageObj;
import utilities.DriverUtility;

public class HotelLogin extends Base {
	// declare HotelLoginPageObj
	HotelLoginPageObj hotelPageObj;

	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
		logger.info("Browser opened successfully");
	}

	@Test (priority = 2)
	public void loginToHotelPage() {
		hotelPageObj = new HotelLoginPageObj();

		hotelPageObj.clickOnSignIn();
		logger.info("User clicked on Sign In");

		hotelPageObj.enterEmail(getUserName());
		logger.info("user entered email address");
		hotelPageObj.enterPassword(getPassword());
		logger.info("user entered password");
		hotelPageObj.clickOnSignInButton();
		logger.info("user clicked on sign in button");
		DriverUtility.wait(5000);
		DriverUtility.screenShot();

	}

	@Test (priority = 1)
	@Parameters ({"username", "password"})
	public void loginWithParameters(String userName, String password) {
		hotelPageObj = new HotelLoginPageObj();

		hotelPageObj.clickOnSignIn();
		logger.info("User clicked on Sign In");

		hotelPageObj.enterEmail(userName);
		logger.info("user entered email address from parameters");
		hotelPageObj.enterPassword(password);
		logger.info("user entered password from parameters");
		hotelPageObj.clickOnSignInButton();
		logger.info("user clicked on sign in button");
		DriverUtility.wait(5000);
		DriverUtility.screenShot();
	}
	
	@Test (priority = 4)
	public void testThree() {
		logger.info("This is just a sample test 3");
	}
	
	@Test (priority = 3)
	@Ignore
	public void testFour() {
		logger.info("This is just a sample test 4");
	}
	
	@Test (priority = 6, enabled = false)
	public void testFive() {
		logger.info("This is just a sample test 5");
	}
	
	@Test (priority = 5, enabled = false)
	public void testSix() {
		logger.info("This is just a sample test 6");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		Base.tearDown();
		logger.info("Browser closed successfully");
	}

}
