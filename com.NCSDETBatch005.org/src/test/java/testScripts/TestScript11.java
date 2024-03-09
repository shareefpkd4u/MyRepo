package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript11 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(5000);
		
		action.moveToElement(driver.findElement(By.tagName("strong"))).perform();
		
		action.doubleClick().perform();
		
		Thread.sleep(5000);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		WebElement sideBar = driver.findElement(By.id("nopSideBarPusher"));

		action.moveToElement(sideBar).perform();

		action.contextClick().perform();

		Thread.sleep(5000);

		driver.quit();

	}

}
