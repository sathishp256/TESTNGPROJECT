package VD47.Revision;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//Page Object Class
public class LoginPage {
	
	WebDriver driver;
	
	//constructor
	
	LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//locators
	
	/*By txt_username=By.xpath("//input[@placeholder='Username']");
	
	By txt_password=By.xpath("//input[@placeholder='Password']");
	
	By btn_login=By.xpath("//button[normalize-space()='Login']");*/
	
	//page factory approach
	
	@FindBy(xpath="//input[@placeholder='Username']") 
	WebElement txt_username; //input[@placeholder='Username'];
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")
	WebElement txt_user;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement click_login;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	
	
	//action methods
	
	public void setUserName(String user) {
		txt_username.sendKeys(user);
		//driver.findElement(txt_username).sendKeys(user);
	}
	
	public void setPassword(String pwd) {
		
		txt_password.sendKeys(pwd);
		//driver.findElement(txt_password).sendKeys(pwd);
	}
	
	public void clickLogin() {
		click_login.click();
		//driver.findElement(btn_login).click();
	}
	
	public void sample() {
		txt_username.sendKeys(null);
	}

}
