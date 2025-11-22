package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
	
	
WebDriver d;

public Base(WebDriver d)
{
	this.d=d;
	
	PageFactory.initElements(d, this);
	
	
}
}
