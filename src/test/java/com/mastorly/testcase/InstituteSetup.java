package com.mastorly.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class InstituteSetup extends BaseClass {
	@Test(priority = 1)
	public void TestCase_1() throws InterruptedException {
		menubar.navigatingToInstitute_Setup_Offerings();
		Thread.sleep(5000);
		offerings.addOfferings().click();
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span")));
		offerings.nameOfExam().click();
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='select2-results']/ul/li")));
		offerings.selectElementFromList("KSEAB (Karnatak Board)");
		Thread.sleep(5000);
		offerings.mediumOfInstruction().click();
		Thread.sleep(5000);
		offerings.selectElementFromList("English");
		Thread.sleep(5000);
		offerings.level().click();
		Thread.sleep(5000);
		offerings.selectElementFromList("X");
		Thread.sleep(5000);
		offerings.subjects().click();
		Thread.sleep(5000);
		offerings.selectSubject("All");
		Thread.sleep(5000);
		offerings.offeringInformation().click();
		//offerings.save().click();
	}

	@Test(priority = 2)
	public void TestCase_2() throws InterruptedException {
		menubar.navigatingToInstitute_Setup_AcademicCycle();
		academicCycle.addAcademicCycle().click();
		academicCycle.newAcademicCycle().sendKeys("New______Acade");
		academicCycle.offering().click();
		Thread.sleep(5000);
		academicCycle.selectSubject("KSEAB (Karnatak Board)-English-IX");
		//academicCycle.save();
	}

	@Test(priority = 3)
	public void TestCase_3() {
		// KSEAB (Karnatak Board)-English-IX
		menubar.navigatingToInstitute_Setup_Batches();
		batches.addBatch().click();
		batches.nameOfBatch().sendKeys("New*(*(*Notch");
		batches.selectOffering("KSEAB (Karnatak Board)-English-IX");
		batches.selectSubjects("Select");
		batches.selectAcademicCycle("New vision 1");
		batches.startDate().sendKeys("12032023");
		batches.endDate().sendKeys("12032024");
		batches.saveNext().click();
	}

}
