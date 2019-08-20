package guru99.bank.POM.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.tngtech.java.junit.dataprovider.DataProvider;

import guru99.bank.POM.pages.DepositPage;
import guru99.bank.POM.pages.DepositRegSuccessfullyPage;
import guru99.bank.POM.pages.LoginPage;
import guru99.bank.POM.pages.NavigationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DepositTest {

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

	@Test (dataProvider = "depositDetails")
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

	@DataProvider
	public static Object[][] depositDetails() {
		return new Object[][] { { "65827", "100", "Deposit More" } };
	}
	
	@AfterSuite
	public void afterTest() {
		driver.quit();
	}

}
