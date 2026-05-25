package com.api.listners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testlistenre implements ITestListener {

    private static final Logger logger = LogManager.getLogger(Testlistenre.class);

    @Override
    public void onStart(ITestContext context) {

        logger.info("Execution started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        logger.info("Test Passed : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        logger.error("Test Failed : " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        logger.warn("Test Skipped : " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {

        logger.info("Execution completed");
    }
}