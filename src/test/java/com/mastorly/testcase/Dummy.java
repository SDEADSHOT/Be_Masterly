package com.mastorly.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		meth("Dasanapura");
	}

	public static void meth(String name) throws InterruptedException {
		Thread.sleep(4000);
		String status = driver
				.findElement(By.xpath("//a[text()='"+name+"']//ancestor::tr//descendant::td[6]//descendant::a"))
				.getText();
		System.out.println(status);
	}
}
