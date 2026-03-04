package assignments.week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeaftapsWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
        driver.findElement(By.xpath("//input[@id='partyIdFrom']/ancestor::td//img[@alt='Lookup']")).click();
        
		Set<String> windowsSet = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(windowsSet);
		
		driver.switchTo().window(windowList.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		
		driver.switchTo().window(windowList.get(0));
		driver.findElement(By.xpath("//input[@id='partyIdTo']/ancestor::td//img[@alt='Lookup']")).click();
		
		windowsSet = driver.getWindowHandles();
		windowList = new ArrayList<>(windowsSet);
		
		driver.switchTo().window(windowList.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click();
		
		driver.switchTo().window(windowList.get(0));
		driver.findElement(By.linkText("Merge")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String title = driver.getTitle();
		System.out.println("The Title Name is:" + title);
		
		if (title.contains("Contact"))
			
			System.out.println("Verification Successful:" + title);
		
		else 
			
			System.out.println("Verification Failed");
		
		driver.quit();

	}

}
