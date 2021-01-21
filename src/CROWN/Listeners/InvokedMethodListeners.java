package CROWN.Listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class InvokedMethodListeners extends ISuitelistener implements IInvokedMethodListener {

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("Starting Test Of: " + method.getTestMethod().getMethodName() + "  of Class:" + testResult.getTestClass());
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (Boolean.parseBoolean(String.valueOf(testResult.isSuccess()))) {
            System.out.println("***************************Passed********************* " + (testResult.getMethod().getMethodName() + " ********************Passed******************"));
            System.out.println("***************************Passed********************* " + getTime(testResult.getEndMillis()) + " ********************Passed****************** \n");
        } else {
            System.out.println("***************************Failed********************* " + (testResult.getMethod().getMethodName() + " ********************Failed******************"));
            System.out.println("***************************Failed********************* " + getTime(testResult.getEndMillis()) + " ********************Failed****************** \n");
        }
    }
}