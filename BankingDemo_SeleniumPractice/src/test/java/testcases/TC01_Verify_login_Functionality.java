package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bank_demo_pageObjects.BD_Manager_HomePage;
import bank_demo_pageObjects.BankDemo_LoginPage;

public class TC01_Verify_login_Functionality extends Baseclass {

	BankDemo_LoginPage Loginpage;
	
	
	

	@Test(priority = 1)
	public void verify_TitleAndHeader() throws InterruptedException {
		Loginpage = new BankDemo_LoginPage(driver);
		
		//Title	 
		String expectedTitle = "uru99 Bank Home Page";
		String actualTitle = driver.getTitle(); 
		assertEquals(actualTitle, expectedTitle, "Title does not matched");
		//Header	
		String expectedHeader = "Guru99 Bank";
		String actualHeader =  Loginpage.header();
		assertEquals(actualHeader, expectedHeader, "Title does not matched");

	}

	@Test(priority = 2)
	public void login_with_Invalid_Credentials() {
		Loginpage.enter_blank_userID();
		Loginpage.enter_blank_pwd();
		Loginpage.login();		
		driver.switchTo().alert().accept();
		
	}

	@Test(priority = 3)
	public void login_with_Valid_Credentials() {

		Loginpage.userID("mngr370422");
		Loginpage.pwd("EsuhYrY");
		BD_Manager_HomePage	BD_Manager_HomePageobj =  Loginpage.login();
		
		
		System.out.println("over");
		
	} 



}
