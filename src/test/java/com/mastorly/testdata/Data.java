package com.mastorly.testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data {
	public  static String browser;
	public  static String adminUrl;
	public  static String adminUN;
	public  static String adminP;
	public  static String domainName;
	public  static String schoolName;
	public  static String chooseFile;
	public  static String adminName;
	public  static String adminEmail;
	public  static String adminPhoneNumber;
	public  static String adminUserName;
	public  static String adminPassword;

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Code_S_v2\\Be_Masterly\\src\\test\\java\\com\\mastorly\\testdata\\data.properties");
		prop.load(fis);
		browser = (String) prop.get("browser");
		adminUrl = prop.getProperty("adminUrl");
		adminUN = prop.getProperty("adminUN");
		adminP = prop.getProperty("adminP");
		domainName = prop.getProperty("domainName");
		schoolName = prop.getProperty("schoolName");
		chooseFile = prop.getProperty("chooseFile");
		adminName = prop.getProperty("adminName");
		adminEmail = prop.getProperty("adminEmail");
		adminPhoneNumber = prop.getProperty("adminPhoneNumber");
		adminUserName = prop.getProperty("adminUserName");
		adminPassword = prop.getProperty("adminPassword");
	}
}
