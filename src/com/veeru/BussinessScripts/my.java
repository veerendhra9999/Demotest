package com.veeru.BussinessScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.suppoters.propertiesReusables;
import com.veeru.selenium.Engines.ActionEngines;
import com.veeru.selenium.constantPaths.GmailPojoutility;

public class my extends ActionEngines {
	@Test
	public void mylogin() throws IOException {
		propertiesReusables pr=GmailPojoutility.getpropertiesResuablesObj(GmailPojoutility.getconfigFilePath());
		String url4=pr.getPropertyValue("url4");
		getd().get(url4);
		
	}

}
