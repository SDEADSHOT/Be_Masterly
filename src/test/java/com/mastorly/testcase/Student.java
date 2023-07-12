package com.mastorly.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Student extends BaseClass {
	@Test(priority = 1)
	public void TestCase_1() throws InterruptedException {
		/** Verify that admin is able to create a student */
		menubar.users();
		menubar.usersStudent();
		students.addStudent();

		students.scrollToPersonalInformation();
		students.studentName("Dasanapura");
		students.studentRollNumber("98829896249369");
		students.mobileNumber("9886645637");
		students.emailId("dummy@gmail.com");
		students.gender("Male");

		students.parentFirstName_1("Parent_1");
		students.parentLastName_1("L");
		students.ParentRelationship_1("Father");
		students.parentEmailID_1("parent2@gmail.com");
		students.Parent_Mobile_Number_1("9886645637");

		students.parentFirstName_2("Parent_2");
		students.parentLastName_2("L");
		students.ParentRelationship_2("Mother");
		students.parentEmailID_2("parent2@gmail.com");
		students.Parent_Mobile_Number_2("9886645637");

		students.address("Hesaraghatta");
		students.pinCode("560088");
		students.state("Karnataka");
		Thread.sleep(3000);
		students.city("117");

		// students.cancel();
		students.save();
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

//	@Test(priority = 4)
//	public void TestCase_4() throws InterruptedException {
//		/** Verify that admin is able to create a student */
//		menubar.users();
//		menubar.usersStudent();
//		students.addStudent();
//
//		students.scrollToPersonalInformation();
//		students.studentName("Dasanapura");
//		students.studentRollNumber("98829896249369");
//		students.mobileNumber("9886645637");
//		students.emailId("dummy@gmail.com");
//		students.gender("Male");
//
//		students.parentFirstName_1("Parent_1");
//		students.parentLastName_1("L");
//		students.ParentRelationship_1("Father");
//		students.parentEmailID_1("parent2@gmail.com");
//		students.Parent_Mobile_Number_1("9886645637");
//
//		students.parentFirstName_2("Parent_2");
//		students.parentLastName_2("L");
//		students.ParentRelationship_2("Mother");
//		students.parentEmailID_2("parent2@gmail.com");
//		students.Parent_Mobile_Number_2("9886645637");
//
//		students.address("Hesaraghatta");
//		students.pinCode("560088");
//		students.state("Karnataka");
//		Thread.sleep(3000);
//		students.city("117");
//
//		// students.cancel();
//		students.save();
//	}
}
