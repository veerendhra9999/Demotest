package com.veeru.BussinessScripts;

import org.testng.annotations.Test;

import com.veeru.selenium.Engines.DriverEngines;


public class Amazontest extends DriverEngines {
	@Test
	public void login() {
    getd().get("https://www.amazon.com");
	
    
	}
	

}


