package VD44;

import org.testng.annotations.Test;

//regression

public class Signuptest {
	
	@Test(priority=1, groups={"regression"})
	void signbyemail() {
		System.out.println("This is sign by email");
	}
	
	@Test(priority=2, groups={"regression"})
	void signbyfacebook() {
		System.out.println("This is sign by facebook");
	}
	
	@Test(priority=3, groups={"regression"})
	void signbytwitter() {
		System.out.println("This is sign by twitter");
	}

}
