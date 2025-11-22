package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalDown extends Base {
	
	
	public WebDriver d;
	
	public DigitalDown(WebDriver d)
	{
		super(d);
	}
	

	@FindBy(xpath="//a[@role='button'][normalize-space()='Digital downloads']")
	WebElement Dg;
	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement logoutbtn;
	
	
	public boolean isbuttonexist()
	{
		
		try {
			
			return Dg.isDisplayed();
		}
		catch (Exception e) 
		{
			return false;
		}
		
	}
	
	public void logout() {
		
		logoutbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
