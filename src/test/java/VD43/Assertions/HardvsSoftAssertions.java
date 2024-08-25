package VD43.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {
	
	@Test
	void hardAssertions() {
		
		System.out.println("testng....");
		System.out.println("testng.....");
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(123, 1244);
		
		System.out.println("Testnggg....");
		
		sa.assertAll();
	}

}
