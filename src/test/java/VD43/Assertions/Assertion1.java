package VD43.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
	
	@Test
	void testTitle() { 
		
		String s1="Open";
		String s2="ggs";
		
		/*if(s1.equals(s2)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}*/
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(123, 123);
		
		
		//Assert.assertEquals("245", "123");
		
		
		
		System.out.println("Assertion");
		
		sa.assertAll();
		//Assert.assertNotEquals(123, 456);
		
		//Assert.assertTrue(true);
		
		//Assert.assertFalse(false);
		
		//Assert.fail();
	}

}
