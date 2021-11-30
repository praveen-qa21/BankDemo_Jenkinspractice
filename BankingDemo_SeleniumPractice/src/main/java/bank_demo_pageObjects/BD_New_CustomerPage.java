package bank_demo_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BD_New_CustomerPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//p[text()='Add New Customer']")
	private WebElement newCustomer_Header;	
	@FindBy(name ="name")
	private WebElement txt_customer_Name;
	@FindBy(xpath = "//input[@type='radio'and@value ='m']")
	private WebElement radbtn_gender_male;
	@FindBy(xpath = "//input[@type='radio'and@value ='f']")
	private WebElement radbtn_gender_female;	
	@FindBy(id ="dob")
	private WebElement picker_dob;
	@FindBy(name = "addr")
	private WebElement txt_address;
	@FindBy(name = "city")
	private WebElement txt_city;
	@FindBy(name = "state")
	private WebElement txt_state;
	@FindBy(name = "pinno")
	private WebElement num_pinno;
	@FindBy(name = "telephoneno")
	private WebElement num_telephoneno;
	@FindBy(name = "emailid")
	private WebElement txt_emailid;
	@FindBy(name = "password")
	private WebElement txt_password;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement btn_submit;
	
	
	public String setNewCustomer_Header() {
		return newCustomer_Header.getText();
	}
	public void setTxt_customer_Name(String customer_Name) {
		txt_customer_Name.sendKeys(customer_Name);
	}
	
	public void setRadbtn_gender_male() {
		radbtn_gender_male.click();
	}
	public void setRadbtn_gender_female() {
		radbtn_gender_female.click();
	}
	public void setPicker_dob(String dob) {
		picker_dob.sendKeys(dob);
	}
	public void setTxt_address(String address) {
		txt_address.sendKeys(address);
	}
	public void setTxt_city(String city) {
		txt_city.sendKeys(city);
	}
	public void setTxt_state(String city) {
		txt_state.sendKeys(city);
	}
	public void setNum_pinno(String pinno) {
		num_pinno.sendKeys(pinno);
	}
	public void setNum_telephoneno(String teleno) {
		num_telephoneno.sendKeys(teleno);
	}
	public void setTxt_emailid(String mailid) {
		txt_emailid.sendKeys(mailid);
	}
	public void setTxt_password(String pwd) {
		txt_password.sendKeys(pwd);
	}
	public void setBtn_submit() {
		btn_submit.click();
		}
	
	 public BD_New_CustomerPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
				 
	 }
	
	
	
	
	
	
	
	

}
