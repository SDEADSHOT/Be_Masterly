package com.mastorly.testcase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.mastorly.pom.InstituteSetup_AcademicCycle;
import com.mastorly.pom.InstituteSetup_Batches;
import com.mastorly.pom.InstituteSetup_Offerings;
import com.mastorly.pom.LoginPage;
import com.mastorly.pom.MenuBar;
import com.mastorly.pom.Students;
import com.mastorly.utilities.Compare;
import com.mastorly_bemasterly.testdata.Data;

public class BaseClass {
	static public WebDriver driver = null;
	static LoginPage loginpage = null;
	static MenuBar menubar = null;
	static Students students = null;
	static Actions action = null;
	static Compare com = new Compare();
	static InstituteSetup_Offerings offerings;
	static WebDriverWait wait = null;
	static InstituteSetup_AcademicCycle academicCycle = null;
	static InstituteSetup_Batches batches = null;
	static JavascriptExecutor jse = null;
	static Data data = new Data();

	// @Parameters({ "browser", "s-url", "username", "password" })
	@BeforeTest
	public void baseTest() {
		if (data.browser().equalsIgnoreCase("Chrome"))
			driver = new ChromeDriver();
		else if (data.browser().equalsIgnoreCase("Firefox"))
			driver = new FirefoxDriver();
		else
			driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(data.mastorlyUrl());

		loginpage = new LoginPage(driver);
		loginpage.username().sendKeys(data.b_userName());
		
		loginpage.password().sendKeys(data.b_password());
		loginpage.signing_in().click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		menubar = new MenuBar(driver);
		students = new Students(driver);
		action = new Actions(driver);
		academicCycle = new InstituteSetup_AcademicCycle(driver);
		batches = new InstituteSetup_Batches(driver);
		jse = (JavascriptExecutor) driver;
		// com = new Compare();
		offerings = new InstituteSetup_Offerings(driver);
	}

}
