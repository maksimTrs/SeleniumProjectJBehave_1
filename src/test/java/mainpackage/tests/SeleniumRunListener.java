package mainpackage.tests;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class SeleniumRunListener extends RunListener {

    @Override
    public void testRunStarted(Description description) throws Exception {
        System.out.println("Before tests run: " + description);
    }


    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Result of the test run:");
        System.out.println("Run time: " + result.getRunTime() + " ms");
        System.out.println("Run count: " + result.getRunCount());
        System.out.println("Failure count: " + result.getFailureCount());
        System.out.println("Ignored count: " + result.getIgnoreCount());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test starts: " + description);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }


    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test finished: " + description);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
