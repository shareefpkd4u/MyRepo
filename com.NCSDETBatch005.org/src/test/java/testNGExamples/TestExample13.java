package testNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestExample13 {

	WebDriver driver;

	@Test
	public void faceBook() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.quit();

	}

	@Test
	public void googleApp() {
		Assert.fail();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();
	}

	@Test(dependsOnMethods = "googleApp")
	public void linkedIn() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com");
		driver.quit();
	}

}
