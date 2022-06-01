package com.tutorial.utils;

public class ValidateUtils {
	public static boolean isNotBlank(String input) {
		if (input != null && input != "") {
			return true;
		}
		return false;
	}

	public static boolean isNotNull(Object input) {
		if (input != null) {
			return true;
		}
		return false;
	}

}
