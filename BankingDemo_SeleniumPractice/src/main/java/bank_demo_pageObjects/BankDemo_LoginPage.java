package bank_demo_pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankDemo_LoginPage {
	
	WebDriver driver;
	
	
	
	public BankDemo_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
		
	}
	
	@FindBy(xpath = "//h2[@class='barone']")
	private WebElement header;	
	@FindBy(xpath = "//input[@name='uid']")
	private WebElement userId;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pwdId;
	@FindBy(xpath = "//input[@name='btnLogin']")
	private WebElement login; 
	
	public String header() {
		return header.getText();
		
	}
	public void enter_blank_userID() {
		userId.sendKeys(Keys.TAB);		
	
	}
	public void enter_blank_pwd() {
		pwdId.sendKeys(Keys.TAB);

	}
	
	public void userID(String userID) {
		userId.sendKeys(userID);	
	
	}
	
	public void pwd(String pwd) {
		pwdId.sendKeys(pwd);		
	
	}
	
	public BD_Manager_HomePage  login() {
		login.click();
		BD_Manager_HomePage BD_Manager_HomePageobj = new BD_Manager_HomePage(driver);
		return BD_Manager_HomePageobj;
		
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
