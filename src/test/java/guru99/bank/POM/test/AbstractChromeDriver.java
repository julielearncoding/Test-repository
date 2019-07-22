package guru99.bank.POM.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractChromeDriver {

	protected WebDriver driver;

	public AbstractChromeDriver() {
		super();
	}

	@Before
	public void beforeTest() {
		// Download the web driver executable
		WebDriverManager.chromedriver().setup();

		// Create a instance of your web driver - chrome
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void afterTest() {
		// driver.quit();
	}

}