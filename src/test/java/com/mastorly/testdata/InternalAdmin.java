package com.mastorly.testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class InternalAdmin {

	public static Properties prop;
	public static String browser;
	public static String adminUrl;
	public static String adminUN;
	public static String adminP;
	public static String domainName;
	public static String schoolName;
	public static String chooseFile;
	public static String adminName;
	public static String adminEmail;
	public static String adminPhoneNumber;
	public static String adminUserName;
	public static String adminPassword;

	public InternalAdmin() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Code_S_v2\\Be_Masterly\\src\\test\\java\\com\\mastorly\\testdata\\data.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String browser() {
		browser = prop.getProperty("browser");
		return browser;
	}

	public static String adminUrl() {
		return prop.getProperty("adminUrl");
	}

	public static String adminUN() {
		return prop.getProperty("adminUN");
	}

	public static String adminP() {
		return prop.getProperty("adminP");
	}

	public static String domainName() {
		return prop.getProperty("domainName");
	}

	public static String schoolName() {
		return prop.getProperty("schoolName");
	}

	public static String chooseFile() {
		return prop.getProperty("chooseFile");
	}

	public static String adminName() {
		return prop.getProperty("adminName");
	}

	public static String adminEmail() {
		return prop.getProperty("adminEmail");
	}

	public static String adminPhoneNumber() {
		return prop.getProperty("adminPhoneNumber");
	}

	public static String adminUserName() {
		return prop.getProperty("adminUserName");
	}

	public static String adminPassword() {
		return prop.getProperty("adminPassword");
	}
}
