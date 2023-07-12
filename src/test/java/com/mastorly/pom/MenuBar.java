package com.mastorly.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuBar {
	WebDriver driver = null;
	Actions action = null;

	public MenuBar(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);
	}

	By DashBoard = By.xpath("//span[text()='Dashboard']");
	By Classroom = By.xpath("//span[text()='Classroom']");
	By Study_Material = By.xpath("//span[text()='Study Material']");
	By Test_Pro = By.xpath("//span[text()='Test Pro']");
	By Users = By.xpath("//span[text()='Users']");
	By UsersStudent = By.xpath("//span[text()='Students']");
	By UsersAdmin_Tutor = By.xpath("//span[text()='Admin/Tutors']");
	By Institute_Setup = By.xpath("//span[text()='Institute Setup']");
	By Fee_management = By.xpath("//span[text()='Fee management']");

	public void dashboard() {
		action.moveToElement(driver.findElement(DashBoard)).click().perform();
	}

	public void classroom() {
		action.moveToElement(driver.findElement(Classroom)).click().perform();
	}

	public void study_Material() {
		action.moveToElement(driver.findElement(Study_Material)).click().perform();
	}

	public void test_Pro() {
		action.moveToElement(driver.findElement(Test_Pro)).click().perform();
	}
	
	public void users() {
		action.moveToElement(driver.findElement(Users)).click().perform();
	}

	public void usersStudent() {
		action.moveToElement(driver.findElement(UsersStudent)).click().perform();
	}

	public void usersAdmin_Tutor() {
		action.moveToElement(driver.findElement(UsersAdmin_Tutor)).click().perform();
	}

	public void institute_Setup() {
		action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
	}

	public void fee_management() {
		action.moveToElement(driver.findElement(Fee_management)).click().perform();
	}
}
