package day38;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyListeners implements ITestListener
// implement ItestListener interfce
{
    
	public void onTestStart(ITestResult result) 
	{
	    System.out.println("On test started...");
	}
	
	public void onTestSuccess(ITestResult result) 
	{
	    System.out.println("On test success...");
	}
	
	public void onTestFailure(ITestResult result) 
	{
	    System.out.println("on test failure...");
	}
	
	public void onTestSkipped(ITestResult result) 
	{
	    System.out.println("on test skipped...");
	}
	
	public void onFinish(ITestContext context) 
	{
	    System.out.println("on test finish...");
	}
	
	
}
