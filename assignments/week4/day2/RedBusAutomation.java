package assignments.week4.day2;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;




	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.edge.EdgeOptions;

	@SuppressWarnings("unused")
	public class RedBusAutomation {
	
	    public static void main(String[] args) {

	        // Tell Selenium where driver is located
	        System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");

	        EdgeOptions options = new EdgeOptions();

	        EdgeDriver driver = new EdgeDriver(options);

	        driver.manage().window().maximize();

	        driver.get("https://www.redbus.com/");

	        System.out.println("Title is: " + driver.getTitle());

        
    }
}