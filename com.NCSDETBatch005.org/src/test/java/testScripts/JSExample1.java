package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSExample1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));

		JavascriptExecutor execute = (JavascriptExecutor) driver;
		WebElement email2 = (WebElement) execute.executeScript("return document.getElementById('Email');");
		email2.clear();
		
		Thread.sleep(3000);
		
		execute.executeScript("document.getElementById('Email').value=\"admin@yourstore.com\"");
		
		Thread.sleep(3000);
		
		execute.executeScript("document.getElementById('Email').style.border=\"5px red solid\";");
		
		Thread.sleep(3000);
		
		execute.executeScript("document.getElementById('Email').style.background=\"yellow\";");
		
		Thread.sleep(7000);
		
//		execute.executeScript("document.getElementsByTagName('button')[0].click();");
//
//		Thread.sleep(7000);

		driver.quit();

	}

}
