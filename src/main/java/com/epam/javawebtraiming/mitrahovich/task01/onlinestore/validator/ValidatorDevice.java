package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.validator;

import java.util.regex.Pattern;

public class ValidatorDevice {
	public static final String REGEX_TV = "";
	public static final String REGEX_LAPTOP = "";
	public static final String REGEX_MOBILE_PHONE = "";

	public ValidatorDevice() {

	}

	public static String validate(String text) {

		String[] tempBase = text.split("\n");
		StringBuilder sb = new StringBuilder();
		for (String str : tempBase) {
			if (checkTV(str) || checkLaptop(str) || checkMobilePhone(str)) {
				sb.append(str).append("\n");
			}
		}

		return sb + "";
	}

	private static boolean checkTV(String text) {
		Pattern regexTv = Pattern.compile(REGEX_TV);

		return regexTv.matcher(text).matches();
	}

	private static boolean checkLaptop(String text) {
		Pattern regexTv = Pattern.compile(REGEX_LAPTOP);

		return regexTv.matcher(text).matches();
	}

	private static boolean checkMobilePhone(String text) {
		Pattern regexTv = Pattern.compile(REGEX_MOBILE_PHONE);

		return regexTv.matcher(text).matches();
	}

}
