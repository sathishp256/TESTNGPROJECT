package VD43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * 1.login  ---> @BeforeMethod
 * 2.search ----> @test method
 * 3.logout ---->AfterMethod
 * 4.login
 * 5.adv search -----. @test method
 * 6.logout
 */

/*
 * 1.login  ---> @
 * 2.search ----> @test method
 * 3.logout ---->
 * 4.login
 * 5.adv search -----. @test method
 * 6.logout
 */

public class AnnotationsDemo1 {
	/*
	@BeforeMethod
	void login() {
		System.out.println("Login");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("search");
		
	}
	
	@Test(priority=2)
	void advsearch() {
		System.out.println("ADV Search");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("logout");
	}
	*/
	//tc2
	
	@BeforeClass
	void login() {
		System.out.println("Before class");
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
