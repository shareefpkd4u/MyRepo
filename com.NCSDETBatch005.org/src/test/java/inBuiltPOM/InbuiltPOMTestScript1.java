package inBuiltPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncPages.CommonUtility;

public class InbuiltPOMTestScript1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		CommonUtility common = new CommonUtility(driver);
		Inbuilt_NC_LoginPage inlp = new Inbuilt_NC_LoginPage(driver);

		common.browserMaximize();
		common.addSynch();
		common.openNCLoginPage();
		inlp.enterNCEmail();
		inlp.enterNCPassword();
		inlp.clickOnNCLoginBtn();
		common.tearDown();

	}

}
