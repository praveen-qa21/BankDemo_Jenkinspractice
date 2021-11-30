package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	
	
  public static WebDriver driver; 
	
	@BeforeSuite
	public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/V4/index.php");
	driver.manage().window().maximize();	
	}
	
//	public void login_with_Valid_Credentials() {
//
//		Loginpage.userID("mngr370422");
//		Loginpage.pwd("EsuhYrY");
//		Loginpage.login(); 
//		System.out.println("over");
//		
//	} 
	
	@AfterTest
	public void quit() {
		//driver.close();
	}
	
	
	

}
