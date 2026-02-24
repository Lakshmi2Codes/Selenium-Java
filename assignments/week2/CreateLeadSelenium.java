package assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadSelenium {

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
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshmi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Lakshmi Testleaf");
		
		
		String titleName = ("LearnAutomate3");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(titleName);
		
		driver.findElement(By.name("submitButton")).click();
		
		String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[11]")).getText();
		
		if (text.contains(titleName)) {
		    System.out.println("Account Name Verified Successfully ✅");
		} else {
	    System.out.println("Account Name Verification Failed ❌");
	    
	    
	  
	    
		}
		
	
		
		driver.close();
		
		
		
		
		
		

	}

}
