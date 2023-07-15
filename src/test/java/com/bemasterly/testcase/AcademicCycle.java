package com.bemasterly.testcase;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AcademicCycle extends BaseClass{
	@Test
	public void TestCase_1() throws InterruptedException {
	//	menubar.navigatingToInstituteSetup();
		menubar.navigatingToAcademicCycle();
		academicCycle.addAcademicCycle().click();
		academicCycle.newAcademicCycle().sendKeys(data.b_nameOfAcademicCycle());
		academicCycle.offering().click();
		Thread.sleep(5000);
		academicCycle.selectSubject(data.b_offerings());
		//academicCycle.save();
	}
}
