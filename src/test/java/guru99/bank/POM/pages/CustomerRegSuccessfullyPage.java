package guru99.bank.POM.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerRegSuccessfullyPage {
	WebDriver driver;

	@FindBy(css = "#customer > tbody")
	WebElement tbody;

	public String getData(int row, int col) {
		String data = tbody.findElement(By.cssSelector("tr:nth-child(" + row + ") > td:nth-child(" + col + ")"))
				.getText();
		return data;
	}

	public String getSuccessfulMessage() {
		return getData(1, 1);
	}

	public String getCustomerId() {
		return getData(4, 2);
	}

	public String getCustomerName() {
		return getData(5, 2);
	}

	public String getGender() {
		return getData(6, 2);
	}

	public String getBirthdate() {
		return getData(7, 2);
	}

	public String getAddress() {
		return getData(8, 2);
	}

	public String getCity() {
		return getData(9, 2);
	}

	public String getState() {
		return getData(10, 2);
	}

	public String getPIN() {
		return getData(11, 2);
	}

	public String getMobileNumber() {
		return getData(12, 2);
	}

	public String getEmail() {
		return getData(13, 2);
	}

	public ArrayList getRegisteredCustomerDetails() {
		ArrayList data = new ArrayList();
		data.add(this.getCustomerId());
		data.add(this.getCustomerName());
		data.add(this.getGender());
		data.add(this.getBirthdate());
		data.add(this.getAddress());
		data.add(this.getCity());
		data.add(this.getState());
		data.add(this.getPIN());
		data.add(this.getMobileNumber());
		data.add(this.getEmail());
		return data;
	}
}
