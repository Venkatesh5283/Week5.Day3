package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionCreateLead extends BaseClass {

	@When ("Click on CRMSFA Link")
	public void clickCRMSFALink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@And ("Click on Leads from Menu Bar")
	public void clickLead()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@And ("Click on Create Lead")
	public void selectCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@And ("Enter the Company Name as {string}")
	public void enterCName(String Cname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
	}
	
	@And ("Enter the First Name as {string}")
	public void enterFName(String Fname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
	}
	
	@And ("Enter the Last Name as {string}")
	public void enterLName(String Lname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
	}
	
	@And ("Enter the Phone Number as {string}")
	public void enterPNo(String Pno)
	{
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Pno);
	}
	
	@When ("After Entering the Values click on Create lead Button")
	public void clickCreateLead()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then ("Verify Lead was Created Successfully")
	public void verifyCreatedLead()
	{
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("HP")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
	
	
	
}
