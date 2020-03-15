package com.w2a.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SetupAndTearDown {
	@BeforeMethod
	public static void setUp() {

		Page.initConfiguration();
	}

	@AfterMethod
	public void quitBrowser() {
//		Page.quitBrowser();
	}

}
