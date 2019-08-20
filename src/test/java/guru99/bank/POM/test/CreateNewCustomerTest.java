package guru99.bank.POM.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import guru99.bank.POM.pages.CustomerPage;
import guru99.bank.POM.pages.CustomerRegSuccessfullyPage;
import guru99.bank.POM.pages.NavigationPage;
import guru99.bank.POM.util.TestBase;

public class CreateNewCustomerTest extends TestBase {

	@Test(dataProvider = "customerDetails")
	public void createNewCustomer(String customerName, String gender, String dateOfBirth, String address, String city,
			String state, String pinNumber, String mobileNumber, String email, String password) {

		// Navigate to Customer page
		NavigationPage nav = PageFactory.initElements(driver, NavigationPage.class);
		nav.navigateTo("New Customer");

		CustomerPage customerPage = PageFactory.initElements(driver, CustomerPage.class);
		customerPage.submitCustomerDetails(customerName, gender, dateOfBirth, address, city, state, pinNumber,
				mobileNumber, email, password);

		CustomerRegSuccessfullyPage customerSuccessful = PageFactory.initElements(driver,
				CustomerRegSuccessfullyPage.class);

		System.out.println(customerSuccessful.getSuccessfulMessage());
		System.out.println((customerSuccessful.getRegisteredCustomerDetails()));
	}


	@DataProvider
	public static Object[][] customerDetails() {
		return new Object[][] { { "customerName", "female", "01/01/1984", "address", "city", "state", "123456",
				"0909123456", "tinklebell16@gmail.com", "123456" } };
	}

}
