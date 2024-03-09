package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule - 1
public class NC_DashboardPage {

	WebDriver driver;

	// Rule - 2
	By dashBrd = By.xpath("//h1[contains(text(), 'Dashboard')]");

	// Rule - 3
	public boolean verifyDashBoard() {
		boolean val = driver.findElement(dashBrd).isDisplayed();
		return val;
	}

	// Rule - 4
	public NC_DashboardPage(WebDriver d) {
		this.driver = d;
	}

}
