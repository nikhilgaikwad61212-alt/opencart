package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	public WebDriver d;
	public Logger logger;
	public Properties p;
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void steup(String os, String br) throws InterruptedException, IOException 
	{
		FileReader f=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(f);
		
		logger=LogManager.getLogger(this.getClass());
		switch(br) 
		{
		
		case "chrome": d=new ChromeDriver(); break;
		case "edge": d=new EdgeDriver();break;
		default: System.out.println("invalid br name"); return;
		
		}
		
	
	d.manage().deleteAllCookies();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//d.get("https://demo.nopcommerce.com/");
	d.get(p.getProperty("url"));
	d.manage().window().maximize();
	}



	@AfterClass
	public  void teardown() 
	 {
		// d.quit();
	 }
	
	
	public String randomstring()
	{
	String generatsting=RandomStringUtils.randomAlphabetic(5);
	return generatsting;
	}

	public String randomnumber()
	{
	String generatnum=RandomStringUtils.randomNumeric(10);
	return generatnum;
	}

	public String randomalphanumeric()
	{
	String generatsting=RandomStringUtils.randomAlphabetic(3);
	String generatnum=RandomStringUtils.randomNumeric(3);
	return (generatsting+"@"+generatnum);
	}

}
