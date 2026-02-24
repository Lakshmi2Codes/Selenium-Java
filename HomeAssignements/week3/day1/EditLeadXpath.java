package homeassignments.week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLeadXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);

	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).sendKeys("Mycompany");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[3]")).sendKeys("Mho");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[4]")).sendKeys("Lax");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[5]")).sendKeys("P");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Test");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Learning Automation advanced Xpath");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("why@gmail.com");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option1 = new Select(state);
		option1.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
       driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
       driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
       driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Learning automation is crucial for QA");
       driver.findElement(By.xpath("//input[@name='submitButton']")).click();
      	String title = driver.getTitle();
      	System.out.println("The Title of the page is "+  title);
      	driver.close();

		
		
		
		
		
		

		
		
		

		
		
	}

}
