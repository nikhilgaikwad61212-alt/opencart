package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DigitalDown;
import pageObjects.Homepage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC002_loginlink  extends BaseClass {

	@Test
	void logintest() {
		try {
		logger.info("starting execution tc002");
		
		Homepage hp=new Homepage(d);
		 hp.clickonloginbtn();
		 
		 
		 LoginPage lopa=new LoginPage(d);
		 lopa.txte(p.getProperty("email"));
		
		 lopa.txtp(p.getProperty("pass"));
		 
		 lopa.logincl();
		 
		 
		 DigitalDown digi=new DigitalDown(d);
		boolean status= digi.isbuttonexist();
		Assert.assertEquals(status, true);
		 
		}
		catch (Exception e) {
			Assert.fail();
		}
		logger.info("finish execution tc002");
		
	}
	
	
	
}
