package assignments.week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SalesforceParameterize extends SalesforceProjectSpecific {

//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--user-data-dir=C:\\Salesforce");
//		opt.addArguments("--disable-notifications");
//		
//		ChromeDriver driver = new ChromeDriver(opt);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://login.salesforce.com");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("username")).sendKeys("lakshmi.sendmail2.13e14de33494@agentforce.com");
//		driver.findElement(By.id("password")).sendKeys("Salesforce123");
//		driver.findElement(By.id("Login")).click();
//		

	@Test
	public void createLegalEntity() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement legal = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions action = new Actions(driver);
		action.moveToElement(legal).click().perform();
		driver.findElement(By.xpath("//a[@class='forceActionLink']/div")).click();
		driver.findElement(By.xpath("//div[@role='dialog']//input[@name='Name']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Description']/following::textarea[1]")).sendKeys("Salesforces");
		Thread.sleep(3000);
		WebElement status = driver.findElement(By.xpath("//button[@aria-label='Status']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", status);
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String display = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'toastMessage')]//a")))
				.getText();

		if (display.equals("Testleaf"))
			System.out.println("Legal Entity Created Successfully ");
		else
			System.out.println("Verification failed fo Alert message");

	}

}
