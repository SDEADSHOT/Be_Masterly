package com.mastorly.internal_admin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.mastorly.internal_admin_pom.Institutions;
import com.mastorly.internal_admin_pom.LoginPage;
import com.mastorly.internal_admin_pom.MenuBar;
import com.mastorly.testdata.InternalAdmin;

public class BaseClass_IA {

	static WebDriver driver;
	static WebDriverWait wait;
	static LoginPage loginpage;
	static MenuBar menubar;
	static Institutions institution;
	static InternalAdmin admindata = new InternalAdmin();

	// @Parameters({ "browser", "url", "username", "password" })
	@BeforeTest
	public void baseTest() {
		//System.out.println(data.browser());
		if (admindata.browser().equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (admindata.browser().equalsIgnoreCase("Firefox"))
			driver = new FirefoxDriver();
		else
			driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(admindata.adminUrl());

		loginpage = new LoginPage(driver);
		menubar = new MenuBar(driver);
		wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		institution = new Institutions(driver);
		loginpage.username().sendKeys(admindata.adminUN());
		loginpage.password().sendKeys(admindata.adminP());
		loginpage.signing_in().click();

	}
}