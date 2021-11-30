package bank_demo_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BD_Manager_HomePage{
	
	 WebDriver driver;	
	
	public BD_Manager_HomePage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="New Customer")
    private WebElement add_NewCustomer;
	
	@FindBy(xpath = "//td[text()='Manger Id : mngr370422']")
	private WebElement managerID;
	
	public String verifywelcometext() {
		return managerID.getText();
	}
	
	public BD_New_CustomerPage click_New_Customer() {
		add_NewCustomer.click();
		BD_New_CustomerPage BD_New_CustomerPageobj = new BD_New_CustomerPage(driver);
        return BD_New_CustomerPageobj;	
	}
	
	
	
	
	
	

}
