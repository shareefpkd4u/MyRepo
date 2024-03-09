package testNGExamples;

import org.testng.annotations.Test;

public class TestExample7 {

	@Test(invocationCount = 10000, invocationTimeOut = 100)
	public void testMethod() {
		System.out.println("IT Industry");
	}

}
