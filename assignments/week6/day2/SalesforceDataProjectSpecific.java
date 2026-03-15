package assignments.week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day3.ReadValuesFromExcel;

public class SalesforceDataProjectSpecific {
	
	 protected RemoteWebDriver driver;
	 
		String fileName;
		@DataProvider(name = "getValue")
		public String[][] fetchData() throws IOException {
		    String fileName = "LegalEntityNames";  // set your Excel file name here
		    return ReadValuesFromExcel.getValue(fileName);
		}

	 
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
	        
	    	  driver.quit();       
	    }
	}



