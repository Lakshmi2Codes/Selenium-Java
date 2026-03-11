package assignments.week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class SalesforceProjectSpecific {
	
	  RemoteWebDriver driver;
	 
	    @Parameters({"url", "username", "password"})
	    @BeforeMethod
	    public void preCondition(String url, String username, String password) {

	        // Chrome setup with user-data-dir and notifications disabled
	        ChromeOptions opt = new ChromeOptions();
	        opt.addArguments("--user-data-dir=C:\\Salesforce"); // optional profile
	        opt.addArguments("--disable-notifications");

	        driver = new ChromeDriver(opt);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	        // Navigate and login
	        driver.get(url);
	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.id("Login")).click();
	    }

	    @AfterMethod
	    public void postCondition() {
	        
	        
	    }
	}
