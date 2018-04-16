package com.veeru.selenium.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public interface ScreenShot {
	public static void screenShot(WebDriver webdriver,String tcName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)webdriver;
		File image =ts.getScreenshotAs(OutputType.FILE);
		String projPath=System.getProperty("User.dir");
        FileUtils.copyFile(image, new File(projPath+"//Screenshot//"+tcName+".jpeg"));
        

	}

}
