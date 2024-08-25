package VD44.Revision;

import org.testng.annotations.Test;

public class Payments { 
	
	@Test(priority=1, groups= {"sanity"} )
	void fpsc1() {
		System.out.println("fpsc1");
	}
	
	@Test(priority=2, groups={"sanity"})
	void fpsc2() {
		System.out.println("fpsc2");
	}
	
	@Test(priority=3, groups={"sanity"})
	void fpsc3() {
		System.out.println("fpsc3");
	}

}
