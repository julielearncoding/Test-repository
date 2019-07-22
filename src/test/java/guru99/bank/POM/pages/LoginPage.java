package guru99.bank.POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	@FindBy(name = "uid")
	private WebElement userId;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "btnLogin")
	private WebElement loginButton;

	public void enter_userId(String userId) {
		this.userId.sendKeys(userId);
		;
	}

	public void enter_password(String password) {
		this.password.sendKeys(password);
	}

	public void submit() {
		this.loginButton.submit();
	}

	public void login(String userId, String password) {
		enter_userId(userId);
		enter_password(password);
		submit();
	}
}