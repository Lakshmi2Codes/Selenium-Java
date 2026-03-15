package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadSelect {

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
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Lakshmi Testleaf2");
		
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));	
		Select option = new Select (Source);
		option.selectByIndex(4);
		
		WebElement Marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));	
		Select option2 = new Select (Marketing);
		option2.selectByVisibleText("Automobile");
		
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));	
		Select option3 = new Select (Ownership);
		option3.selectByValue("OWN_CCORP");
	
		
		String titleName = ("LearnAutomate7");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(titleName);
		
		driver.findElement(By.name("submitButton")).click();
		
String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[11]")).getText();
		
		if (text.contains(titleName)) {
		    System.out.println("Account Name Verified Successfully ✅");
		} else {
	    System.out.println("Account Name Verification Failed ❌");
		
		
	    driver.close();
		
		}	
		
		
		
		
	}

}
