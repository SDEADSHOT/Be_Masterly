package com.mastorly.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dummy {
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		driver.manage().window().maximize();
		driver.get("http://newvision.mastorly.com/login");
		driver.findElement(By.name("username")).sendKeys("Newvision");
		driver.findElement(By.name("password")).sendKeys("Genext@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Students']")).click();
//		driver.findElement(By.xpath("//a[text()='Add Student']")).click();
//
//		driver.findElement(By.xpath("//input[@name='first_name']"));
//		jse.executeScript("arguments[0].scrollIntoView();",
//				driver.findElement(By.xpath("(//input[@name='fname[]'])[1]")));
//
//		driver.findElement(By.xpath("(//input[@name='fname[]'])[1]")).sendKeys("P1");
//		jse.executeScript("arguments[0].scrollIntoView();",
//				driver.findElement(By.xpath("(//input[@name='fname[]'])[2]")));
//
//		driver.findElement(By.xpath("(//input[@name='fname[]'])[2]")).sendKeys("P2");
//		driver.findElement(By.xpath("//input[@name='add1']")).sendKeys("Address");
//		Select s = new Select(driver.findElement(By.xpath("//select[@name='city']")));
//		s.selectByValue("117");
//
//		Thread.sleep(4000);
//		String status = driver
//				.findElement(By.xpath("//a[text()='Dasanapura']//ancestor::tr//descendant::td[6]//descendant::a"))
//				.getText();
//		System.out.println(status);
		driver.findElement(By.xpath("//a[text()='Bulk Upload']")).click();
		Thread.sleep(5000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(
				"//div[@class='nk-block']/div[@class='card card-bordered1']/div/form/div/div[@id='uploadFile']/div/div[@class='fileUploader']"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(
				"//div[@class='nk-block']/div[@class='card card-bordered1']/div/form/div/div[@id='uploadFile']/div/div[@class='fileUploader']"))));
		driver.findElement(By.xpath(
				"//div[@class='nk-block']/div[@class='card card-bordered1']/div/form/div/div[@id='uploadFile']/div/div[@class='fileUploader']"))
				.sendKeys("C:\\Users\\User.TYSS-RAJESHWAR\\Downloads\\Student_1.csv");

	}
}
