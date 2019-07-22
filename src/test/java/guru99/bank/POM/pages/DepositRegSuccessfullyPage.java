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
		return getData(12, 2);
	}

	public String getTypeOfTransaction() {
		return getData(16, 2);
	}

	public String getDescription() {
		return getData(20, 2);
	}

	public String getCurrentBalance() {
		return getData(23, 2);
	}

	public String[] getRegisteredDepositDetails() {
		String[] data = new String[6];
		data[0] = this.getTransactionId();
		data[1] = this.getAccountNo();
		data[2] = this.getAmountCredited();
		data[3] = this.getTypeOfTransaction();
		data[4] = this.getDescription();
		data[5] = this.getCurrentBalance();
		return data;
	}

}
