package com.veeru.BussinessScripts;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.suppoters.propertiesReusables;
import com.veeru.selenium.Engines.ActionEngines;
import com.veeru.selenium.Engines.DriverEngines;


public  class GmailTest  extends ActionEngines{

	@Test
	public  void login() throws IOException, InterruptedException {
		propertiesReusables pr = new propertiesReusables("C:\\Users\\veerendhra\\eclipse-workspace\\FrameWorks\\src\\com\\veeru\\selenium\\configiration\\config.properties");
	String url = pr.getPropertyValue("url");
	getd().get(url);
	
	propertiesReusables pror = new propertiesReusables("C:\\Users\\veerendhra\\eclipse-workspace\\FrameWorks\\src\\com\\veeru\\selenium\\Orfile\\OR.Gmail.properties");
	String un_xpath = pror.getPropertyValue("un_xpath");
	String un = pr.getPropertyValue("un");
	getd().findElement(By.xpath(un_xpath)).sendKeys(un);
	
	String next_xpath=pror.getPropertyValue("next_xpath");
	getd().findElement(By.xpath(next_xpath)).click();
	Thread.sleep(5000);
	
	String pwd_id = pror.getPropertyValue("pwd_id");
	String pass =pr.getPropertyValue("pass");
	getd().findElement(By.cssSelector(pwd_id)).sendKeys("pass");
	Thread.sleep(2000);	
	
	
	String signin_id=pror.getPropertyValue("signin_id");
	getd().findElement(By.id(signin_id)).click();
	
	
	
	
	
	}
}
	






