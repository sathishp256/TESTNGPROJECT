package VD44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyRevison {
	
	@Test(priority=1)
	void openapp() {
		System.out.println("open application");
		//Assert.fail();
	}
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login() {
		System.out.println("login success");
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search() {
		System.out.println("search success");
		Assert.fail();
	}
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advsearch() {
		System.out.println("adv search success");
	}
	
	@Test(priority=5, dependsOnMethods= {"login","search","advsearch"})
	void logout() {
		System.out.println("logout success");
	}

}
