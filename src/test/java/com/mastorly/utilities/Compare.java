package com.mastorly.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mastorly.testcase.BaseClass;

public class Compare extends BaseClass {
	public void compareStudentWithList(String Student_name) {
		List<WebElement> list = driver.findElements(By.xpath("//td//span[@class='tb-lead']"));
		for (WebElement l : list) {
			if (l.equals(Student_name)) {
				Assert.assertTrue(true);
			}
			if (l.equals(Student_name)) {
				Assert.assertTrue(false);
			}
		}	}
}
