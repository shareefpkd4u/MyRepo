package testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExample4 {

	@Test(groups = "Smoke")
	public void method1() {
		Assert.fail();
		System.out.println("Method1");
	}

	@Test(groups = "Regression", dependsOnGroups = "Smoke")
	public void method2() {
		System.out.println("Method2");
	}

	@Test(groups = "Regression", dependsOnGroups = "Smoke")
	public void method3() {
		System.out.println("Method3");
	}

}
