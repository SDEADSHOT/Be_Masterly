package com.bemasterly.testcase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.mastorly.utilities.Import_Statements;

//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeTest;
//
//import com.bemasterly.pom.InstituteSetup_AcademicCycle;
//import com.bemasterly.pom.InstituteSetup_Batches;
//import com.bemasterly.pom.InstituteSetup_Offerings;
//import com.bemasterly.pom.InstituteSetup_Students;
//import com.bemasterly.pom.LoginPage;
//import com.bemasterly.pom.MenuBar;
//import com.mastorly.utilities.Compare;
//import com.mastorly.utilities.Import_Statements;
//import com.mastorly_bemasterly.testdata.Data;

public class BaseClass extends Import_Statements {
//	static public WebDriver driver = null;
//	static LoginPage loginpage = null;
//	static MenuBar menubar = null;
//	static InstituteSetup_Students students = null;
//	static Actions action = null;
//	static Compare com = new Compare();
//	static InstituteSetup_Offerings offerings;
//	static WebDriverWait wait = null;
//	static InstituteSetup_AcademicCycle academicCycle = null;
//	static InstituteSetup_Batches batches = null;
//	static JavascriptExecutor jse = null;
//	static Data data = new Data();

	@Parameters({ "browser" })
	@BeforeTest
	// public void baseTest() {
	public void baseTest(String browser) {
		// if (data.browser().equalsIgnoreCase("Chrome"))
		if (browser.equalsIgnoreCase("Chrome"))
			driver = new ChromeDriver();
		// else if (data.browser().equalsIgnoreCase("Firefox"))
		else if (browser.equalsIgnoreCase("Firefox"))
			driver = new FirefoxDriver();
		else
			driver = new EdgeDriver();

		Import_Statements is = new Import_Statements();
		is.Import_Statements(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(data.bemasterlyUrl());

//		loginpage = new LoginPage(driver);
		loginpage.username().sendKeys(data.b_userName());

		loginpage.password().sendKeys(data.b_password());
		loginpage.signing_in().click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//		menubar = new MenuBar(driver);
//		students = new InstituteSetup_Students(driver);
//		action = new Actions(driver);
//		academicCycle = new InstituteSetup_AcademicCycle(driver);
//		batches = new InstituteSetup_Batches(driver);
//		jse = (JavascriptExecutor) driver;
//		// com = new Compare();
//		offerings = new InstituteSetup_Offerings(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
