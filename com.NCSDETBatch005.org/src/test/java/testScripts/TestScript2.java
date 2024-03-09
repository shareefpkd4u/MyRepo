package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript2 {

	public static void main(String[] args) throws Exception {

		// launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// open NC login page in opened browser
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		// maximize the browser
		driver.manage().window().maximize();

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		driver.quit();

	}

}
