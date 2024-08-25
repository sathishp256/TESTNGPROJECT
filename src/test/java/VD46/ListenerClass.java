package VD46;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class ListenerClass {
	
	public void onStart(ITestContext context) {
		
		System.out.println("On start method");
	    // not implemented
	  }
	
	public void onTestStart(ITestResult result) {
		System.out.println("On teststart method");
	    // not implemented
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("On testsucess method");
	    // not implemented
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("On testfailure method");
	    // not implemented
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("On testskipped method");
	    // not implemented
	  }
	
	public void onFinish(ITestContext context) {
		System.out.println("On finshing method");
	    // not implemented
	  }
	

}
