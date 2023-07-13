package com.mastorly.internal_admin_pom;

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
	By Institute = By.xpath("//span[text()='Institute']");
	By Trial = By.xpath("//span[text()='Trial']");
	By Attendance = By.xpath("//span[text()='Attendance']");
	By Users = By.xpath("//span[text()='Users']");
	By Students = By.xpath("//span[text()='Students']");
	By Admins = By.xpath("//span[text()='Admins']");
	By Tutors = By.xpath("//span[text()='Tutors']");
	By Call_Now = By.xpath("//span[text()='Call Now']");
	By Classes = By.xpath("//span[text()='Classes']");
	By Subjects = By.xpath("//span[text()='Subjects']");
	By Schedule = By.xpath("//span[text()='Schedule']");
	By Live_Sessions = By.xpath("//span[text()='Live Sessions']");
	By Cart = By.xpath("//span[text()='Cart']");
	By Reports = By.xpath("//span[text()='Reports']");
	By Leads = By.xpath("//span[text()='Leads']");
	By Settings = By.xpath("//span[text()='Settings']");

	public void navigatingToDashboard() {
		action.moveToElement(driver.findElement(DashBoard)).click().perform();
	}

	public void navigatingToInstitue() {
		action.moveToElement(driver.findElement(Institute)).click().perform();
	}

	public void navigatingToTrial() {
		action.moveToElement(driver.findElement(Trial)).click().perform();
	}

	public void navigatingToAttendance() {
		action.moveToElement(driver.findElement(Attendance)).click().perform();
	}

	public void navigatingToStudents() {
		action.moveToElement(driver.findElement(Users)).click().perform();
		action.moveToElement(driver.findElement(Students)).click().perform();
	}

	public void navigatingToAdmins() {
		action.moveToElement(driver.findElement(Users)).click().perform();
		action.moveToElement(driver.findElement(Admins)).click().perform();
	}

	public void navigatingToTutors() {
		action.moveToElement(driver.findElement(Users)).click().perform();
		action.moveToElement(driver.findElement(Tutors)).click().perform();
	}

	public void navigatingToCallNow() {
		action.moveToElement(driver.findElement(Call_Now)).click().perform();
	}

	public void navigatingToClasses() {
		action.moveToElement(driver.findElement(Classes)).click().perform();
	}

	public void navigatingToSubjects() {
		action.moveToElement(driver.findElement(Subjects)).click().perform();
	}

	public void navigatingToSchedule() {
		action.moveToElement(driver.findElement(Schedule)).click().perform();
	}

	public void navigatingToLiveSession() {
		action.moveToElement(driver.findElement(Live_Sessions)).click().perform();
	}

	public void navigatingToCart() {
		action.moveToElement(driver.findElement(Cart)).click().perform();
	}
}
