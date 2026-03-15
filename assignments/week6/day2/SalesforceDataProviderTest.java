package assignments.week6.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SalesforceDataProviderTest extends SalesforceDataProjectSpecific {

	String FileName;

	@BeforeClass

	public void SetData() {

		FileName = "LegalEntityNames";
	}

	@Test(dataProvider = "getValue")
	public void createLegalEntity(String entityName) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement legal = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions action = new Actions(driver);
		action.moveToElement(legal).click().perform();

		//Click on New Legal Entity
		driver.findElement(By.xpath("//li[.//div[@title='New']]")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by "+entityName);
	
		//Click on Save
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

		String entityNameFromToast = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'toastMessage')]//a")))
				.getText();
		//Verify the Alert message (Complete this field) displayed for Name
		if (entityNameFromToast.equals("Salesforce Automation by "+entityName))
			System.out.println("Verification Passed");
		else
			System.out.println("Verification failed");

		driver.quit();
	}


	}


