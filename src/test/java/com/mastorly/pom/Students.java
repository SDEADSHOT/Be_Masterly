package com.mastorly.pom;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mastorly.utilities.Scroll;

public class Students extends Scroll {
	static WebDriver driver = null;
	// public static Students students = new Students(driver);
	static Select select = null;
	Actions action = null;

	public Students(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);
		jse = (JavascriptExecutor) driver;

	}

	By Bulk_Upload = By.xpath("//a[text()='Bulk Upload']");
	By Add_Student = By.xpath("//a[text()='Add Student']");
	By Personal_Information = By.xpath("(//div[@class='nk-kycfm-content'])[1]");
	By Student_Name = By.xpath("//input[@name='first_name']");
	By Student_Roll_No = By.xpath("//input[@id='roll_no']");
	By Mobile_Number = By.xpath("//input[@name='mobile']");
	By Email_ID = By.xpath("//input[@name='email']");
	By Gender = By.xpath("//select[@name='gender']");
	By Parent_Information_1 = By.xpath("(//div[@class='nk-kycfm-content'])[2]");
	By Parent_First_Name_1 = By.xpath("(//input[@name='fname[]'])[1]");
	By Parent_Last_Name_1 = By.xpath("(//input[@name='lname[]'])[1]");
	By Parent_Relationship_1 = By.xpath("(//select[@name='parent_relationship[]'])[1]");
	By Parent_Mobile_Number_1 = By.xpath("(//input[@name='parent_mobile[]'])[1]");
	By Parent_Email_ID_1 = By.xpath("(//input[@name='parent_email[]'])[1]");
	By Parent_Information_2 = By.xpath("(//div[@class='nk-kycfm-content'])[3]");
	By Parent_First_Name_2 = By.xpath("(//input[@name='fname[]'])[2]");
	By Parent_Last_Name_2 = By.xpath("(//input[@name='lname[]'])[2]");
	By Parent_Relationship_2 = By.xpath("(//select[@name='parent_relationship[]'])[2]");
	By Parent_Mobile_Number_2 = By.xpath("(//input[@name='parent_mobile[]'])[2]");
	By Parent_Email_ID_2 = By.xpath("(//input[@name='parent_email[]'])[2]");
	By Address_Details = By.xpath("(//div[@class='nk-kycfm-content'])[4]");
	By Address = By.xpath("//input[@name='add1']");
	By Pin_code = By.xpath("//input[@type='number']");
	By State = By.xpath("//select[@name='state']");
	By City = By.xpath("//select[@name='city']");
	By Save = By.xpath("//button[text()='Save']");
	By Cancel = By.xpath("//a[text()='Cancel']");
	By Student_Lists = By.xpath("//td//span[@class='tb-lead']");
	By UploadFile = By.xpath("//div[@class='fileUploader']");
	By Upload = By.xpath("//a[text()='Upload']");

	public static void select(By ele) {
		select = new Select(driver.findElement(ele));
	}

	public WebElement bulkUpload() {
		return driver.findElement(Bulk_Upload);
	}

	public void scrollToPersonalInformation() {
		jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(Personal_Information));
	}

	public WebElement addStudent() {
		return driver.findElement(Add_Student);
	}

	public WebElement studentName() {
		return driver.findElement(Student_Name);
	}

	public WebElement studentRollNumber() {
		return driver.findElement(Student_Roll_No);
	}

	public WebElement mobileNumber() {
		return driver.findElement(Mobile_Number);
	}

	public WebElement emailId() {
		return driver.findElement(Email_ID);
	}

	public void gender(String gender) {
		select(Gender);
		select.selectByVisibleText(gender);
	}

	public WebElement parentInformation1() {
		return driver.findElement(Parent_Information_1);
	}

	public WebElement parentFirstName_1() {
		return driver.findElement(Parent_First_Name_1);
	}

	public WebElement parentLastName_1() {
		return driver.findElement(Parent_Last_Name_1);
	}

	public void ParentRelationship_1(String relation) {
		select(Parent_Relationship_1);
		select.selectByVisibleText(relation);
	}

	public WebElement Parent_Mobile_Number_1() {
		return driver.findElement(Parent_Mobile_Number_1);
	}

	public WebElement parentEmailID_1() {
		return driver.findElement(Parent_Email_ID_1);
	}

	public WebElement parentInformation2() {
		return driver.findElement(Parent_Information_2);
	}

	public WebElement parentFirstName_2() {

		return driver.findElement(Parent_First_Name_2);
	}

	public WebElement parentLastName_2() {
		return driver.findElement(Parent_Last_Name_2);
	}

	public void ParentRelationship_2(String relation) {
		select(Parent_Relationship_2);
		select.selectByVisibleText(relation);
	}

	public WebElement Parent_Mobile_Number_2() {
		return driver.findElement(Parent_Mobile_Number_2);
	}

	public WebElement parentEmailID_2() {
		return driver.findElement(Parent_Email_ID_2);
	}

	public WebElement address() {
		return driver.findElement(Address);
	}

	public WebElement pinCode() {
		return driver.findElement(Pin_code);
	}

	public void state(String state) {
		select(State);
		select.selectByVisibleText(state);
	}

	public void city(String city) {
		select(City);
		select.selectByValue(city);
	}

//	public void compareStudentWithList(String Student_name) {
//		List<WebElement> list = driver.findElements(Student_Lists);
//		for (WebElement l : list) {
//			if (l.equals(Student_name)) {
//				Assert.assertTrue(true);
//			}
//			if (l.equals(Student_name)) {
//				Assert.assertTrue(false);
//			}
//		}
//	}

	public List<WebElement> studentList() {
		return driver.findElements(Student_Lists);
	}

	public WebElement save() {
		return driver.findElement(Save);
	}

	public WebElement cancel() {
		return driver.findElement(Cancel);
	}

	public void getActiveStatus(String student_name) {
		WebElement ele = driver.findElement(
				By.xpath("//a[text()='" + student_name + "']//ancestor::tr//descendant::td[6]//descendant::a"));
		if ((ele.getText()).equalsIgnoreCase("Active")) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	public WebElement uploadFile() {
		return driver.findElement(UploadFile);
	}

	public WebElement upload() {
		return driver.findElement(Upload);
	}
}