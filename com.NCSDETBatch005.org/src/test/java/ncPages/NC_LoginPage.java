package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Rule - 1
public class NC_LoginPage {

	WebDriver driver;
	
	//Rule - 4
	public NC_LoginPage(WebDriver d) {
		this.driver = d;
	}

	// Rule - 2
	By email = By.id("Email");

	By pws = By.name("Password");

	By loginBtn = By.tagName("button");

	// Rule - 3
	public void enterEmail() {
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("admin@yourstore.com");
	}

	public void enterPassword() {
		driver.findElement(pws).clear();
		driver.findElement(pws).sendKeys("admin");
	}

	public void clickOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}

	// Rule - 4
	// Secreate

}
