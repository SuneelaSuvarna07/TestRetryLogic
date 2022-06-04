package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestRetryListeners implements IRetryAnalyzer {

	int counter = 0;
	int retryLogic = 3;

	public boolean retry(ITestResult result) {
		if (counter < retryLogic) {
			counter++;
			return true;
		}
		return false;
	}

}
