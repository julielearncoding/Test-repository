package guru99.bank.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositPage {

	@FindBy(name = "accountno")
	WebElement accountNumber;

	@FindBy(name = "ammount")
	WebElement amount;

	@FindBy(name = "desc")
	WebElement description;

	@FindBy(name = "AccSubmit")
	WebElement submitButton;

	@FindBy(name = "reset")
	WebElement res;

	public void depositToAccount(String accountNumber, String amount, String description) {
		this.accountNumber.sendKeys(accountNumber);
		this.amount.sendKeys(amount);
		this.description.sendKeys(description);

		this.submitButton.click();

	}
}