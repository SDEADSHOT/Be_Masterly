package com.mastorly.pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstituteSetup_Offerings {
	static WebDriver driver;
	static Select select = null;
	static Actions action = null;
	static WebDriverWait wait = null;

	By Add_offerings = By.xpath("//a[text()='Add offerings']");
	By Offering_Information=By.xpath("//h5[text()='Offering Information']");
	By Name_Of_Exam = By.xpath("//label[text()='Name of Exam* ']//following-sibling::div[@class='form-control-wrap']");
	By List_Of_Exam = By.xpath("//span[@class='select2-results']/ul/li");
	By List_Of_Subjects = By.xpath("//div[@class='multiselect-dropdown-list']/div/label");
	By Medium_Of_Instruction = By
			.xpath("//label[text()='Medium of Instruction* ']//following-sibling::div[@class='form-control-wrap']");
	By All = By.xpath("//div[@class='multiselect-dropdown-all-selector']/label[text()='All']");
	By Level = By.xpath("//label[text()='Level/Standard* ']//following-sibling::div[@class='form-control-wrap']");
	By Subjects = By.xpath("//label[text()='Subjects* ']//following-sibling::div[@class='form-control-wrap']");
	By Save = By.xpath("//button[text()='Save']");

	// By All=By.xpath("//label[text()='All']");
	public InstituteSetup_Offerings(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	}

	public static void select(By ele) {
		select = new Select(driver.findElement(ele));
	}

	public WebElement addOfferings() {
		return driver.findElement(Add_offerings);
	}
	
	public WebElement offeringInformation() {
		return driver.findElement(Offering_Information);
	}

	public WebElement nameOfExam() {
		wait.until(ExpectedConditions.elementToBeClickable(Name_Of_Exam));
		return driver.findElement(Name_Of_Exam);
	}

//	public WebElement listOfExam() {
//		return driver.findElement(List_Of_Exam);
//	}

	public void selectElementFromList(String name) {
		List<WebElement> list = driver.findElements(List_Of_Exam);

		for (WebElement l : list) {
			wait.until(ExpectedConditions.elementToBeClickable(l));
			if (l.getText().equalsIgnoreCase(name)) {
				l.click();
				break;
			}
		}
	}

	public void selectSubject(String name) {
		List<WebElement> list = driver.findElements(List_Of_Subjects);

		for (WebElement l : list) {
			wait.until(ExpectedConditions.elementToBeClickable(l));
			if (l.getText().equalsIgnoreCase(name)) {
				l.click();
				break;
			}
		}
	}

	public WebElement mediumOfInstruction() {
		wait.until(ExpectedConditions.elementToBeClickable(Medium_Of_Instruction));
		return driver.findElement(Medium_Of_Instruction);
	}

	public WebElement level() {
		wait.until(ExpectedConditions.elementToBeClickable(Level));
		return driver.findElement(Level);
	}

	public WebElement subjects() {
		wait.until(ExpectedConditions.elementToBeClickable(Subjects));
		return driver.findElement(Subjects);
	}

	public WebElement save() {
		return driver.findElement(Save);
	}

}
