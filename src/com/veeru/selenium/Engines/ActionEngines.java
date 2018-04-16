package com.veeru.selenium.Engines;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionEngines extends DriverEngines {
	private static WebElement element;
	public static void enterData(String locMech,String locType, String testData) {
	switch (locMech)
	{
	case "id":
	element=getd().findElement(By.id(locType));
	if(element.isDisplayed()&&element.isEnabled()) {
		element.clear();
		element.sendKeys(testData);
		break;
	}
	else
		System.out.println("Unable to perfome DATA TYPE ACTIONS:"+element);
	
	case "css":
		element=getd().findElement(By.cssSelector(locType));
		if(element.isDisplayed()&&element.isEnabled()) {
			element.clear();
			element.sendKeys(testData);
			break;
		}
		else 
			System.out.println("Unable to perfome Data Type Actions:"+element);
	case "xpath":
		element=getd().findElement(By.xpath(locType));
		if(element.isDisplayed()&&element.isEnabled()) {
			element.clear();
			element.sendKeys(testData);
			break;
		}
		else
			System.out.println("unable to perfome Data Type Actions:"+element);
		
	case "className":
		element=getd().findElement(By.className(locType));
		if(element.isDisplayed()&&element.isEnabled()) {
			element.clear();
			element.sendKeys(testData);
			break;
		}
		else
			System.out.println("unable to perfome Data Type Actions:"+element);
		
	case "name":
		element=getd().findElement(By.name(locType));
		if(element.isDisplayed()&&element.isEnabled()) {
			element.clear();
			element.sendKeys(testData);
			break;
		}
		else
			System.out.println("unable to perfome Data Type Actions:"+element);
		
	case "linkText":
		element=getd().findElement(By.linkText(locType));
		if(element.isDisplayed()&&element.isEnabled()) {
			element.clear();
			element.sendKeys(testData);
			break;
		}
		else
			System.out.println("unable to perfome DATA TYPE ACTIONS:"+element);
		
		
	case "partialLinkText":
		element=getd().findElement(By.partialLinkText(locType));
		if(element.isDisplayed()&&element.isEnabled()) {
			element.clear();
			element.sendKeys(testData);
			break;
		}
		else
			System.out.println("unable to perfome DATA TYPE ACTIONS:"+element);
	}
	}
		
	public static void Click(String locMech,String locType, String testData) {
		switch (locMech)
		{
		case "id":
		element=getd().findElement(By.id(locType));
		if(element.isDisplayed()&&element.isEnabled()) {
			element.click();
			break;
		}
		else
			System.out.println("Unable to perfome clickable ACTIONS:"+element);
		
		case "css":
			element=getd().findElement(By.cssSelector(locType));
			if(element.isDisplayed()&&element.isEnabled()) {
				element.click();
				
				break;
			}
			else 
				System.out.println("Unable to perfome clickable Actions:"+element);
		case "xpath":
			element=getd().findElement(By.xpath(locType));
			if(element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}
			else
				System.out.println("unable to perfome clickable Actions:"+element);
			
		case "className":
			element=getd().findElement(By.className(locType));
			if(element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}
			else
				System.out.println("unable to perfome clickable Actions:"+element);
			
		case "name":
			element=getd().findElement(By.name(locType));
			if(element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}
			else
				System.out.println("unable to perfome clickable Actions:"+element);
			
		case "linkText":
			element=getd().findElement(By.linkText(locType));
			if(element.isDisplayed()&&element.isEnabled()) {
				element.click();
			  break;
			}
			else
				System.out.println("unable to perfome clickable ACTIONS:"+element);
			
			
		case "partialLinkText":
			element=getd().findElement(By.partialLinkText(locType));
			if(element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}
			else
				System.out.println("unable to perfome clickable ACTIONS:"+element);
		}
		}
		public static void mouseHover(String locMech,String locType)	{
			Actions actions=new Actions(getd());
			switch(locMech) {
			
			case "id":
				element=getd().findElement(By.id(locType));
				explicitwait(element);
				if(element.isDisplayed()&&element.isEnabled()) {
					actions.moveToElement(element).build().perform();
					break;
				}
				else
					System.out.println("unable to perfome MOUSERHOVER actions:"+element);
				
			case "css":
				element=getd().findElement(By.cssSelector(locType));
				explicitwait(element);
				if(element.isDisplayed()&&element.isEnabled()) {
					actions.moveToElement(element).build().perform();
					break;
				}
				else
					System.out.println("unable to perfome mouserhover Actions:"+element);
				
			case "xpath":
				element=getd().findElement(By.xpath(locType));
				explicitwait(element);
				if(element.isDisplayed()&&element.isEnabled()) {
					actions.moveToElement(element).build().perform();
					break;
				}
				else
					System.out.println("unable to perfome mousehover actions:"+element);
				  
			case "className":
				element=getd().findElement(By.className(locType));
				explicitwait(element);
				if(element.isDisplayed()&&element.isEnabled()) {
					actions.moveToElement(element).build().perform();
					break;
				}
				else
					System.out.println("unable to perfome mouserHover actions:"+element);
				
			case "name":
				element=getd().findElement(By.name(locType));
				explicitwait(element);
				if(element.isDisplayed()&&element.isEnabled()) {
					actions.moveToElement(element).build().perform();
					break;
				}
				else
					System.out.println("unable to perfome mouserHover actions:"+element);
				
			case  "linkText":
				element=getd().findElement(By.linkText(locType));
				explicitwait(element);
				if(element.isDisplayed()&&element.isEnabled()) {
					actions.moveToElement(element).build().perform();
					break;
				}
				else
					System.out.println("unable to perfome mouserhover action:"+element);
				
			case "paratialLinkText":
				element=getd().findElement(By.partialLinkText(locType));
				explicitwait(element);
				if(element.isDisplayed()&&element.isEnabled()) {
					actions.moveToElement(element).build().perform();
					break;
				}
				else
					System.out.println("unable to perfome mouserHover actions:"+element);
			}
		}

		private static void explicitwait(WebElement element) {
			WebDriverWait wait=new WebDriverWait(getd(),90);
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}
			public static void switchtoFrameByIndex(int index)		{
				if(getd()!=null) {
					getd().switchTo().frame(index);
				}
			}
					
			public static void switchtoFrameByIdName(String idname)	{
				if(getd()!=null) {
					getd().switchTo().frame(idname);
					
				}
			}
				public static void switchtoFrameByIdName(WebElement element) {
					if(getd()!=null) {
						getd().switchTo().frame(element);
						
					}
				}
				public static void CloseWindow() {
					if(getd()!=null) {
						getd().close();
					}
				}
					
				
}
