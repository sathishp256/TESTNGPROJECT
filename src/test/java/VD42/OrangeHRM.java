package VD42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 1.open the application
 2.test logo presence
 3.login
 4.close
 */

public class OrangeHRM {
	
	WebDriver driver;
	

	@Test(priority=1)
	void openapp() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	
	@Test(priority=2)
	void logocheck() throws InterruptedException {
		
		Thread.sleep(3000);
		
		boolean res=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println(res);
		
	}
	
	@Test(priority=3)
	void loginapp() {
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
	}
	
	@Test(priority=4)
	void logoutapp() {
		
		driver.close();
		
		
		
	}
  
  
}
