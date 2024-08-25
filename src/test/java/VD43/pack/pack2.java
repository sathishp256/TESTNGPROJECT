package VD43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pack2 {
	
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

}
