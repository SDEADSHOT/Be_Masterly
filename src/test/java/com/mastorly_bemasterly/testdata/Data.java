package com.mastorly_bemasterly.testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data {
	public static Properties prop;

	public Data() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Code_S_v2\\Be_Masterly\\src\\test\\java\\com\\mastorly_bemasterly\\testdata\\data.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String browser() {
		return prop.getProperty("browser");
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

	public static String mastorlyUrl() {
		return prop.getProperty("mastorlyUrl");
	}

	public static String bemasterlyUrl() {
		return prop.getProperty("bemasterlyUrl");
	}

	public static String b_userName() {
		return prop.getProperty("B_userName");
	}

	public static String b_password() {
		return prop.getProperty("B_password");
	}

	public static String b_studentName() {
		return prop.getProperty("B_studentName");
	}

	public static String b_rollNumber() {
		return prop.getProperty("B_rollNumber");
	}

	public static String b_MobileNumber() {
		return prop.getProperty("B_MobileNumber");
	}

	public static String b_email() {
		return prop.getProperty("B_email");
	}

	public static String b_gender() {
		return prop.getProperty("B_gender");
	}

	public static String b_ParentFirstName_1() {
		return prop.getProperty("B_ParentFirstName_1");
	}

	public static String b_ParentLastName_1() {
		return prop.getProperty("B_ParentLastName_1");
	}

	public static String b_ParentEmail_1() {
		return prop.getProperty("B_ParentEmail_1");
	}

	public static String b_ParentMobileNumber_1() {
		return prop.getProperty("B_ParentMobileNumber_1");
	}

	public static String b_ParentFirstName_2() {
		return prop.getProperty("B_ParentFirstName_2");
	}

	public static String b_ParentLastName_2() {
		return prop.getProperty("B_ParentLastName_2");
	}

	public static String b_ParentEmail_2() {
		return prop.getProperty("B_ParentEmail_2");
	}

	public static String b_ParentMobileNumber_2() {
		return prop.getProperty("B_ParentMobileNumber_2");
	}

	public static String b_Address() {
		return prop.getProperty("B_Address");
	}

	public static String b_pincode() {
		return prop.getProperty("B_pincode");
	}

	public static String b_state() {
		return prop.getProperty("B_state");
	}

	public static String b_fileUpload() {
		return prop.getProperty("B_fileUpload");
	}

	public static String b_relation_1() {
		return prop.getProperty("B_relation_1");
	}

	public static String b_relation_2() {
		return prop.getProperty("B_relation_2");
	}

	public static String b_nameofExam() {
		return prop.getProperty("B_NameofExam");
	}

	public static String b_mediumOfInstruction() {
		return prop.getProperty("B_MediumOfInstruction");
	}
	
	public static String b_levelStandard() {
		return prop.getProperty("B_Level_Standard");
	}
	
	public static String b_subject() {
		return prop.getProperty("B_Subject");
	}
	
	public static String b_nameOfAcademicCycle() {
		return prop.getProperty("B_NameOfAcademicCycle");
	}
	
	public static String b_offerings() {
		return prop.getProperty("B_offerings");
	}
}
