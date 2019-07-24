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

import guru99.bank.POM.pages.DepositPage;
import guru99.bank.POM.pages.DepositRegSuccessfullyPage;
import guru99.bank.POM.pages.LoginPage;
import guru99.bank.POM.pages.NavigationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(DataProviderRunner.class)
public class DepositTest {

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
	public static Object[][] depositDetails() {
		return new Object[][] { { "65827", "100", "Deposit More" } };
	}

	@Test
	@UseDataProvider("depositDetails")
	public void depositToAccount(String accountNumber, String amount, String description) {
		// Navigate to Customer page
		NavigationPage nav = PageFactory.initElements(driver, NavigationPage.class);
		nav.navigateTo("Deposit");

		DepositPage depositPage = PageFactory.initElements(driver, DepositPage.class);
		depositPage.depositToAccount(accountNumber, amount, description);

		DepositRegSuccessfullyPage depositSuccessful = PageFactory.initElements(driver,
				DepositRegSuccessfullyPage.class);
		System.out.println(depositSuccessful.getSuccessfulMessage());
		System.out.println(depositSuccessful.getRegisteredDepositDetails());
	}

	@After
	public void afterTest() {
		driver.quit();
	}

}
