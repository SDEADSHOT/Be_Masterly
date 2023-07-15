package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Batches {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://newvision.mastorly.com/login");
		driver.findElement(By.name("username")).sendKeys("Newvision");
		driver.findElement(By.name("password")).sendKeys("Genext@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//span[text()='Institute Setup']")).click();
		driver.findElement(By.xpath("//span[text()='Batches']")).click();
		driver.findElement(By.xpath("//a[text()='Add Batch']")).click();
		driver.findElement(By.xpath("//input[@id='batch_name']")).sendKeys("New*(*(*Notch))))");
//		driver.findElement(By.xpath("//select[@id='offering_name']")).click();
		Select s = new Select(driver.findElement(By.xpath("//select[@id='offering_name']")));

		s.selectByVisibleText("KSEAB (Karnatak Board)-English-IX");
		// while (true) {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='Select...']")).click();
		a.moveToElement(driver.findElement(By.xpath("//div[text()='Select...']"))).sendKeys("Sel" + Keys.ENTER).build()
				.perform();
		// }
		s = new Select(driver.findElement(By.xpath("//select[@id='academic_name']")));
		s.selectByVisibleText("New vision 1");

		driver.findElement(By.xpath("//label[text()='Start Date*']//following-sibling::input")).sendKeys("14032023");
		driver.findElement(By.xpath("//label[text()='End Date*']//following-sibling::input")).sendKeys("14032024");
		Thread.sleep(5000);
		jse.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//button[text()='Save & Next']")));
		Thread.sleep(4000);
		// a.moveToElement(driver.findElement(By.xpath("//button[text()='Save &
		// Next']"))).click().build().perform();
		// driver.findElement(By.xpath("//button[text()='Save & Next']")).click();
		jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[text()='Save & Next']")));

		List<WebElement> tb = driver.findElements(
				By.xpath("//tbody/tr/td/following-sibling::td//following-sibling::td//following-sibling::td"));
		for (WebElement t : tb) {
			t.click();
			driver.findElement(By.xpath("//input[contains(@placeholder,'Teacher name or employee ID')]"))
					.sendKeys("san");
			// Selectin Teachers
			driver.findElement(By.xpath(
					"//div[@class='teacher-row align-items-center d-flex px-2 py-2 ']//child::input[@type='checkbox']"))
					.click();
			driver.findElement(
					By.xpath("//div[@class=\"px-4 customSidebarFoot\"]/div//descendant::div/button[text()='Save']"))
					.click();
		}

	}
}
