package testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExample8 {

	@Test
	public void method1() {

		int a = 10;
		int b = 10;

		Assert.assertEquals(a == b, false, "Both are not same");

		System.out.println("Hello Darling");
		System.out.println("Bye Babby");

	}
}
