package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript12 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");

		Thread.sleep(5000);

		driver.switchTo().frame(0);

		Thread.sleep(5000);

		WebElement source = driver.findElement(By.xpath("//p[contains(text(), 'Drag me to my target')]"));

		WebElement target = driver.findElement(By.id("droppable"));

		action.dragAndDrop(source, target).perform();

		Thread.sleep(5000);

		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		driver.quit();

	}

}
