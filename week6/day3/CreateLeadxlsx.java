package week6.day3;




import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import week6.day1.ProjectSpecificMethods;

public class CreateLeadxlsx extends ProjectSpecificMethods {
	
	
	 String FileName;



	@BeforeClass
	
	public void SetData() {
		
		FileName = "CreateLead";
	}
	

	@Test(dataProvider = "getValue")

	public void createLead(String companyName, String firstName, String lastName) {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		String titleName = ("LearnAutomate3");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(titleName);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[11]")).getText();
		if (text.contains(titleName)) {
			System.out.println("Account Name Verified Successfully ✅");
		} else {
			System.out.println("Account Name Verification Failed ❌");

		}

	}

}
