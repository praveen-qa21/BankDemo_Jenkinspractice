package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bank_demo_pageObjects.BD_Manager_HomePage;
import bank_demo_pageObjects.BD_New_CustomerPage;

public class TC02_Verify_ManagerHomepage extends Baseclass{
	
	BD_Manager_HomePage mangerhomepage;
	SoftAssert softassert;  
	
	
	@Test(priority = 1) 
	public void verify_manager_home_page_title() {
		System.out.println("started1");
		mangerhomepage = new BD_Manager_HomePage(driver);
		String actualTitle = driver.getTitle();
		softassert = new SoftAssert();
		String expectedTitle =  "Guru99 Bank Manager HomePage";
		//String actualTitle = driver.getTitle();
		softassert.assertEquals(actualTitle, expectedTitle, "Title does not matched");
		String expHeader = "Manger Id : mngr370422";
		String actHeader = mangerhomepage.verifywelcometext();
		softassert.assertEquals(actHeader, expHeader, "Header does not matched");
		System.out.println("started2");
	}
	
	@Test(priority = 2)
	public void verifynewCustomer() {
		BD_New_CustomerPage BD_New_CustomerPageobj = mangerhomepage.click_New_Customer(); 
	} 
	
	
	
	
 

}
