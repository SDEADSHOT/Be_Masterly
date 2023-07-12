package com.mastorly.internal_admin_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mastorly.utilities.Scroll;

public class Institutions extends Scroll {
	WebDriver driver = null;

	Institutions(WebDriver driver) {
		this.driver = driver;
		jse = (JavascriptExecutor) driver;
	}

	By Search = By.xpath("//span[text()='Search']");
	By Add_Button = By.xpath("(//a[contains(@class,'btn-icon btn-primary')])[1]");
	By Add_Institution = By.xpath("//span[text()='Add Institution']");
	By Enter_Domain = By.xpath("//input[@name='domain']");
	By Enter_Institute = By.xpath("//input[@name='institute_name']");
	By Choose_File = By.xpath("//label[text()='Choose file']");
	By Name = By.xpath("//input[@name='name']");
	By Email = By.xpath("//input[@name='email']");
	By Mobile_Number = By.xpath("//input[@name='mobile_masked']");
	By Username = By.xpath("//input[@name='username']");
	By Password = By.xpath("//input[@name='password']");
	By Submit = By.xpath("//button[text()='Submit']");

	public WebElement search() {
		return driver.findElement(Search);
	}

	public WebElement addButton() {
		return driver.findElement(Add_Button);
	}

	public WebElement addInsititution() {
		return driver.findElement(Add_Institution);
	}

	public WebElement domainName() {
		return driver.findElement(Enter_Domain);
	}

	public WebElement institueName() {
		return driver.findElement(Enter_Institute);
	}

	public WebElement uploadLogo() {
		return driver.findElement(Choose_File);
	}

	public WebElement name() {
		return driver.findElement(Name);
	}

	public WebElement emailAddress() {
		return driver.findElement(Email);
	}

	public WebElement mobileNumber() {
		return driver.findElement(Mobile_Number);
	}

	public WebElement userNamer() {
		return driver.findElement(Username);
	}

	public WebElement password() {
		return driver.findElement(Password);
	}

	public WebElement submit() {
		return driver.findElement(Submit);
	}
}