package guru99.bank.POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegSuccessfullyPage {

	@FindBy(css = "#account > tbody")
	WebElement tbody;

	public String getData(int row, int col) {
		String data = tbody.findElement(By.cssSelector("tr:nth-child(" + row + ") > td:nth-child(" + col + ")"))
				.getText();
		return data;
	}

	public String getSuccessfulMessage() {
		return getData(1, 1);
	}

	public String getAccountId() {
		return getData(4, 2);
	}

	public String getCustomerId() {
		return getData(5, 2);
	}

	public String getCustomerName() {
		return getData(6, 2);
	}

	public String getEmail() {
		return getData(7, 2);
	}

	public String getAccountType() {
		return getData(8, 2);
	}

	public String getDateOfOpening() {
		return getData(9, 2);
	}

	public String getCurrentAmount() {
		return getData(10, 2);
	}

	public Object[][] getRegisteredAccountDetails() {
		Object[][] data = null;
		data[0][1] = getCustomerId();
		data[0][2] = getCustomerName();
		return data;
	}

}