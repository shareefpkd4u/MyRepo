package ncPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//Rule - 1
public class CommonUtility {

	WebDriver driver;

	// Rule - 2
	By ncCatalog = By.xpath("(//p[contains(text(),'Catalog')])[1]");

	By ncCatalogProduct = By.xpath("(//p[contains(text(),'Products')])[1]");

	By ncLogout = By.linkText("Logout");

	// Rule - 3

	public void clickOnCatalog() {
		driver.findElement(ncCatalog).click();
	}

	public void clickOnProduct() {
		driver.findElement(ncCatalogProduct).click();
	}

	public void doLogout() {
		driver.findElement(ncLogout).click();
	}

	public void openNCLoginPage() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	public void browserMaximize() {
		driver.manage().window().maximize();
	}

	public void addSynch() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void tearDown() {
		driver.quit();
	}

	// Rule - 4
	public CommonUtility(WebDriver d) {
		this.driver = d;
	}
}
