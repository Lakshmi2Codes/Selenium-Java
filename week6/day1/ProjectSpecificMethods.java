package week6.day1;


import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day3.ReadValuesFromExcel;



public class ProjectSpecificMethods {

	public RemoteWebDriver driver;
	
	String fileName;
	@DataProvider(name = "getValue")
	public String[][] fetchData() throws IOException {
	    String fileName = "CreateLead";  // set your Excel file name here
	    return ReadValuesFromExcel.getValue(fileName);
	}

	@Parameters({ "browser", "username", "password" })
	@BeforeMethod

	public void preCondition(String browser, String username, String password) {

		switch (browser.toLowerCase()) {
		case "chrome":
			ChromeOptions opt1 = new ChromeOptions();
			opt1.addArguments("guest");
			driver = new ChromeDriver(opt1);
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		}

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@AfterMethod

	public void postCondition() {

		driver.close();
	}

}
