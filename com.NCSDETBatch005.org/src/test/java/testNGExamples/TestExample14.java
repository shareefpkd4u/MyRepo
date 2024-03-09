package testNGExamples;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestExample14 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " This Test Method Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " This Test Method Is Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " This Test Method Is Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + " This Test Method Is Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + " This Test Execution Got Started");
	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println(context.getName() + " This Test Execution Got Finished");

	}

}
