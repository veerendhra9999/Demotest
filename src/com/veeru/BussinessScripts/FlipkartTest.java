package com.veeru.BussinessScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.suppoters.propertiesReusables;
import com.veeru.selenium.Engines.DriverEngines;

public class FlipkartTest extends DriverEngines {
	@Test
	private void flipkartlogin() throws IOException {
		propertiesReusables pr = new propertiesReusables("C:\\Users\\veerendhra\\eclipse-workspace\\FrameWorks\\src\\com\\veeru\\selenium\\configiration\\config.properties");
		 String url=pr.getPropertyValue("url1");
		 getd().get(url);
      
		 
           
	}

}
