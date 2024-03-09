package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript6 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(6000);

		driver.findElement(By.id("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com", Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");

		Thread.sleep(3000);

		String btnText = driver.findElement(By.tagName("button")).getText();

		System.out.println(btnText);

		String btnClass = driver.findElement(By.tagName("button")).getAttribute("class");

		System.out.println(btnClass);

		driver.findElement(By.tagName("button")).sendKeys(Keys.ENTER);

		Thread.sleep(5000);

		driver.quit();

	}

}
