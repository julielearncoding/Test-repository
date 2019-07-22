package guru99.bank.POM.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableReader {
	private WebDriver driver;
	private String id;
	private WebElement tbody;

	public TableReader(WebDriver driver, String id) {
		this.driver = driver;
		this.id = id;
		tbody = driver.findElement(By.cssSelector("#" + id + " > tbody"));
	}

	public String getData(int row, int col) {
		String data = tbody.findElement(By.cssSelector("tr:nth-child(" + row + ") > td:nth-child(" + col + ")"))
				.getText();
		// System.out.println(data);
		return data;
	}
}
