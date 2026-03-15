package week3.day2;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class CreateLeadXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);
driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
	
		//Advanced Xpath
	driver.findElement(By.xpath("//td[input[@id='createLeadForm_firstName']]/input")).sendKeys("Lakshmi");
	driver.findElement(By.xpath("//tbody//input[@id='createLeadForm_lastName']")).sendKeys("Mohan");
	driver.findElement(By.xpath("//td[input[@id='createLeadForm_companyName']]//input")).sendKeys("TestleafLakshmi");
	driver.findElement(By.xpath("//td [input [@id='createLeadForm_generalProfTitle']]/input")).sendKeys("AdvancedXpath");
	driver.findElement(By.name("submitButton")).click();
	driver.close();
	String titleName = driver.getTitle();
	System.out.println("Page Title: " + titleName);
	if (titleName.contains(titleName)) {
	    System.out.println("Account Name Verified Successfully ✅");
	} else {	    
		
		
		System.out.println("Account Name Verification Failed ❌");  
	
	
	}
	    
	    
		
	
		
		
		
		
		
		
		
		}
		
	}
	

		



