package com.mastorly.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver = null;

	By username = By.name("username");
	By password = By.name("password");
	By sign_in = By.xpath("//button[text()='Sign in']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void username(String name) {
		driver.findElement(username).sendKeys(name);
	}

	public void password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void signing_in() {
		driver.findElement(sign_in).click();
	}
}
