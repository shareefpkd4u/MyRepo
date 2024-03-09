package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript13 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		Thread.sleep(5000);

		driver.findElement(By.id("alertButton")).click();

		Thread.sleep(3000);

		Alert popup = driver.switchTo().alert();

		popup.accept();

		driver.switchTo().defaultContent();

		driver.findElement(By.id("confirmButton")).click();

		Thread.sleep(3000);
		
		Alert popup2 = driver.switchTo().alert();
		
		String test = popup2.getText();
		
		System.out.println(test);
		
		Thread.sleep(3000);
		
		popup2.dismiss();

		Thread.sleep(5000);

		driver.quit();

	}

}
