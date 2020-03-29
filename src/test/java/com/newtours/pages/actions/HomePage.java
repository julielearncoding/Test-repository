package com.newtours.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	
	@FindBy (linkText = "SIGN-ON")
	public WebElement signOnLink;
	
	public void gotoSignOn() {
		signOnLink.click();
	}

}
