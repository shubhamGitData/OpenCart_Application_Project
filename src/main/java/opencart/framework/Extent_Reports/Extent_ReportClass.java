package opencart.framework.Extent_Reports;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Extent_ReportClass {
//	This class will have all the methods to generate html reports

	public static ExtentReports extent;
	
	public static ExtentTest logger;
	
	@BeforeSuite (alwaysRun=true)
	public static void setUpReport()
	{
		// Create Empty Report
		extent= new ExtentReports(".\\Reports\\OpenCart_AutomationReport.html");
		extent.addSystemInfo("Project Name : ", "OpenCart App").addSystemInfo("Test Engineer : ", "Shubham Patil");
		
	}
	
	
	@AfterSuite (alwaysRun=true)
	public static void tearDownReport()
	{
		extent.flush(); // to Stop Printing.
		extent.close();
	}
	
}
