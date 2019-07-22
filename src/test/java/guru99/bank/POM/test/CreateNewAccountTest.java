package guru99.bank.POM.test;

import java.util.Arrays;

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

import guru99.bank.POM.pages.AccountPage;
import guru99.bank.POM.pages.AccountRegSuccessfullyPage;
import guru99.bank.POM.pages.LoginPage;
import guru99.bank.POM.pages.NavigationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(DataProviderRunner.class)
public class CreateNewAccountTest {

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
	public static Object[][] accountDetails() {
		return new Object[][] { { "1167", "Current", "500" } };
	}

	@Test()
	@UseDataProvider("accountDetails")
	public void createNewAccount(String customerId, String accountType, String initialDeposit) {
		// Navigate to Customer page
		NavigationPage nav = PageFactory.initElements(driver, NavigationPage.class);
		nav.navigateTo("New Account");

		AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
		accountPage.createNewAccount(customerId, accountType, initialDeposit);

		AccountRegSuccessfullyPage accountSuccessful = PageFactory.initElements(driver,
				AccountRegSuccessfullyPage.class);
		System.out.println(accountSuccessful.getSuccessfulMessage());
		System.out.println(Arrays.toString(accountSuccessful.getRegisteredAccountDetails()));

	}

	@After
	public void afterTest() {
		driver.quit();
	}
}
