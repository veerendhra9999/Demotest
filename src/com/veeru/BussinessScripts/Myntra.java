package com.veeru.BussinessScripts;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.suppoters.propertiesReusables;
import com.veeru.selenium.Engines.ActionEngines;
import com.veeru.selenium.Engines.DriverEngines;
import com.veeru.selenium.constantPaths.GmailPojoutility;

public class Myntra extends ActionEngines {
	@Test
	public void Myntralogin() throws IOException, InterruptedException {
propertiesReusables prcong=GmailPojoutility.getpropertiesResuablesObj(GmailPojoutility.getconfigFilePath());
		    getd().get(prcong.getPropertyValue("myntra_url"));
		    getd().manage().deleteAllCookies();
		    getd().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    propertiesReusables pror=GmailPojoutility.getpropertiesResuablesObj(GmailPojoutility.getOrFilePath());
		   String Men_xpath=pror.getPropertyValue("Men_xpath");
		   Actions actions= new Actions(getd());
		   actions.moveToElement(getd().findElement(By.xpath(Men_xpath))).perform();
		   actions.moveToElement(getd().findElement(By.cssSelector("a[href='/men-suits?src=tNav']"))).click().perform();
		   List list=getd().findElements(By.cssSelector(".common-checkboxIndicator"));
		   for(Object obj:list) {
			  WebElement ele= (WebElement)obj;
			  ele.click();
		   }
		   
		    
	}
	

}
