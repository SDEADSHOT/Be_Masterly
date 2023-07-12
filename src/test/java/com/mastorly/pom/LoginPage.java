package com.mastorly.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver = null;

	By username = By.name("username");
	By password = By.name("password");
	By sign_in = By.xpath("//button[text()='Sign in']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement username() {
		return driver.findElement(username);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement signing_in() {
		return driver.findElement(sign_in);
	}
}
