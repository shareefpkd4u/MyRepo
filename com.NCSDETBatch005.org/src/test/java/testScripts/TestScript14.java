package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScript14 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		
		
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("button"))));
		
		driver.findElement(By.tagName("button")).click();

		//Thread.sleep(5000);

		driver.findElement(By.xpath("(//p[contains(text(), 'Catalog')])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//p[contains(text(), ' Products')])[1]")).click();

		Thread.sleep(5000);

		List<WebElement> tRows = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr"));

		int rCount = tRows.size();

		System.out.println(" Total Rows Count is : " + rCount);

		List<WebElement> tColumns = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr[1]/td"));

		int cCount = tColumns.size();

		System.out.println(" Total Columns Count is : " + cCount);

		for (int r = 1; r <= rCount; r++) { // Rows Repation

			for (int c = 1; c <= cCount; c++) { // Colums Repeat

				String val = driver
						.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();

				System.out.print(val + "	");
			}
			
			System.out.println();

		}

		Thread.sleep(5000);

		driver.quit();

	}

}
