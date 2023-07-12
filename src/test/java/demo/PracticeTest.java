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

public class PracticeTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://smartschool.padhaao.com/login");
		driver.findElement(By.name("username")).sendKeys("preT4dZP");
		driver.findElement(By.name("password")).sendKeys("pTv84dZP");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//span[text()='Classroom Activities']")).click();
		driver.findElement(By.xpath("//span[text()='Practice Test']")).click();
		driver.findElement(By.xpath("(//div[@class='drodown'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Add']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Hindi");
		driver.findElement(By.xpath("//input[@name='total_questions']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='per_question_marks']")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@type='number'])[5]")).sendKeys("01");
		driver.findElement(By.xpath("(//input[@type='number'])[6]")).sendKeys("30");
		driver.findElement(By.xpath("(//input[@type='datetime-local'])[1]")).sendKeys("12072023" + Keys.TAB + "1540");
		driver.findElement(By.xpath("(//input[@type='datetime-local'])[2]")).sendKeys("12072023" + Keys.TAB + "1640");
		driver.findElement(By.xpath("//label[text()='Image']")).click();
		driver.findElement(By.xpath("//label[text()='PDF']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
//		driver.findElement(By.xpath("//input[@id='userfile']"))
//				.sendKeys("C:\\Users\\User.TYSS-RAJESHWAR\\Downloads\\SteppingStone.jpg");
		driver.findElement(By.xpath("//input[@id='userfile']"))
				.sendKeys("C:\\Users\\User.TYSS-RAJESHWAR\\Downloads\\Error.pdf");

		driver.findElement(By.xpath("//button[text()='Save']")).click();

		List<WebElement> list = driver.findElements(By.xpath("//li[@class='nk-menu-item has-sub']"));
		for (WebElement l : list) {
			for (int i = 1; i <= 3; i++) {
				// jse.executeScript("arguments[0].click();", );
				driver.findElement(By.xpath("(//label[text()='A'])[" + i + "]")).click();

			}

		}

		Thread.sleep(30);
		a.moveToElement(driver.findElement(By.xpath("//button[text()='Save']"))).click().perform();

		driver.findElement(By.xpath("//span[@id='select2-selected_academic_year-container']")).click();

		List<WebElement> list2 = driver.findElements(By.xpath("//span[@class='select2-results']/ul/li"));
		for (WebElement l2 : list2) {
			if (l2.getText().equalsIgnoreCase("New_Cyc_Acade")) {
				l2.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='select_multiple_batches_div']")).click();

		List<WebElement> list3 = driver.findElements(By.xpath("//span[@class='select2-results']/ul/li//span[2]"));

		for (WebElement l3 : list3) {
			if (l3.getText().equalsIgnoreCase("Automation_Batch Chemistry")) {
				l3.click();
				break;
			}
		}

		driver.findElement(By.xpath("//label[text()='All']")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

	}
}
