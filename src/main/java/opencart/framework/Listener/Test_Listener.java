package opencart.framework.Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import opencart.framework.Extent_Reports.Extent_ReportClass;

public class Test_Listener extends Extent_ReportClass implements ITestListener {

	// This Class all method related to TestNG Listners to perform action on the top
	// of Test Methods

	public void onTestStart(ITestResult result) 
	{
		logger = extent.startTest(result.getMethod().getMethodName()); // start Method Name printing process
	}

	
	
	public void onTestSuccess(ITestResult result)
	{
		logger.log(LogStatus.PASS, "Test Case is Passed : "+ result.getMethod().getMethodName());
		extent.endTest(logger);
	}

	
	
	public void onTestFailure(ITestResult result)
	{
		logger.log(LogStatus.FAIL, "Test case is Failed : "+result.getMethod().getMethodName());
		logger.log(LogStatus.FAIL, "Test case is Failed with Error : "+result.getThrowable());
		extent.endTest(logger);
	}

	
	
	public void onTestSkipped(ITestResult result) 
	{
		logger.log(LogStatus.SKIP, "Test is Skipped : "+result.getMethod().getMethodName());
		extent.endTest(logger);
	}
	
	
	
	
	
	

}
