package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFrameAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				    //Add implicit wait
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				 
				 driver.switchTo().frame(0);
				 
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
				Alert alert1 = driver.switchTo().alert();
				String inputText = alert1.getText();
				System.out.println("Input Text is:" + inputText);
				alert1.dismiss();
				
				
				
				driver.close();
				
				
				
				 
				 

	}

}
