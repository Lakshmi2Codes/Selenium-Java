package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcWindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.irctc.co.in/");
       //click Simple Alert
        driver.findElement(By.xpath("//button[text()='OK']")).click();

        // Click FLIGHTS
        driver.findElement(By.linkText("FLIGHTS")).click();
        
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);
        List<String> activeWindow = new ArrayList<>(allWindows);
        driver.switchTo().window(activeWindow.get(1));
        String titleOfChildWindow = driver.getTitle();
        System.out.println("Child Window Title:" + titleOfChildWindow);
        driver.close();
        driver.switchTo().window(activeWindow.get(0));
        //  Switch back to parent window
        String titleOfParentWindow = driver.getTitle();
        System.out.println("Parent Window Title:" + titleOfParentWindow);

        driver.quit();
    }

        
   

	}


