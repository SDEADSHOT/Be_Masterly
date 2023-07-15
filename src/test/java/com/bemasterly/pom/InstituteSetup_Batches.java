package com.bemasterly.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstituteSetup_Batches {
	static WebDriver driver;
	static Select select = null;
	static Actions action = null;
	static WebDriverWait wait = null;

	By Add_Batch = By.xpath("//a[text()='Add Batch']");
	By Name_Of_Batch = By.xpath("//input[@id='batch_name']");
	By Offerings = By.xpath("//select[@id='offering_name']");
	By Subjects = By.xpath("//div[text()='Select...']");
	By Academic_Cycle = By.xpath("//select[@id='academic_name']");
	By StartDate = By.xpath("//label[text()='Start Date*']//following-sibling::input");
	By EndDate = By.xpath("//label[text()='End Date*']//following-sibling::input");
	By SaveAndNext = By.xpath("//button[text()='Save & Next']");

	public InstituteSetup_Batches(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	}

	public static void select(By ele) {
		select = new Select(driver.findElement(ele));
	}

	public WebElement nameOfBatch() {
		return driver.findElement(Name_Of_Batch);
	}

	public void selectOffering(String offering) {
		select(Offerings);
		select.selectByVisibleText(offering);
	}

	public void selectSubjects(String name) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[text()='Select...']")).click();
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Select...']"))).sendKeys(name + Keys.ENTER)
				.build().perform();

	}

	public void selectAcademicCycle(String academicCycle) {
		select(Academic_Cycle);
		select.selectByVisibleText(academicCycle);
	}

	public WebElement startDate() {
		return driver.findElement(StartDate);
	}

	public WebElement endDate() {
		return driver.findElement(EndDate);
	}

	public WebElement addBatch() {
		return driver.findElement(Add_Batch);
	}

	public WebElement saveNext() {
		return driver.findElement(SaveAndNext);
	}
}
