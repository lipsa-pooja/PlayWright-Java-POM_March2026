package com.qa.opencart.listeners;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getExtentInstance() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/build/ExtentReport.html";

            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
            sparkReporter.config().setDocumentTitle("Playwright Automation Report");
            sparkReporter.config().setReportName("OpenCart Regression Execution Report");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);

            extent.setSystemInfo("Framework", "Playwright Java + TestNG");
            extent.setSystemInfo("Tester", "Lipsa");
            extent.setSystemInfo("Environment", "QA");
        }
        return extent;
    }

}
