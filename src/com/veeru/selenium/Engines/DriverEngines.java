package com.veeru.selenium.Engines;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import com.veeru.selenium.Utilities.DriverKeys;


public class DriverEngines {
	private static WebDriver d;
	
	@BeforeSuite
	@Parameters("browser")
	public void openBrowser(@Optional("chrome")String browser) {
		String curDir=System.getProperty("user.dir");
		if(browser.equalsIgnoreCase("chrome")) {
	    System.setProperty(DriverKeys.chromekey,curDir+DriverKeys.chromevalue);
	    d=new ChromeDriver();
	    init();
	    
		}
		else if(browser.equalsIgnoreCase("firefox")){
		System.getProperty(DriverKeys.geckokey,curDir+DriverKeys.geckovalue);
		 d=new FirefoxDriver();
		init();
	}
	
		else if(browser.equalsIgnoreCase("ie")) {
			System.getProperty(DriverKeys.iekey,curDir+DriverKeys.ievalue);
			 d= new InternetExplorerDriver();
			init();
		}
	

	else {
		System.out.println("pass proper parameter");
	}
	}
		public void init() {
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
			d.manage().window().maximize();
		}
		
		@AfterSuite
		public void closebrowser() {
			if(d!=null) {
				d.close();
			} 
			 	else
			 		System.out.println("Webdriver is pointing to null");
			}
		
@AfterMethod
public void AfterTCExcution(ITestResult result) throws IOException {
	if (result.getStatus()==ITestResult.FAILURE){
	TakesScreenshot ts=(TakesScreenshot) d; 
	File image=ts.getScreenshotAs(OutputType.FILE);
	String projpath=System.getProperty("user.dir");
	String tcName=result.getName();
	FileUtils.copyFile(image,new File(projpath+"//screenshot//"+tcName+".jpeg"));
	System.out.println("Tc is failure take srceenshot");
	
	}
	else if(result.getStatus()==ITestResult.SUCCESS){
	System.out.println("TC is passaed no taking screenshot");
	}
}


  @BeforeMethod
  public void TCExecution(Method method) {
	  String tcname=method.getName();
  System.out.println("NOW Executing:"+method.getName());
  
  
  
  
}
    
public static WebDriver getd() {
	return d;
}



 }
 
	 

