package com.newtours.base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class Page {
	public static WebDriver driver;

	public static void initConfiguration() {

		String projectDirectory = System.getProperty("user.dir");
		if (Constants.browser == "firefox") {
			System.setProperty("webdriver.gecko.driver",
					projectDirectory + "\\src\\test\\resources\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (Constants.browser == "chrome") {
			System.setProperty("webdriver.chrome.driver",
					projectDirectory + "\\src\\test\\resources\\executables\\chromedriver.exe");

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			driver = new ChromeDriver(options);
		} else if (Constants.browser == "ie") {
			System.setProperty("webdriver.ie.driver",
					projectDirectory + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get(Constants.testSiteUrl);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void quitBrowser() {
		driver.quit();

	}

	public static void verifyResults(String expectedPageTitle) {
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expectedPageTitle);
	}

}
