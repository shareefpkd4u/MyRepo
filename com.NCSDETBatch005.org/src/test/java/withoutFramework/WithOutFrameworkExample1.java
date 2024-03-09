package withoutFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutFrameworkExample1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		if (driver.findElement(By.id("Email")).isDisplayed()) {

			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
			driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("Password")).sendKeys("admin");

			driver.findElement(By.tagName("button")).click();

			Thread.sleep(5000);

			if (driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]")).isDisplayed()) {

				driver.findElement(By.xpath("(//p[contains(text(), 'Catalog')])[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//p[contains(text(), 'Products')])[1]")).click();

				if (driver.findElement(By.name("SearchProductName")).isDisplayed()) {
					driver.findElement(By.name("SearchProductName")).sendKeys("Build");
					driver.findElement(By.id("search-products")).click();
					Thread.sleep(3000);
					driver.findElement(By.linkText("Logout")).click();
					Thread.sleep(3000);
				}

			}

		} else {
			System.out.println("Login Page not loaded");
		}

		Thread.sleep(5000);
		driver.quit();

	}

}
