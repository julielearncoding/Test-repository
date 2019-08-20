package guru99.bank.POM.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import guru99.bank.POM.pages.AccountPage;
import guru99.bank.POM.pages.AccountRegSuccessfullyPage;
import guru99.bank.POM.pages.LoginPage;
import guru99.bank.POM.pages.NavigationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewAccountTest {

	WebDriver driver;

	@BeforeSuite
	public void beforeTest() {
		// Download the web driver executable
		WebDriverManager.chromedriver().setup();

		// Create a instance of your web driver - chrome
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch the site
		driver.get("http://demo.guru99.com/v4/");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("mngr217444", "asybypE");
	}

	@Test(dataProvider = "accountDetails")
	public void createNewAccount(String customerId, String accountType, String initialDeposit) {
		// Navigate to Customer page
		NavigationPage nav = PageFactory.initElements(driver, NavigationPage.class);
		nav.navigateTo("New Account");

		AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
		accountPage.createNewAccount(customerId, accountType, initialDeposit);

		AccountRegSuccessfullyPage accountSuccessful = PageFactory.initElements(driver,
				AccountRegSuccessfullyPage.class);
		System.out.println(accountSuccessful.getSuccessfulMessage());
		System.out.println((accountSuccessful.getRegisteredAccountDetails()));

	}

	@DataProvider
	public static Object[][] accountDetails() {
		return new Object[][] { { "1167", "Current", "500" } };
	}
	
	@AfterSuite
	public void afterTest() {
		driver.quit();
	}
}
