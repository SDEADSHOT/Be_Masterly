package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Offerings {
	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//span[text()='Offerings']")).click();
		driver.findElement(By.xpath("//a[text()='Add offerings']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//label[text()='Subjects* ']//following-sibling::div[@class='form-control-wrap']")));
		driver.findElement(By.xpath("//label[text()='Subjects* ']//following-sibling::div[@class='form-control-wrap']"))
				.click();

		List<WebElement> list = driver.findElements(By.xpath("//span[@class='select2-results']/ul/li"));

		for (WebElement l : list) {
			wait.until(ExpectedConditions.elementToBeClickable(l));
			if (l.getText().equalsIgnoreCase("All")) {
				l.click();
				break;
			}
		}

	}
}
