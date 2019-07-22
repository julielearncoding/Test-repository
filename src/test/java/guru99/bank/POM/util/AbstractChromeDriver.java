package guru99.bank.POM.util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import guru99.bank.POM.pages.LoginPage;
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

		// Launch the site
		driver.get("http://demo.guru99.com/v4/");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("mngr210803", "ugUzAbE");
	}

	@After
	public void afterTest() {
		driver.quit();
	}

}