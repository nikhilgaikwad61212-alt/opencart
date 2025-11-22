package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccounRegisterPage extends Base
{
	public WebDriver d;
	
	public AccounRegisterPage(WebDriver d) 
	{
		super(d);
	}

	
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement radiobutton;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement txtfname;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement txtlname;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement mail;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement txtcomp;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement cnfpass;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement button;
	
	@FindBy(xpath="//div[@class='result']")
	WebElement text;
	//"Your registration completed"
	
	
	public void radio() {
		
		radiobutton.click();
	}
	
	
	public void fname (String fname) 
	{
		txtfname.sendKeys(fname);
	}
	
	public void lname (String lname) 
	{
		txtlname.sendKeys(lname);
	}
	
	public void email (String em) 
	{
		mail.sendKeys(em);
	}
	
	public void comp (String com) 
	{
		txtcomp.sendKeys(com);
	}
	

	public void password (String pa)
	{
		pass.sendKeys(pa);
	}
	
	public void cnfpassword (String cfpa)
	{
		cnfpass.sendKeys(cfpa);
	}
	
	
	public void click() {
		
		button.click();
	}
	

	
	public String getconfirmationmeg() {
		
		try {
			
			return(text.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
			
		}
		
	}
	
	
}
