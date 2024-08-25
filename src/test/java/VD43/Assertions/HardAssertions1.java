package VD43.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertions1 {
	
	@Test
	void test() {
		 
		//Assert.assertEquals("123", 123);
		
		//Assert.assertNotEquals(123, 727);
		
		//Assert.assertEquals(123, 456);
		//Assert.assertNotEquals(123, 456);
		//Assert.assertTrue(true);
		//Assert.assertFalse(true);
		
		SoftAssert s1=new SoftAssert();
		
		s1.assertTrue(true);
	
		
		System.out.println("hard assertion");
		
		s1.assertAll();
		
	}

}
