package homeassignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		
	
		
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Lakshmi");
		
		driver.findElement(By.name("lastname")).sendKeys("Mohan");
		
		WebElement monthElement = driver.findElement(By.id("month"));
		
		Select option = new Select(monthElement);
		
		option.selectByIndex(5);
		
		WebElement dayElement = driver.findElement(By.id("day"));
		
		Select option2 = new Select(dayElement);
		
		option2.selectByValue("16");
		
		WebElement yearElement = driver.findElement(By.id("year"));
		
		Select option3 = new Select(yearElement);
		
		option3.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("2508793169");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Face@12345678");
		
		driver.findElement(By.name("websubmit")).click();
		
		//driver.close();	

	}

}
