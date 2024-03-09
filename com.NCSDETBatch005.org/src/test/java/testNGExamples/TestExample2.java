package testNGExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExample2 {

	@AfterTest
	public void afterTest() {
		System.out.println("This is a AfterTest Method");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is a BeforeSuite Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is a BeforeClass Method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is a BeforeTest Method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is a BeforeMethod method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is a AfterMethod Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is a AfterClass Method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is a AfterSuite Method");
	}

	@Test(groups = "Smoke")
	public void testMethod1() {
		System.out.println("This is a Test Method1");
	}

	@Test(groups = "Regression")
	public void testMethod2() {
		System.out.println("This is a Test Method2");
	}

}
