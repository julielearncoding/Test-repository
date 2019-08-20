package guru99.bank.POM.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import guru99.bank.POM.pages.AccountPage;
import guru99.bank.POM.pages.AccountRegSuccessfullyPage;
import guru99.bank.POM.pages.NavigationPage;
import guru99.bank.POM.util.TestBase;

public class CreateNewAccountTest extends TestBase {

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

}
