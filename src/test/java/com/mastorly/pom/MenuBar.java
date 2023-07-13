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
	By offerings = By.xpath("//span[text()='Offerings']");
	By Academic_Cycle = By.xpath("//span[text()='Academic Cycle']");
	By Batches = By.xpath("//span[text()='Batches']");
	By Fee_management = By.xpath("//span[text()='Fee management']");

	public void navigatingToDashboard() {
		action.moveToElement(driver.findElement(DashBoard)).click().perform();
	}

	public void navigatingToClassroom() {
		action.moveToElement(driver.findElement(Classroom)).click().perform();
	}

	public void navigatingToStudy_Material() {
		action.moveToElement(driver.findElement(Study_Material)).click().perform();
	}

	public void navigatingToTest_Pro() {
		action.moveToElement(driver.findElement(Test_Pro)).click().perform();
	}

	public void navigatingToUsers() {
		action.moveToElement(driver.findElement(Users)).click().perform();
	}

	public void navigatingToUsersStudent() {
		action.moveToElement(driver.findElement(UsersStudent)).click().perform();
	}

	public void navigatingToUsersAdmin_Tutor() {
		action.moveToElement(driver.findElement(UsersAdmin_Tutor)).click().perform();
	}

	public void navigatingToInstitute_Setup_Offerings() {
		action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(offerings)).click().perform();
	}

	public void navigatingToInstitute_Setup_AcademicCycle() {
		action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Academic_Cycle)).click().perform();
	}

	public void navigatingToInstitute_Setup_Batches() {
		action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Batches)).click().perform();
	}

	public void navigatingToFee_management() {
		action.moveToElement(driver.findElement(Fee_management)).click().perform();
	}
}
