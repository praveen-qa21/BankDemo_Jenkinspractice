package testcases;

import org.testng.annotations.Test;

import bank_demo_pageObjects.BD_New_CustomerPage;

public class TC03_VerifyAddCustomerPage extends Baseclass{
	
	BD_New_CustomerPage addnew;
	
	@Test
	public void addNewCustomer() {
		addnew = new BD_New_CustomerPage(driver);
		addnew.setTxt_customer_Name("custthree");
		addnew.setRadbtn_gender_male();
		addnew.setPicker_dob("12.02.2001");
		addnew.setTxt_address("address entered");
		addnew.setTxt_city("city entered");
		addnew.setTxt_state("state entered");
		addnew.setNum_pinno("867612");
		addnew.setNum_telephoneno("87320784");
		addnew.setTxt_emailid("custthree@gmail.com");
		addnew.setTxt_password("nopassword");
		addnew.setBtn_submit();
		
		//customer number: 80090 
		
		
	}

}
