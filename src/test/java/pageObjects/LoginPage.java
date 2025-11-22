package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base 

{

public WebDriver d;

public LoginPage(WebDriver d) {
	
	super(d);
}




//button[normalize-space()='Log in']



@FindBy(xpath="//input[@id='Email']")
WebElement txtemail;

@FindBy(xpath="//div[@class='form-fields']")
WebElement txtpass;

@FindBy(xpath="//button[normalize-space()='Log in']")
WebElement loginbutton;



public void txte(String email)
{
txtemail.sendKeys(email);	
}

public void txtp(String pass) {
	
	txtpass.sendKeys(pass);
}

public void logincl() {
	
	loginbutton.click();
}












}
