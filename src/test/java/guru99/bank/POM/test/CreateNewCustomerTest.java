package guru99.bank.POM.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import guru99.bank.POM.pages.CustomerPage;
import guru99.bank.POM.pages.CustomerRegSuccessfullyPage;
import guru99.bank.POM.pages.LoginPage;
import guru99.bank.POM.pages.NavigationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(DataProviderRunner.class)
public class CreateNewCustomerTest {

	WebDriver driver;

	@Before
	public void beforeTest() {
		// Download the web driver executable
		WebDriverManager.chromedriver().setup();

		// Create a instance of your web driver - chrome
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch the site
		driver.get("http://demo.guru99.com/v4/");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("mngr210803", "ugUzAbE");
	}

	@DataProvider
	public static Object[][] customerDetails() {
		return new Object[][] { { "customerName", "female", "01/01/1984", "address", "city", "state", "123456",
				"0909123456", "tinklebell16@gmail.com", "123456" } };
	}

	@Test()
	@UseDataProvider("customerDetails")
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

	@After
	public void afterTest() {
		driver.quit();
	}
}
