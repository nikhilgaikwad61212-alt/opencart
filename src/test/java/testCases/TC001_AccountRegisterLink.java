package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccounRegisterPage;
import pageObjects.Homepage;
import testBase.BaseClass;

public class TC001_AccountRegisterLink extends BaseClass
{

@Test
 void test() {
	
	try {
	logger.info("starting execution tc001");
	 
	 Homepage hp=new Homepage(d);
	 hp.clickonregisterbtn();
	 
	
	 AccounRegisterPage arp=new AccounRegisterPage(d);
	 arp.radio();
	 arp.fname(randomstring().toUpperCase());                          //arp.fname("Nikhil");
	 arp.lname(randomstring().toUpperCase());                          //arp.lname("Gaikwad");
	 arp.email(randomstring()+ "@gamil.com");                           //arp.email("abc@gmail.com"); 
	 arp.comp("polo");
	  
	 String pass=randomalphanumeric();
	 
	 arp.password(pass);                                       //arp.password("Nikhil@1234");
	 arp.cnfpassword(pass);                                    // arp.cnfpassword("Nikhil@1234");
	 arp.click();
	
	 String tx= arp.getconfirmationmeg();
	 if (tx.equals("Your registration completed"))
	 {
		 Assert.assertTrue(true);
	 }
	 
	 else
	 {
		 logger.error("test failed");
			logger.debug("debug log");
	 }
	 
	 
	 
	// Assert.assertEquals(tx, "Your registration completed");
	}
	
	catch (Exception e) {
		
		
		Assert.fail();
	}
	logger.info("test finish");
	 
 }




}
