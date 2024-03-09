package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript3 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(3000);

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.navigate().refresh();

		Thread.sleep(5000);

		driver.quit();

	}
}
