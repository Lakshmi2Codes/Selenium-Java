package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Methodspractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);

	  	
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		Boolean enabled = driver.findElement(By.linkText("Create Lead")).isEnabled();
		System.out.println(enabled);
		
		if(enabled) {
		driver.findElement(By.linkText("Create Lead")).click();
            System.out.println("Clicked on 'Create Lead'.");
        } else {
            System.out.println("Link is not enabled. Cannot click.");
        }
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshmi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Lakshmi Testleaf3");
		
		driver.findElement(By.name("submitButton")).click();
		
		String titleName = driver.getTitle();
		System.out.println("Page Title: " + titleName);
		if (titleName.contains(titleName)) {
		    System.out.println("Title Name Verified Successfully ✅");
		} else {
	    System.out.println("Title Name Verification Failed ❌");  
	    
	    driver.close();
		
		
		
		}
		

	}

}
