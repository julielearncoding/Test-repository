package guru99.bank.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {

	@FindBy(name = "cusid")
	WebElement customerId;

	@FindBy(css = "*[value='Savings']")
	WebElement accountTypeSavings;

	@FindBy(css = "*[value='Current']")
	WebElement accountTypeCurrent;

	@FindBy(name = "inideposit")
	WebElement initialDeposit;

	@FindBy(name = "button2")
	WebElement submitButton;

	@FindBy(name = "reset")
	WebElement resetButton;

	public void createNewAccount(String customerId, String accountType, String initialDeposit) {
		this.customerId.sendKeys(customerId);
		if (accountType == "Savings") {
			this.accountTypeSavings.click();
		} else {
			this.accountTypeCurrent.click();
		}
		this.initialDeposit.sendKeys(initialDeposit);

		this.submitButton.click();
	}
}