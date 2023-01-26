package seleniumtestngproject.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class ListenersRetry implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 3;
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }}
//2. In Test class use @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
//3. Result : When this test case fails, TestNG will try to run same failed test case again
