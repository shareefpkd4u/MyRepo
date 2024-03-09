package testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExample5 {

	@Test()
	public void method1() {
		Assert.fail();
		System.out.println("Method1");
	}

	@Test(dependsOnMethods = "method1")
	public void method2() {
		System.out.println("Method2");
	}

	@Test(dependsOnMethods = "method2")
	public void method3() {
		System.out.println("Method3");
	}

}
