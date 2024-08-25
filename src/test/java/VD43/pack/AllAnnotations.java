package VD43.pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@Test
	void test3() {
		System.out.println("test method from pack3");
	}
	
	@BeforeSuite
	void beforesuit() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	void aftersuite() {
		System.out.println("afteer suite");
	}
	
	@Test
	void test1() {
		System.out.println("Test method from pack2 ");
	}
	
	@BeforeTest
	void beforetest() {
		System.out.println("Before test");
	
	}
	
	@AfterTest
	void aftertest() {
		System.out.println("After Test");
	}

	@BeforeMethod
	void login1() {
		System.out.println("Login");
	}
	
	@Test(priority=1)
	void search1() {
		System.out.println("search");
		
	}
	
	@Test(priority=2)
	void advsearch1() {
		System.out.println("ADV Search");
	}
	
	@AfterMethod
	void logout1() {
		System.out.println("logout");
	}
	
	//tc2
	
	@BeforeClass
	void login() {
		System.out.println("before class");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("search");
		
	}
	
	@Test(priority=2)
	void advsearch() {
		System.out.println("ADV Search");
	}
	
	@AfterClass
	void logout() {
		System.out.println("after class");
	}
	

}
