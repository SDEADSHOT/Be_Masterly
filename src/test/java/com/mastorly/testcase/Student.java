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
		menubar.navigatingToUsers();
		menubar.navigatingToUsersStudent();
		students.addStudent().click();
		students.scrollToPersonalInformation();
		students.studentName().sendKeys(data.b_studentName());
		students.studentRollNumber().sendKeys(data.b_rollNumber());
		students.mobileNumber().sendKeys(data.b_rollNumber());
		students.emailId().sendKeys(data.b_email());
		students.gender(data.b_gender());

		students.parentFirstName_1().sendKeys(data.b_ParentFirstName_1());
		students.parentLastName_1().sendKeys(data.b_ParentLastName_1());
		students.ParentRelationship_1(data.b_relation_1());
		students.parentEmailID_1().sendKeys(data.b_ParentEmail_1());
		students.Parent_Mobile_Number_1().sendKeys(data.b_ParentMobileNumber_1());

		students.parentFirstName_2().sendKeys(data.b_ParentFirstName_2());
		students.parentLastName_2().sendKeys(data.b_ParentLastName_2());
		students.ParentRelationship_2(data.b_relation_2());
		students.parentEmailID_2().sendKeys(data.b_ParentEmail_2());
		students.Parent_Mobile_Number_2().sendKeys(data.b_ParentMobileNumber_2());

		students.address().sendKeys(data.b_Address());
		students.pinCode().sendKeys(data.b_pincode());
		students.state(data.b_state());
		Thread.sleep(3000);
		students.city("117");

		// students.cancel().click();
		// students.save().click();

	}

	@Test(priority = 2)
	public void TestCase_2() {
		/**
		 * Verify that admin is able to view newly created student in the student list.
		 */
		com.compareStudentWithList(data.b_studentName());
	}

	@Parameters({ "StudentName" })
	@Test(priority = 3)
	public void TestCase_3(String student_Name) {
		students.getActiveStatus(data.b_studentName());

	}

	@Test(priority = 4)
	public void TestCase_4() throws InterruptedException, AWTException {
		/** Verify that admin is able to create a student */
		menubar.navigatingToUsers();
		menubar.navigatingToUsersStudent();
		students.bulkUpload().click();
		Thread.sleep(3000);
		// jse.executeAsyncScript("arguments[0].click();", students.uploadFile());
		students.uploadFile().click();
		Thread.sleep(3000);
		students.uploadingFile(data.b_fileUpload());
		Thread.sleep(4000);

		// students.submit().click();

	}
}
