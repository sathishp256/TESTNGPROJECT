package VD47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	
	@Test
	void testLogin() {
		
		LoginPage1 page=new LoginPage1(driver);
		page.setUserName("Admin");
		page.setPassword("admin123");
		page.clicklogin();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	
	
	
	@AfterClass
	void teardown() {
		
		driver.quit();
		
	}

}
