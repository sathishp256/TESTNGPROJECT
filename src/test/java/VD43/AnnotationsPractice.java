package VD43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsPractice {
	
	@BeforeSuite
	void beforesuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	void aftersuite() {
		System.out.println("after suite");
	}
	
	@BeforeTest
	void beforetest() {
		System.out.println("before test");
	}
	
	@AfterTest
	void aftertest() {
		System.out.println("after test");
	}
	
	@BeforeClass
	void beforeclass() {
		System.out.println("before class");
	}
	
	@AfterClass
	void afterclass() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	void beforemethod1() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	void aftermethod() {
		System.out.println("After method");
	}
	
	@Test
	void test1() {
		System.out.println("Test method1");
	}
	
	@Test
	void test2() {
		System.out.println("Test method2");
	}

}
