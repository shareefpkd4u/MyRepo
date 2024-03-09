package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript7 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(5000);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//p[contains(text(), 'Help')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[contains(text(), 'Training')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[contains(text(), 'Documentation')]")).click();

		Thread.sleep(5000);

		driver.close();

//		driver.quit();

	}

}
