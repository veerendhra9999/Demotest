package com.veeru.selenium.Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegExUtilities {
	public static boolean isValidMobNum(String pHNum) {
		boolean b=true;
		Pattern pattern= Pattern.compile("(0|[+]?91)?[6-9][0-9]{9}");
		Matcher matcher=pattern.matcher(pHNum);
		if(matcher.find()&&matcher.group().equalsIgnoreCase(pHNum)){
		System.out.println("VALID MOBILE NUMBER");
		}
		else
		{
			b=false;
			System.out.println("INVALID MOBILE NUMBER");	
		}
	return b;
		 
	}

}
