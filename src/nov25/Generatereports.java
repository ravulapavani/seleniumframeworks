package nov25;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Generatereports {
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	public void setup()
	{
		report=new ExtentReports("./Reports/sample.html");
	}
	@Test
	public void TC1()
	{
		test=report.startTest("pass test case");
		test.log(LogStatus.PASS,"Test case pass");
	}
	@Test(timeOut=3000)
	public void TC2()throws Throwable
	{
		test=report.startTest("Fail test case");
		test.log(LogStatus.FAIL,"Test case fail");
		Thread.sleep(5000);
	}
	@Test
	public void TC3()
	{
		test=report.startTest("skipping test");
		test.log(LogStatus.SKIP,"Test case skip");
		throw new SkipException("skipping testcase");
	}
	@AfterMethod
	
		public void closereports()
		{
		report.endTest(test);
		report.flush();
		}
		
	
}
