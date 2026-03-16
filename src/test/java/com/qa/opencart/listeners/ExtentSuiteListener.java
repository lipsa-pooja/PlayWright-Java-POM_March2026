package com.qa.opencart.listeners;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ExtentSuiteListener implements ISuiteListener {


    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite execution started...");
    }

    @Override
    public void onFinish(ISuite suite) {
        ExtentManager.getExtentInstance().flush();
        System.out.println("Extent report generated successfully.");
    }
}
