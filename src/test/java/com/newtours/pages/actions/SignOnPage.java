package com.newtours.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.newtours.base.Page;

public class SignOnPage extends Page {
	
	@FindBy (name = "userName")
	public WebElement userNameTxt;
	
	@FindBy (name = "password")
	public WebElement PasswordTxt;
	
	@FindBy (name = "login")
	public WebElement submitBtn;

	public void login(String username, String password) {
		enterUserName(username);
		enterPassWord(password);
		submit();

	}

	private void submit() {
		submitBtn.click();

	}

	private void enterPassWord(String password) {
		if (password != "") {
			PasswordTxt.sendKeys(password);
		}

	}

	private void enterUserName(String username) {
		userNameTxt.sendKeys(username);

	}

}
