package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule - 1
public class NC_ProductPage {

	WebDriver driver;

	// Rule - 2
	By productName = By.name("SearchProductName");

	By productSearchBtn = By.id("search-products");

	// Rule - 3
	public void enterProductName() {
		driver.findElement(productName).sendKeys("Build");
	}

	public void clickOnProductSearchBtn() {
		driver.findElement(productSearchBtn).click();
	}

	// Rule - 4
	public NC_ProductPage(WebDriver d) {
		this.driver = d;
	}

}
