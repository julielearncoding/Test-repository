package guru99.bank.POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage {

	WebDriver driver;
	String baseUrl = "http://demo.guru99.com/v4/";
	String homePage = "http://demo.guru99.com/v4/manager/Managerhomepage.php";

	// http://demo.guru99.com/v4/manager/CustomerRegMsg.php?cid=500
	// http://demo.guru99.com/v4/manager/AccCreateMsg.php?aid=65831
	// http://demo.guru99.com/v4/manager/Deposit.php

	public NavigationPage() {
	}

	@FindBy(linkText = "New Customer")
	WebElement customerPage;

	@FindBy(linkText = "New Account")
	WebElement accountPage;

	@FindBy(linkText = "Deposit")
	WebElement depositPage;

	public void navigateTo(String page) {
		if (page == "New Customer") {
			customerPage.click();
		} else if (page == "New Account") {
			accountPage.click();
		} else if (page == "Deposit") {
			depositPage.click();
		}
	}

}
