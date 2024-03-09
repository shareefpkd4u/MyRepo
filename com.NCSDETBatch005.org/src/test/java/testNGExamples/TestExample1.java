package testNGExamples;

import org.testng.annotations.Test;

public class TestExample1 {

	@Test(groups = "Smoke")
	public void method1() {
		System.out.println("Hello TestNG");
	}

}
