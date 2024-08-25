package VD44;

import org.testng.annotations.Test;

//sanity+regreession=funtional

public class PaymentTests {
	
	@Test(priority=1, groups={"sanity","regression","functional"})
	void paymentinrupees() {
		
		System.out.println("payment in rupees");
		
	}
	
	@Test(priority=2, groups={"sanity","regression","functional"})
	void paymentindollars() {
		
		System.out.println("payment in dollars");
		
	}

}
