package com.veeru.BussinessScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.suppoters.propertiesReusables;
import com.veeru.selenium.Engines.DriverEngines;
import com.veeru.selenium.constantPaths.GmailPojoutility;

public class Gtest extends DriverEngines  {
@Test
public void logIn() throws IOException {
	propertiesReusables pr=GmailPojoutility.getpropertiesResuablesObj(GmailPojoutility.getconfigFilePath());
       String url=pr.getPropertyValue("url");
       getd().get(url);
       
}
}
