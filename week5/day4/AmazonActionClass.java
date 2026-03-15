package week5.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;


public class AmazonActionClass {

		    public static void main(String[] args) throws IOException {

		       
		        WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.get("https://www.amazon.in/");
                WebElement condition = driver.findElement(By.linkText("Conditions of Use & Sale"));
                
                
                Actions act = new Actions(driver);
                act.scrollToElement(condition).perform();

		        
		        String text = condition.getText();
		        System.out.println("Text displayed: " + text);

		        
		        File source = condition.getScreenshotAs(OutputType.FILE);

		        File destination = new File("./screenshots/amazon.png");
		        FileUtils.copyFile(source, destination);

		        System.out.println("Screenshot captured");

		        driver.quit();
		    }
		

	}


