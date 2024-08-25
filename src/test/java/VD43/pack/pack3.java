package VD43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class pack3 {
	
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
	System.out.println("after suite");
}

}
