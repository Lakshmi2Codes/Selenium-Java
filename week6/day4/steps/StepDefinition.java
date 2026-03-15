package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.*;

public class StepDefinition {

	WebDriver driver;

	@Given(":launch the browser")
	public void launch_the_browser() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
	   
	}

	@When(":load the URL {string}")
	public void load_the_url(String string) {
		driver.get("http://leaftaps.com/opentaps/control/main");
	    
	}

	@When(":Enter username {string}")
	public void enter_username(String string) {
		driver.findElement(By.id("username")).sendKeys("Democsr");
	   
	}

	@When(":Enter password {string}")
	public void enter_password(String string) {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	    
	}

	@When(":Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    
	}

	@Then(": Should land on the CRM\\/SFA page successfully")
	public void should_land_on_the_crm_sfa_page_successfully() {
	    String title = driver.getTitle();
        if (title.contains("Leaftaps"))
            System.out.println("Landed on CRM/SFA page successfully");
        else
            System.out.println("Login failed!");
    }
	

}