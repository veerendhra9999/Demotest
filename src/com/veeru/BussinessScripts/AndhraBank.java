package com.veeru.BussinessScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.suppoters.propertiesReusables;
import com.veeru.selenium.Engines.DriverEngines;

public class AndhraBank extends DriverEngines{
	@Test
	public void Login() throws IOException {
	propertiesReusables pr=new propertiesReusables("C:\\Users\\veerendhra\\eclipse-workspace\\FrameWorks\\src\\com\\veeru\\selenium\\configiration\\config.properties");	
String	url3=pr.getPropertyValue("ulr3");
getd().get(url3);

	}

}
