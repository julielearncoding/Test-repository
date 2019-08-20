package guru99.bank.POM.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import guru99.bank.POM.pages.DepositPage;
import guru99.bank.POM.pages.DepositRegSuccessfullyPage;
import guru99.bank.POM.pages.NavigationPage;
import guru99.bank.POM.util.TestBase;

public class DepositTest extends TestBase {

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
	
}
