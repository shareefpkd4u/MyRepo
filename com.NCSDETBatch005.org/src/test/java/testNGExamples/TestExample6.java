package testNGExamples;

import org.testng.annotations.Test;

public class TestExample6 {

	@Test(priority = 1, enabled = false)
	public void Login() {

		System.out.println("Method1");
	}

	@Test(priority = 2)
	public void Dashboard() {
		System.out.println("Method2");
	}

	@Test(priority = 3)
	public void catalog() {
		System.out.println("Method3");
	}

}
