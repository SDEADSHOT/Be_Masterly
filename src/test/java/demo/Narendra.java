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

public class Narendra {
	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.get("https://www.reliancedigital.in/");
		Thread.sleep(2000);

		// handling the popup
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='wzrk-alert wiz-show-animate']")));
		// No, don’t.
		Thread.sleep(5000);
		WebElement NoDont = driver.findElement(By.xpath(
				"//div[@class='wzrk-alert wiz-show-animate']/div[@class='wzrk-button-container']/button[text()='No, don’t.']"));
		a.moveToElement(NoDont).click().perform();

		// Yes, Notify me
//		WebElement YesNotify = driver.findElement(By.xpath(
//				"//div[@class='wzrk-alert wiz-show-animate']/div[@class='wzrk-button-container']/button[text()='Yes, Notify me']"));
		// YesNotify.click();
		// a.moveToElement(YesNotify).click().perform();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Cameras']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='DSLR Cameras']")).click();
		Thread.sleep(6000);

		WebElement don = driver.findElement(By.xpath(
				"//li[@class='grid pl__container__sp blk__lg__3 blk__md__4 blk__sm__6 blk__xs__6']//descendant::div[@class='slider-text']/p[text()='Canon EOS 90D DSLR Camera with 18-135 mm Lens Kit']"));
		Thread.sleep(5000);

		jse.executeScript("arguments[0].scrollIntoView();", don);
		jse.executeScript("arguments[0].click();", don);
	}
}