
package com.newtours.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.newtours.base.Page;
import com.newtours.base.SetupAndTearDown;
import com.newtours.pages.actions.HomePage;
import com.newtours.pages.actions.SignOnPage;

public class NT001_LoginUnSuccessfully_WrongPassword extends SetupAndTearDown {

	@Test(dataProvider = "NT001_001")
	public void NT001_LoginUnSuccessfully_WrongPassword(String username, String password, String expectedPageTitle) {

		HomePage home = PageFactory.initElements(Page.driver, HomePage.class);
		home.gotoSignOn();

		SignOnPage signOn = PageFactory.initElements(Page.driver, SignOnPage.class);
		signOn.login(username, password);
		
		Page.verifyResults(expectedPageTitle);
	}

	@DataProvider(name = "NT001_001")
	public Object[][] searchData() {
		return new Object[][]  {{ "shopeetest", "Shopee@", "Sign-on: Mercury Tours" }};
	}
}