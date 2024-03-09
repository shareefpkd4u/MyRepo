package testNGExamples;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestExample9 {

	@Test
	public void method1() {

		int a = 10;
		int b = 20;

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(a == b, true, "Both are not same");

		System.out.println("Hello Darling");

		System.out.println("Bye Babby");

		soft.assertAll();

	}

}
