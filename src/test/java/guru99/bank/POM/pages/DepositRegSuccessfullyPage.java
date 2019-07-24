package guru99.bank.POM.pages;

import java.util.ArrayList;

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

	public ArrayList getRegisteredDepositDetails() {
		ArrayList data = new ArrayList();
		data.add(this.getTransactionId());
		data.add(this.getAccountNo());
		data.add(this.getAmountCredited());
		data.add(this.getTypeOfTransaction());
		data.add(this.getDescription());
		data.add(this.getCurrentBalance());
		return data;
	}

}
