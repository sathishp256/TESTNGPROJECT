package VD42;

import org.testng.annotations.Test;

//1.open app
//2. login app
//3. logout
//we write methods for each step

public class Test1 {
	
	
	
    @Test(priority=-1)
    void loginapp() {
    	
    	System.out.println("login into application........");
		
	}
	
	@Test(priority=1)
	void openapp() {
		
		System.out.println("Opening the application.......");
		
	}

	@Test(priority=3)
    void logoutapp() {
    	
    	System.out.println("logout from application........");
	
    }

}
