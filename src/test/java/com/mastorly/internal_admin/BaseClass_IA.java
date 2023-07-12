package com.mastorly.internal_admin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mastorly.pom.LoginPage;
import com.mastorly.testdata.Data;

public class BaseClass_IA extends Data {

	static WebDriver driver = null;
	static LoginPage loginpage;
	static Data data = new Data();

	// @Parameters({ "browser", "url", "username", "password" })
	@Test
	public void baseTest() {

		if (browser.equalsIgnoreCase("Chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("Firefox"))
			driver = new FirefoxDriver();
		else
			driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(adminUrl);

		loginpage = new LoginPage(driver);
		loginpage.username().sendKeys("7262940840");
		loginpage.password().sendKeys("Genext@123");
		loginpage.signing_in().click();
	}
}