package assignments.week2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		
		ChromeDriver driver = new ChromeDriver(opt);

	  	
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		
		String accountName = "LearnAutomateLaxmi1";
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement selectIndustry = driver.findElement(By.name("industryEnumId"));
		Select option = new Select(selectIndustry);
		option.selectByIndex(3);
		
		WebElement selectOwnership = driver.findElement(By.name("ownershipEnumId"));
		Select option2 = new Select (selectOwnership);
		option2.selectByVisibleText("S-Corporation");
		
		WebElement selectSource = driver.findElement(By.id("dataSourceId"));
		Select option3 = new Select(selectSource);
		option3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement selectCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select option4 = new Select (selectCampaign);
		option4.selectByIndex(6);
		
		WebElement selectState = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select option5 = new Select (selectState);
		option5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		
		
		
		if (text.contains(accountName)) {
		    System.out.println("Account Name Verified Successfully ✅");
		} else {
	    System.out.println("Account Name Verification Failed ❌");
	    
	   
	}
		
		driver.close();
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
