package com.bemasterly.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuBar {
	WebDriver driver = null;
	Actions action = null;

	public MenuBar(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);
	}

	By DashBoard = By.xpath("//span[text()='Dashboard']");
	By Institute_Setup = By.xpath("//span[text()='Institute Setup']");
	By Institute_Information = By.xpath(
			"//span[text()='Institute Information']//ancestor::li//following-sibling::li/a/span[text()='Institute Information']");
	By Students = By.xpath(
			"//span[text()='Institute Information']//ancestor::li//following-sibling::li/a/span[text()='Students']");
	By Admin_Tutors = By.xpath(
			"//span[text()='Institute Information']//ancestor::li//following-sibling::li/a/span[text()='Admin/Tutors']");
	By offerings = By.xpath(
			"//span[text()='Institute Information']//ancestor::li//following-sibling::li/a/span[text()='Offerings']");
	By Academic_Cycle = By.xpath(
			"//span[text()='Institute Information']//ancestor::li//following-sibling::li/a/span[text()='Academic Cycle']");
	By Batches = By.xpath(
			"//span[text()='Institute Information']//ancestor::li//following-sibling::li/a/span[text()='Batches']");

	By My_Classroom = By.xpath("//span[text()='My Classroom']");
	By Time_Table = By
			.xpath("//span[text()='My Classroom']//ancestor::li//following-sibling::li/a/span[text()='Time Table']");
	By Mark_Attendance = By.xpath(
			"//span[text()='My Classroom']//ancestor::li//following-sibling::li/a/span[text()='Mark Attendance']");
	By Sessions = By
			.xpath("//span[text()='My Classroom']//ancestor::li//following-sibling::li/a/span[text()='Sessions']");

	By Test_Pro = By.xpath("//span[text()='TestPro']");

	By Classroom_Activities = By.xpath("//span[text()='Classroom Activities']");

	By Practice_Test = By.xpath(
			"//span[text()='Classroom Activities']//ancestor::li//following-sibling::li/a/span[text()='Practice Test']");
	By Assignments = By.xpath(
			"//span[text()='Classroom Activities']//ancestor::li//following-sibling::li/a/span[text()='Assignments']");
	By Event_Calendar = By.xpath(
			"//span[text()='Classroom Activities']//ancestor::li//following-sibling::li/a/span[text()='Event Calendar']");

	By Study_Material = By.xpath("//span[text()='Study Material']");
	By Content_Folder = By.xpath(
			"//span[text()='Study Material']//ancestor::li//following-sibling::li/a/span[text()='Content Folder']");
	By Shared_Content = By.xpath(
			"//span[text()='Study Material']//ancestor::li//following-sibling::li/a/span[text()='Shared Content']");

	By Live_Class_Recording = By.xpath(
			"//span[text()='Study Material']//ancestor::li//following-sibling::li/a/span[text()='Live class Recordings']");

	By Reports = By.xpath("//span[text()='Reports']");
	By Student_Attendance = By
			.xpath("//span[text()='Reports']//ancestor::li//following-sibling::li/a/span[text()='Student Attendance']");
	By Tutor_Attendance = By
			.xpath("//span[text()='Reports']//ancestor::li//following-sibling::li/a/span[text()='Tutor Attendance']");

	By Fee_Management = By.xpath("//span[text()='Fee management']");
	By Billing_Details = By.xpath(
			"//span[text()='Fee management']//ancestor::li//following-sibling::li/a/span[text()='Billing Details']");
	By Fee_Structure = By.xpath(
			"//span[text()='Fee management']//ancestor::li//following-sibling::li/a/span[text()='Fee Structure']");
	By Payment_Cart = By.xpath(
			"//span[text()='Fee management']//ancestor::li//following-sibling::li/a/span[text()='Payment Cart']");
	By Track_Payment = By.xpath(
			"//span[text()='Fee management']//ancestor::li//following-sibling::li/a/span[text()='Track Payment']");
	By Taxes = By.xpath("//span[text()='Fee management']//ancestor::li//following-sibling::li/a/span[text()='Taxes']");
	By Notifications = By.xpath(
			"//span[text()='Fee management']//ancestor::li//following-sibling::li/a/span[text()='Notifications']");

	By Webpage_Management = By.xpath("//span[text()='Webpage management']");
	By Sample_Web_Page = By.xpath(
			"//span[text()='Webpage management']//ancestor::li//following-sibling::li/a/span[text()='Sample Web Page']");
	By Introduction = By.xpath(
			"//span[text()='Webpage management']//ancestor::li//following-sibling::li/a/span[text()='Introduction']");
	By WebPage_Offerings = By.xpath(
			"//span[text()='Webpage management']//ancestor::li//following-sibling::li/a/span[text()='Offerings']");
	By Toppers = By
			.xpath("//span[text()='Webpage management']//ancestor::li//following-sibling::li/a/span[text()='Toppers']");
	By Testimonials = By.xpath(
			"//span[text()='Webpage management']//ancestor::li//following-sibling::li/a/span[text()='Testimonials']");
	By Social_Media = By.xpath(
			"//span[text()='Webpage management']//ancestor::li//following-sibling::li/a/span[text()='Social Media']");
	By Preview_Page = By.xpath(
			"//span[text()='Webpage management']//ancestor::li//following-sibling::li/a/span[text()='Preview Page']");
	By Activate_Webpage = By.xpath(
			"//span[text()='Webpage management']//ancestor::li//following-sibling::li/a/span[text()='Activate Webpage']");

	public void navigatingToDashboard() {
		action.moveToElement(driver.findElement(DashBoard)).click().perform();
	}

	public void navigatingToInstituteSetup() {
		action.moveToElement(driver.findElement(Institute_Setup)).click().perform();

	}

	public void navigatingToInstituteInformation() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Institute_Information)).click().perform();
	}

	public void navigatingToStudents() {
	//	action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Students)).click().perform();
	}

	public void navigatingToAdminTutors() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Admin_Tutors)).click().perform();
	}

	public void navigatingToOfferings() {
	//	action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(offerings)).click().perform();
	}

	public void navigatingToAcademicCycle() throws InterruptedException {
		// action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(Academic_Cycle)).click().perform();
	}

	public void navigatingToBatches() {
	//	action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Batches)).click().perform();
	}

	public void navigatingToTimeTable() {
	//	action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Time_Table)).click().perform();
	}

	public void navigatingToMarkAttendance() {
		action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Mark_Attendance)).click().perform();
	}

	public void navigatingToSessions() {
	//	action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Sessions)).click().perform();
	}

	public void navigatingToPracticeSet() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Practice_Test)).click().perform();
	}

	public void navigatingToAssignments() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Assignments)).click().perform();
	}

	public void navigatingToEventCalendar() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Event_Calendar)).click().perform();
	}

	public void navigatingToContentFolder() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Content_Folder)).click().perform();
	}

	public void navigatingToSharedContent() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Shared_Content)).click().perform();
	}

	public void navigatingToLiveClassRecording() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Live_Class_Recording)).click().perform();
	}

	public void navigatingToStudentAttendance() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Student_Attendance)).click().perform();
	}

	public void navigatingToTutorAttendance() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Tutor_Attendance)).click().perform();
	}

	public void navigatingToBillingDetails() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Billing_Details)).click().perform();
	}

	public void navigatingToFeeStructure() {
	//	action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Fee_Structure)).click().perform();
	}

	public void navigatingToPaymentCart() {
	//	action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Payment_Cart)).click().perform();
	}

	public void navigatingToTrackPayment() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Track_Payment)).click().perform();
	}

	public void navigatingToTaxes() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Taxes)).click().perform();
	}

	public void notifications() {
		//action.moveToElement(driver.findElement(Institute_Setup)).click().perform();
		action.moveToElement(driver.findElement(Notifications)).click().perform();
	}
}
