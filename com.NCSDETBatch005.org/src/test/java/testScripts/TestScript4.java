package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript4 {

	public static void main(String[] args) throws Exception {

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		String sc = driver.getPageSource();
		
		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		String url = driver.getCurrentUrl();
		String pageName = driver.getTitle();
		

		System.out.println(url);
		System.out.println(pageName);
		System.out.println(sc);

	}

}
