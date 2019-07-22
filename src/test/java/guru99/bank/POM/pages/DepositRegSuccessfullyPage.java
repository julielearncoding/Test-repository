package guru99.bank.POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositRegSuccessfullyPage {

	@FindBy(css = "#deposit > tbody")
	WebElement tbody;

	public String getData(int row, int col) {
		String data = tbody.findElement(By.cssSelector("tr:nth-child(" + row + ") > td:nth-child(" + col + ")"))
				.getText();
		return data;
	}

	public String getSuccessfulMessage() {
		return getData(1, 1);
	}

	public String getTransactionId() {
		return getData(6, 2);
	}

	public String getAccountNo() {
		return getData(7, 2);
	}

	public String getAmountCredited() {
		return getData(8, 2);
	}

	public String getTypeOfTransaction() {
		return getData(9, 2);
	}

	public String getDescription() {
		return getData(10, 2);
	}

	public String getCurrentBalance() {
		return getData(11, 2);
	}

	public Object[][] getRegisteredDepositDetails() {
		Object[][] data = null;

		return data;
	}

}
