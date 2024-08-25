package VD47.Revision;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeTestPage {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	
	@Test
	void login() {
		
		PageObjectClass1 p1=new PageObjectClass1(driver);
		p1.setusername("Admin");
		p1.setpassword("admin123");
		p1.login();
		
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
	}
	
	@Test
	void tearDown() {
		driver.quit();
	}

}
