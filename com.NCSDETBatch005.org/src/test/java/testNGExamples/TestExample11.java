package testNGExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExample11 {

	@DataProvider(name = "NCLoginTestData")
	public Object[][] data() {

		Object[][] testData = new Object[2][2];

		testData[0][0] = "admin@yourstore.com";
		testData[0][1] = "admin";

		testData[1][0] = "test@yourstore.com";
		testData[1][1] = "test123";

		return testData;
	}


}
