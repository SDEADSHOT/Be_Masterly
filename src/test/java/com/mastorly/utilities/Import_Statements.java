package com.mastorly.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bemasterly.pom.InstituteSetup_AcademicCycle;
import com.bemasterly.pom.InstituteSetup_Batches;
import com.bemasterly.pom.InstituteSetup_Offerings;
import com.bemasterly.pom.InstituteSetup_Students;
import com.bemasterly.pom.LoginPage;
import com.bemasterly.pom.MenuBar;
import com.mastorly_bemasterly.testdata.Data;

public class Import_Statements {
	static public WebDriver driver;
	static public LoginPage loginpage;
	static public MenuBar menubar;
	static public InstituteSetup_Students students;
	static public Actions action;
	static public Compare com = new Compare();
	static public InstituteSetup_Offerings offerings;
	static public WebDriverWait wait;
	static public InstituteSetup_AcademicCycle academicCycle;
	static public InstituteSetup_Batches batches;
	static public JavascriptExecutor jse;
	static public Data data= new Data();
	

	public void Import_Statements(WebDriver driver) {
		this.driver = driver;
		loginpage = new LoginPage(driver);
		menubar = new MenuBar(driver);
		students = new InstituteSetup_Students(driver);
		action = new Actions(driver);
		academicCycle = new InstituteSetup_AcademicCycle(driver);
		batches = new InstituteSetup_Batches(driver);
		jse = (JavascriptExecutor) driver;
		com = new Compare();
		offerings = new InstituteSetup_Offerings(driver);
	}
}
