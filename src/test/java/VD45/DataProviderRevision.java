package VD45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderRevision {
	
	WebDriver driver;
	
	
	@BeforeClass
	@Parameters({"browser","url"})
	void openapp(String br,String url) {
		
		switch(br.toLowerCase()) {
		
		case "chrome":driver=new ChromeDriver();break;
		
		case "edge" : driver=new EdgeDriver();break;
		
		case "firefox": driver=new FirefoxDriver();break;
		
		default:System.out.println("invalid browser name");return;
		
		}
		
		driver.get(url);

		
	}
	
	
	@Test(dataProvider="dp1")
	void testlogin(String name,String password) {
		//driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true)
		{
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
		
	}
	
	@DataProvider(name="dp1")
	Object[][] testData() {
		
		Object[][] data= {
				
				{"sathishpothuraju@gmail.com","pass1"},
				{"sathishp@gmail.com","pass2"},
				{"pavanol123@gmail.com", "test@123"}
				
		};
		
		return data;
		
	}
	
	
	@AfterClass
	void tearDown() {
		
		driver.quit();
	
	}
	
		
		
		
	
	
	}


