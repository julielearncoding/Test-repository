package guru99.bank.POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage {
	WebDriver driver;

	@FindBy(name = "name")
	WebElement customerName;

	@FindBy(xpath = "//*[@name='rad1' and @value='m']")
	WebElement maleRadioButton;

	@FindBy(xpath = "//*[@name='rad1' and @value='f']")
	WebElement femaleRadioButton;

	@FindBy(id = "dob")
	WebElement dateOfBirth;

	@FindBy(name = "addr")
	WebElement address;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement state;

	@FindBy(name = "pinno")
	WebElement pinNumber;

	@FindBy(name = "telephoneno")
	WebElement mobileNumber;

	@FindBy(name = "emailid")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "sub")
	WebElement submitButton;

	@FindBy(name = "res")
	WebElement resetButton;

	public void submitCustomerDetails(String customerName, String gender, String dateOfBirth, String address,
			String city, String state, String pinNumber, String mobileNumber, String email, String password) {
		this.customerName.sendKeys(customerName);
		if (gender == "female") {
			femaleRadioButton.click();
		} else {
			maleRadioButton.click();
		}
		;
		this.dateOfBirth.sendKeys(dateOfBirth);
		this.address.sendKeys(address);
		this.city.sendKeys(city);
		this.state.sendKeys(state);
		this.pinNumber.sendKeys(pinNumber);
		this.mobileNumber.sendKeys(mobileNumber);
		this.email.sendKeys(email);
		this.password.sendKeys(password);

		this.submitButton.click();
	}

}