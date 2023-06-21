package com.openCart_TestFrameworkUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	
	static Properties props;
	
	
	public static Properties getProp() {
		props=new Properties();
		try {
			FileInputStream fs=new FileInputStream("config/config.properties");
			props.load(fs);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
		
		
		return props;
		
	}
	

}
