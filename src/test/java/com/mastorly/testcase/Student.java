package com.mastorly.testcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Student extends BaseClass {
	@Test(priority = 1)
	public void TestCase_1() throws InterruptedException {
		/** Verify that admin is able to create a student */
		menubar.users();
		menubar.usersStudent();
		students.addStudent().click();

		students.scrollToPersonalInformation();
		students.studentName().sendKeys("Dasanapura");
		students.studentRollNumber().sendKeys("98829896249369");
		students.mobileNumber().sendKeys("9886645637");
		students.emailId().sendKeys("dummy@gmail.com");
		students.gender("Male");

		students.parentFirstName_1().sendKeys("Parent_1");
		students.parentLastName_1().sendKeys("L");
		students.ParentRelationship_1("Father");
		students.parentEmailID_1().sendKeys("parent2@gmail.com");
		students.Parent_Mobile_Number_1().sendKeys("9886645637");

		students.parentFirstName_2().sendKeys("Parent_2");
		students.parentLastName_2().sendKeys("L");
		students.ParentRelationship_2("Mother");
		students.parentEmailID_2().sendKeys("parent2@gmail.com");
		students.Parent_Mobile_Number_2().sendKeys("9886645637");

		students.address().sendKeys("Hesaraghatta");
		students.pinCode().sendKeys("560088");
		students.state("Karnataka");
		Thread.sleep(3000);
		students.city("117");

		// students.cancel().click();
		students.save().click();

	}

	@Test(priority = 2)
	public void TestCase_2() {
		/**
		 * Verify that admin is able to view newly created student in the student list.
		 */
		com.compareStudentWithList("Dasanapura");
	}

	@Parameters({ "StudentName" })
	@Test(priority = 3)
	public void TestCase_3(String student_Name) {
		students.getActiveStatus(student_Name);

	}

	@Test(priority = 4)
	public void TestCase_4() throws InterruptedException, AWTException {
		/** Verify that admin is able to create a student */
		menubar.users();
		menubar.usersStudent();
		students.bulkUpload().click();
		Thread.sleep(3000);
		students.uploadFile().sendKeys("C:\\Users\\User.TYSS-RAJESHWAR\\Downloads\\Student_1.csv");
		Thread.sleep(4000);
		students.upload().click();

	}
}
