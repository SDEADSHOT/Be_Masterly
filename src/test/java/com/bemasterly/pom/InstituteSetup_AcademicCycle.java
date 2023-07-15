package com.bemasterly.pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstituteSetup_AcademicCycle {
	static WebDriver driver;
	static Select select = null;
	static Actions action = null;
	static WebDriverWait wait = null;

	By Add_AcademicCycle = By.xpath("//a[text()='Add Academic Cycle']");
	By New_AcademicCycle = By.xpath("//input[@id='academicName']");
	By Offering = By.xpath("//label[text()='Offering*']//following-sibling::div[@class='form-control-wrap']");
	By List_Of_Offering = By.xpath("//span[@class='select2-results']/ul/li");
	By Save = By.xpath("//button[text()='Save']");

	public InstituteSetup_AcademicCycle(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	}

	public WebElement addAcademicCycle() {
		return driver.findElement(Add_AcademicCycle);
	}

	public WebElement newAcademicCycle() {
		return driver.findElement(New_AcademicCycle);
	}

	public WebElement offering() {
		wait.until(ExpectedConditions.elementToBeClickable(Offering));
		return driver.findElement(Offering);
	}

	public void selectSubject(String name) {
		List<WebElement> list = driver.findElements(List_Of_Offering);

		for (WebElement l : list) {
			wait.until(ExpectedConditions.elementToBeClickable(l));
			if (l.getText().equalsIgnoreCase(name)) {
				l.click();
				break;
			}
		}
	}

	public WebElement save() {
		return driver.findElement(Save);
	}
}
