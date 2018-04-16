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
import com.veeru.selenium.constantPaths.GmailPojoutility;

public class Jabong extends ActionEngines{
	@Test
	public void Jabonglogin() throws IOException {
		
		propertiesReusables pr=GmailPojoutility.getpropertiesResuablesObj(GmailPojoutility.getconfigFilePath());
		getd().get(pr.getPropertyValue("Jabong_url"));
		//getd().manage().deleteAllCookies();
		//getd().manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		propertiesReusables pror=GmailPojoutility.getpropertiesResuablesObj(GmailPojoutility.getOrFilePath());
		String Acessories_xpath=pror.getPropertyValue("Acessories_xpath");
		Actions action=new Actions(getd());
	    action.moveToElement(getd().findElement(By.xpath("Acessories_xpath)"))).build().perform();
		
		}
				
	}


