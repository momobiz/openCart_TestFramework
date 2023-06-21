package com.openCart_TestFrameworkUtilities;

public class ProcessData {

	public static String processString(String str) {
		int i;

		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.')
				break;

		}
		return str.substring(0, i);

	}
	public static String getNewsletterchoice(String str) {
		String newsletter;
		if(str.contentEquals("TRUE")) newsletter="1";
		else newsletter="0";
		
		
		return newsletter;
	}

	
}
