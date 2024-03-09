package testScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) throws Exception {

		// launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// open NC login page in opened browser
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		// maximize the chrome browser
		driver.manage().window().maximize();

		Thread.sleep(5000);

		// close the entire browser
		driver.quit();

	}

}
