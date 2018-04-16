  package com.automation.suppoters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class propertiesReusables {
	private String filePath;
	private FileInputStream fip;
	private Properties pr;

	public  propertiesReusables(String filePath) throws IOException {
		this.filePath = filePath;
		fip = new FileInputStream(filePath);
		pr = new Properties();
		pr.load(fip);
	}

	public String getPropertyValue(String key) {
		String value = null;
		if (pr != null) {
			value = pr.getProperty(key);
		} else {
			System.out.println("properties object is pointing is null......");
	 		
		}
		return value;
	}

	public void setProperty(String key, String value) throws IOException {
		if (pr != null) {
			pr.setProperty(key, value);
			FileOutputStream fop = new FileOutputStream(filePath);
			pr.store(fop, "saved Sucussfully");
		} else {
			System.out.println("properties object is pointing to null");

		}
	}

	public void removeProperty(String Key) throws IOException {
		if (pr != null) {
			pr.remove(Key);
			FileOutputStream fop = new FileOutputStream(filePath);
			pr.store(fop, "saved Sucussfully");
		} else {
			System.out.println("properties object is pointing to null");
		}

	}

	public Map<String, String> getAllProperties() {
		Map<String, String> map = new LinkedHashMap();
		if (pr != null) {
			Set<Object> keys = pr.keySet();
			for (Object obj : keys) {
				String key = (String) obj;
				String Value = pr.getProperty(key);
				map.put(key, Value);
			}
		}
		return map;

	}

}


