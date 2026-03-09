package assignments.week5.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FinanceYahoo {

	public static void main(String[] args) throws InterruptedException {
		
		
		 ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.get("https://finance.yahoo.com/");
     	driver.findElement(By.linkText("Markets")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Crypto")).click();
		Thread.sleep(3000);
		List<WebElement> currencyname=driver.findElements(By.xpath("//div[contains(@class,'table-container')]//td[2]"));
        List<String> cryptoCurrencyNames = new ArrayList<>();
        for (WebElement crypto : currencyname) {
        	cryptoCurrencyNames.add(crypto.getText());
        }
        System.out.println("Total Crypto Currency found:" + cryptoCurrencyNames.size());
			
			System.out.println("List of CryptoCurrecy Names:");
			
			cryptoCurrencyNames.forEach(System.out::println);  
			
        
         
	}
	
}
	
