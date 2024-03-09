package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript9 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(5000);

		driver.findElement(By.tagName("butto")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//p[contains(text(), 'Catalog')])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//p[contains(text(), ' Products')])[1]")).click();

		Thread.sleep(5000);

		WebElement category = driver.findElement(By.id("SearchCategoryId"));

		Select selection = new Select(category);

		selection.selectByVisibleText("Books");

		Thread.sleep(4000);

		selection.selectByIndex(5);

		Thread.sleep(4000);

		selection.selectByValue("9");

		Thread.sleep(4000);

		List<WebElement> allOpt = selection.getOptions();

		int count = allOpt.size();

		System.out.println(count);

		for (WebElement opt : allOpt) {
			String text = opt.getText();
			System.out.println(text);
		}

		Thread.sleep(5000);

		driver.quit();

	}

}
