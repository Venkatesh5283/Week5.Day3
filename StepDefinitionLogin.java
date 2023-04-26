package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionLogin extends BaseClass {
	
	
	@Given ("Launch Browser and Load the URL and Maximize the Screen")
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	
	@And ("Enter the Username as {string}")
	public void enterUsername(String Username)
	{
		driver.findElement(By.id("username")).sendKeys(Username);
	}
	
	@And ("Enter the Password as {string}")
	public void enterPassword(String Password)
	{
		driver.findElement(By.id("password")).sendKeys(Password);
	}
	
	@When ("Click on Login Button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then ("Verify My Page Successfully login")
	public void verifyLogin()
	{
		String title = driver.getTitle();
		if(title.contains("Leaftaps"))
		{
			System.out.println("Login was Successful");
		}
		else
		{
			System.out.println("Login was not Successful");
		}
	}
	
}
