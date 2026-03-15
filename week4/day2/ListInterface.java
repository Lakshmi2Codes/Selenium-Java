package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) {
		
		
			//Launch the browser
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			//Load URL
		    driver.get("https://www.amazon.in/");
		    //Add implicit wait
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    //Enter the Bags for boys in search box
		    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		    //Click Search
		    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		    
		    List<WebElement> Phoneprice = driver.findElements(By.className("a-price-whole"));
		    
		    for (WebElement List:Phoneprice)
		    	
		    System.out.println(List.getText());
    
		    
////		    for (int i=0; i<Phoneprice.size();i++) {
////		    	
////		    	System.out.println("List of phone prices: " + Phoneprice.get(i).getText());
//		    	
//		    }
		    	
		    
		    
		    
		    
	}

}


