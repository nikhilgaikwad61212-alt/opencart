package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Base

{

	public WebDriver d;
	 public Homepage(WebDriver d) {
		 super(d);
		 
		 
	 }
	
	
	 @FindBy(xpath="//a[normalize-space()='Register']")
	 WebElement registerb;
	 
	
	 public void clickonregisterbtn() {
		 
		 
		 registerb.click();
	 }
	 
	 
	 @FindBy(xpath="//a[normalize-space()='Log in']")
	 WebElement loginb;
	 
public void clickonloginbtn() {
		 
		 
		 loginb.click();
	 }
	 
	 
	 
	 
	 
	
	
}
