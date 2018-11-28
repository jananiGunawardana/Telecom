package ExtentReport;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReport {

	ExtentReports Report;
	ExtentTest LogTest;


	public void SetupReport()
	{
		Report = new ExtentReports (System.getProperty("user.dir") +"/test-output/ExecutionReport.html", true);
	}

	
	public void logEvents (String value)
	{
		LogTest.log(LogStatus.PASS, value);
	}


	public void startTestCase (String testcaseName)
	{
		LogTest = Report.startTest(testcaseName);
	}

	
	public void createFinalReport()
	{
		Report.flush();

	}
	

	public void logEventsPass (String value)
	{
		LogTest.log(LogStatus.PASS, value);
	}


	public void logEventsFail (String value)
	{
		LogTest.log(LogStatus.FAIL, value);
	}
}

