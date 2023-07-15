package com.bemasterly.testcase;

import org.testng.annotations.Test;

public class Offerings extends BaseClass {
	@Test
	public void TetsCase_1() throws InterruptedException {
		//menubar.navigatingToInstituteSetup();
		menubar.navigatingToOfferings();
		Thread.sleep(5000);
		offerings.addOfferings().click();
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span")));
		offerings.nameOfExam().click();
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='select2-results']/ul/li")));
		offerings.selectElementFromList(data.b_nameofExam());
		Thread.sleep(5000);
		offerings.mediumOfInstruction().click();
		Thread.sleep(5000);
		offerings.selectElementFromList(data.b_mediumOfInstruction());
		Thread.sleep(5000);
		offerings.level().click();
		Thread.sleep(5000);
		offerings.selectElementFromList(data.b_levelStandard());
		Thread.sleep(5000);
		offerings.subjects().click();
		Thread.sleep(5000);
		offerings.selectSubject(data.b_subject());
		Thread.sleep(5000);
		offerings.offeringInformation().click();
		// offerings.save().click();
	}
}
