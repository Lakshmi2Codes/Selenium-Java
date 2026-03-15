package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLeadTestNg extends ProjectSpecificMethods {
	
	@DataProvider(name = "getValue")
	public String[][] fetchData() {
		// |cName|fName|lName|
		// |TestLeaf|Laxmi|Prasath|
		// |TestLeaf|Lakshmi|Mohan|

		String[][] data = new String[2][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Laxmi";
		data[0][2] = "Prasath";

		data[1][0] = "TestLeaf";
		data[1][1] = "Lakshmi";
		data[1][2] = "Mohan";
		return data;
	
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
	
