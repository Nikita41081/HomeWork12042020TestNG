package uk.org.wcht.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import uk.org.wcht.utility.Utility;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("My test is fail " + iTestResult.getName());
        Utility.takeScreenShot();
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
//System.out.println("My test is fail "+iTestResult.getName());
        Utility.takeScreenShot();
        String screenshotName = Utility.takeScreenShot(iTestResult.getName());
        System.setProperty("org.uncommons.reportng.escape-output", "false");
        Reporter.log("Click to see screenshot");
        Reporter.log("<a target = \"_blank\" href=" + screenshotName + ">Screenshot</a>");
        Reporter.log("<br>");
        Reporter.log("<br>");
        Reporter.log("<a target = \"_blank\" href=" + screenshotName + "><img src=" + screenshotName + " height=200 width=200></img></a>");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
