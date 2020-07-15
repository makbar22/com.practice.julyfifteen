package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import core.Base;
import pageObj.CreatAccountPageObj;
import pageObj.HotelLoginPageObj;
import utilities.ExcelUtility;

@Listeners(utilities.TestNGListeners.class)
public class CreateAccount extends Base {

	HotelLoginPageObj hotelPageObj;
	CreatAccountPageObj creatAccountPageObj;

	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
		logger.info("Browser opened successfully");
	}

	@Test(dataProvider = "getInfoData")
	public void creatAccount(String email, String title, String firstname, String lastname, String password, String day,
			String month, String year) {

		hotelPageObj = new HotelLoginPageObj();
		creatAccountPageObj = new CreatAccountPageObj();
		hotelPageObj.clickOnSignIn();
		logger.info("User clicked on Sign In");
		creatAccountPageObj.enterCreateEmail(email);
		logger.info("User entered email " + email);
		creatAccountPageObj.clickOnCreateAnAccount();
		logger.info("User clicked on Creat Account");
		creatAccountPageObj.selectTitle(title);
		logger.info("User selected Title " + title);
		creatAccountPageObj.fillPersonalInformation(firstname, lastname, password, email);
		logger.info("User filled personal information");
		creatAccountPageObj.dateOFBirthInfo(day.substring(0, 1), month.substring(0,1), year.substring(0,4));	//we use substring because excel return decimal for some reason
		
		logger.info("User filled Date of Birth");
		creatAccountPageObj.registerAccount();
		logger.info("User clicked on Register Account");
	}

	public Object[][] getInfoData() {
		Object data[][] = ExcelUtility.getExcelData("info");
		return data;

	}

	@AfterMethod
	public void afterMethod() {
		Base.tearDown();
		logger.info("Browser closed successfully");
	}
}
