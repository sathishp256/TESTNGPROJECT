package VD47.Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PageObjectClass1 {
	
	WebDriver driver;
	
	PageObjectClass1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	/*By txt_username=By.xpath("//input[@placeholder='Username']");
	

	By txt_password=By.xpath("//input[@placeholder='Password']");
	
	By btn_login=By.xpath("//button[normalize-space()='Login']");*/
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	
	@FindBy(how=How.XPATH, using="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	//actions methods
	
	public void setusername(String name) {
		//driver.findElement(txt_username).sendKeys(name);
		txt_username.sendKeys(name);
	
	}
	
	public void setpassword(String pwd) {
		//driver.findElement(txt_password).sendKeys(pwd);
		txt_password.sendKeys(pwd);
	
	}
	
	public void login() {
		//driver.findElement(btn_login).click();
		btn_login.click();
	
	}

}
