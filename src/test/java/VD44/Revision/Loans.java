package VD44.Revision;

import org.testng.annotations.Test;

public class Loans {
	
	@Test(priority=1, groups= {"regression"} )
	void carloan() {
		System.out.println("car loan");
	}
	 
	@Test(priority=2, groups= {"regression"})
	void bikeloan() {
		System.out.println("bike loan");
	}
	
	

}
