package assignments.week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameandAlertInteractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//Add implicit wait
		
		
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		    
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Switch to Alert (Prompt)
		Alert alert1 = driver.switchTo().alert();
		
		String inputText = ("Lakshmi");
		alert1.sendKeys(inputText);
		
		
		//Accept the alert
		alert1.accept();
		
	    // Locate result text
        WebElement resultText = driver.findElement(By.id("demo"));
        String actualText = resultText.getText();
		
     // Verify result
        if (actualText.contains(inputText)) {
            System.out.println("Test Passed: Correct text displayed -> " + actualText);
        } else {
            System.out.println("Test Failed");
        }

        driver.quit();
		
	}

}
