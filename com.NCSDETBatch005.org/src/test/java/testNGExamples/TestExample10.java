package testNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestExample10 {

	@Parameters({ "email", "password" })
	@Test
	public void ncLogin(String un, String pws) {

		System.out.println("UN data came from Suite File "+ un);
		System.out.println("PWS data came from Suite File "+ pws);

	}


}
