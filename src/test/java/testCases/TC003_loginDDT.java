package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DigitalDown;
import pageObjects.Homepage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_loginDDT extends BaseClass{


@Test (dataProvider="LoginData", dataProviderClass=DataProviders.class)
public void login_DDT(String email,String pass, String exp) {
	
	logger.info("tets start");
	try {
	Homepage hp=new Homepage(d);
	 hp.clickonloginbtn();
	 
	 
	 LoginPage lopa=new LoginPage(d);
	 lopa.txte(email);
	
	 lopa.txtp(pass);
	 
	 lopa.logincl();
	 
	 
	 DigitalDown digi=new DigitalDown(d);
	boolean status= digi.isbuttonexist();

	
	/*
	 1) Data is valid  login success- test pass-logout
	                   login failed- test fail
	  2) data is invalid       login success-test fail
                               login failed- tets pass  	                   
	                   
	 */
	
	
	
	 if (exp.equalsIgnoreCase("Valid")) {
		 
		 if(status==true) {
			 
			 digi.logout();
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Assert.assertTrue(false);
		 }
		 
	 }
	 
	 if (exp.equalsIgnoreCase("Invalid")) {
		 
		 if (status==true) {
			 
			 digi.logout();
			 Assert.assertTrue(false);
		 }
		 
		 else 
		 {
			 Assert.assertTrue(true);
		 }
		 
		 
	 }
	}
	
	catch (Exception e) {
		
		Assert.fail();
	}
	
	

}


}
