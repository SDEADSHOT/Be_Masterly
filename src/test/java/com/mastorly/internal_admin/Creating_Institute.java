package com.mastorly.internal_admin;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Creating_Institute extends BaseClass_IA {
	@Test
	public void TestCase_1_AddingInstitution() throws InterruptedException {
		menubar.navigatingToInstitue();
		institution.addButton().click();
		institution.addInsititution().click();
		institution.domainName().sendKeys(admindata.domainName());
		institution.institueName().sendKeys(admindata.schoolName());
		wait.until(ExpectedConditions.visibilityOf(institution.uploadLogo()));
		// institution.uploadLogo().sendKeys(admindata.chooseFile());
		// wait.until(ExpectedConditions.visibilityOf(institution.uploadLogo()));
		Thread.sleep(5000);
		institution.name().sendKeys(admindata.adminName());
		institution.emailAddress().sendKeys(admindata.adminEmail());
		institution.mobileNumber().sendKeys(admindata.adminPhoneNumber());
		institution.userNamer().sendKeys(admindata.adminUserName());
		institution.password().sendKeys(admindata.adminPassword());
		institution.submit().click();
	}
}
