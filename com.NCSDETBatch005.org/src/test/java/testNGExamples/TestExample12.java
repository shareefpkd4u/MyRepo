package testNGExamples;

import org.testng.annotations.Test;

public class TestExample12 {

	@Test(dataProvider = "NCLoginTestData", dataProviderClass = TestExample11.class)
	public void ncLogin2(String email, String password) {

		System.out.println(email);

		System.out.println(password);

	}

}
