package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Extentlistner implements ITestListener {
    ExtentSparkReporter extentsparkreporter;
    ExtentReports reports;
    ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
//        extentsparkreporter=new ExtentSparkReporter(System.getProperty("C:\\Users\\DELL\\IdeaProjects\\untitled1\\Reports"));
        extentsparkreporter = new ExtentSparkReporter("C:\\Users\\DELL\\IdeaProjects\\untitled1\\Reports\\extentReport.html");

        extentsparkreporter.config().setDocumentTitle("Automation flights");
        extentsparkreporter.config().setReportName("Functional Testing");
        extentsparkreporter.config().setTheme(Theme.DARK);
        reports =new ExtentReports();
        reports.attachReporter(extentsparkreporter);
        reports.setSystemInfo("Tester","Amulya");
        reports.setSystemInfo("Computer","windows");
        reports.setSystemInfo("OS","11");
        reports.setSystemInfo("Environment","staging");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test= reports.createTest(result.getName());

        test.log(Status.PASS, "Test case PASSED is:" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
     test= reports.createTest(result.getName());
     test.log(Status.FAIL,"Test case Failed is:" + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test= reports.createTest(result.getName());
        test.log(Status.SKIP,"Test case skipped is"+result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        reports.flush();
    }
}
