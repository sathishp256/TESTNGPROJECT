package VD44.Revision;

import org.testng.annotations.Test;

public class Trade {

	@Test(priority=1, groups= {"sanity","regression","functional"})
	void trade1() {
		System.out.println("trade book"); 
	}
	
	@Test(priority=2, groups= {"sanity","regression","functional"})
	void trade2() {
		System.out.println("trade book");
	}

}
