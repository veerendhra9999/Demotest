package com.veeru.selenium.constantPaths;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.automation.suppoters.ExcelReader;
import com.automation.suppoters.propertiesReusables;
import com.veeru.selenium.Engines.ActionEngines;

public class GmailPojoutility extends ActionEngines {
	private static ExcelReader er;
	private static propertiesReusables pr;
	private static String configFilePath=getPath()+"\\src\\com\\veeru\\selenium\\configiration\\config.properties"; 
	private static String OrFilePath=getPath()+ "\\src\\com\\veeru\\selenium\\Orfile\\OR.Gmail.properties";
	private static String excelFilePath=getPath()+ "\\src\\com\\veeru\\ExcelFile\\Book1.xlsx";
	private static String TextFilePath=getPath()+ "\\src\\co\\veeru\\selenium\\textFile\\data.txt";
	public static String getOrFilePath() {
		return OrFilePath;
	}
	public static String getconfigFilePath() {
		return configFilePath;	
	}
	public static ExcelReader getExcelFilePathobj() throws EncryptedDocumentException, InvalidFormatException, IOException {
		 er=new ExcelReader(excelFilePath);
		return er;
	}
	 public static propertiesReusables getpropertiesResuablesObj(String filepath) throws IOException {
		  pr=new propertiesReusables(filepath);
		 return pr;
	 }
	
	public static String getPath() {
		return System.getProperty("user.dir");
	}
	
		
	}
	

