package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) { //beforemethod
        System.out.println(result.getName() +" is started");
    }

    @Override
    public void onTestSuccess(ITestResult result) { //aftermethod -- pass
        System.out.println(result.getName() + " is passed");
        System.out.println(result.getMethod().getDescription() + "is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) { //aftermethod -- fail
        System.out.println(result.getName() + " is fai;led");
    }

    @Override
    public void onStart(ITestContext context) { //before Suite
        System.out.println("I am a before suite");
    }

    @Override
    public void onFinish(ITestContext context) { //after Suite
        System.out.println("I am a after suite");
    }

}
