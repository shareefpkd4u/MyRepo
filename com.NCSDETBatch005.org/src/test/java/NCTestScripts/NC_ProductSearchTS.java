package NCTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncPages.CommonUtility;
import ncPages.NC_DashboardPage;
import ncPages.NC_LoginPage;
import ncPages.NC_ProductPage;

public class NC_ProductSearchTS {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		CommonUtility common = new CommonUtility(driver);
		NC_LoginPage nlp = new NC_LoginPage(driver);
		NC_DashboardPage ndp = new NC_DashboardPage(driver);
		NC_ProductPage npp = new NC_ProductPage(driver);

		common.openNCLoginPage();
		common.browserMaximize();
		common.addSynch();

		nlp.enterEmail();
		nlp.enterPassword();
		nlp.clickOnLoginBtn();

		if (ndp.verifyDashBoard()) {
			common.clickOnCatalog();
			common.clickOnProduct();
			npp.enterProductName();
			npp.clickOnProductSearchBtn();
		} else {
			System.out.println("Login not success");
		}

		common.doLogout();
		common.tearDown();

	}

}
