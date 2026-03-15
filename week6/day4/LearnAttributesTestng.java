package week6.day4;

import org.testng.annotations.Test;

public class LearnAttributesTestng {
	
	@Test (priority = 4, enabled = true)
	public void createLead() {
	System.out.println("CreatLead");
	}

	@Test
	public void editLead () {
		System.out.println("EditLead");
	}
	
	@Test (invocationCount = 3, invocationTimeOut = 3000)
	public void deleteLead() {
	System.out.println("DeleteLead");
	}
	
	@Test (enabled = true)
	public void mergeLead() {
		System.out.println("MergeLead");
	
	}
	
	@Test (enabled = false, priority = 2)
	public void duplicateLead() {
	System.out.println("DuplicateLead");
	}
	
}
