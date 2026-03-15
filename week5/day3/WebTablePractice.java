package week5.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTablePractice {
public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(opt);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	        driver.get("https://erail.in/");
	        WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
	        fromStation.clear();
	        fromStation.sendKeys("MAS");
	        Thread.sleep(1000);
	        fromStation.sendKeys(Keys.ENTER);
	        WebElement toStation = driver.findElement(By.id("txtStationTo"));
	        toStation.clear();
	        toStation.sendKeys("MDU"); 
	        Thread.sleep(1000);
	        toStation.sendKeys(Keys.ENTER);
	        driver.findElement(By.id("chkSelectDateOnly")).click();
	        Thread.sleep(2000); 
	        List<WebElement> trainElements = driver.findElements(By.xpath("//table[contains(@class,'TrainList')]//td[2]//a"));
	        List<String> trainNames = new ArrayList<>();
	        for (WebElement train : trainElements) {
	        	trainNames.add(train.getText());
	        }
	        System.out.println("Total trains found: " + trainNames.size());       
	        Set<String> trainSet = new HashSet<>(trainNames);
	        if (trainSet.size() < trainNames.size()) {
	            System.out.println("Duplicate train names found!");
	        } else {
	            System.out.println("No duplicate train names.");
	        } 
	        System.out.println("Train Names:");
	        trainNames.forEach(System.out::println);  
	        driver.quit();
	    }
	

	

}
