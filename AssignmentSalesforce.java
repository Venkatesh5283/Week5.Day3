package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentSalesforce {
	public ChromeDriver driver;
	public ChromeOptions opt;
	
	@Given ("Launch Browser and Load the URL and Maximize the Screen")
	public void maxi()
	{
		opt=new ChromeOptions();
		opt.addArguments("--disable-Notifications");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://login.salesforce.com");
	}
	
	@And ("Enter the Username as {string}")
	public void User(String Username)
	{
		driver.findElement(By.id("username")).sendKeys(Username);
	}
	
	@And ("Enter the Password as {string}")
	public void password(String Pass)
	{
		driver.findElement(By.id("password")).sendKeys(Pass);
	}
	
	@When ("Click on Login")
	public void clickLoginButton()
	{
		driver.findElement(By.id("Login")).click();
	}
	
	@And ("Click on toggle menu button from the left corner")
	public void clickToggle()
	{
		driver.findElement(By.className("slds-icon-waffle")).click();
	}
	
	@And ("Click view All")
	public void clickViewALL()
	{
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	
	@And ("click Sales from App Launcher")
	public void clickSales()
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	
	@And ("Click on Opportunity tab")
	public void clickOpp()
	{
		driver.findElement(By.xpath("//*[name() = 'svg'][contains(@class, 'slds-icon slds-icon-text-default slds-icon_xx-small')]")).click();
	}
	
	@And ("Click on New button")
	public void clickNewButton() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[name() = 'svg'][contains(@class, 'slds-icon slds-icon-text-default slds-icon_x-small')]")).click();
	}
	
	@And ("Enter Opportunity name as {string}")
	public void enterOppName(String OppName)
	{
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys(OppName);
	}
	
	@And ("Choose close date as Today")
	public void chooseDate()
	{
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']")).click();
		driver.findElement(By.xpath("(//span[text()='26'])[2]")).click();
	}
	
	@And ("Select Stage as Need Analysis")
	public void selectStage() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
	}
	
	@And ("click Save")
	public void clicksave()
	{
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	}
	
	@Then ("VerifyOppurtunity Name")
	public void verify_Opp_Name() throws InterruptedException
	{
		Thread.sleep(8000);
		Actions act=new Actions(driver);
		WebElement findElement=driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button_neutral')]"));
		act.click(findElement).perform();
		Thread.sleep(3000);
		String OptTitle = driver.findElement(By.xpath("(//span[@class='slds-text-body--regular slds-text-color--default slds-truncate slds-show'])[4]")).getAttribute("title");
		System.out.println(OptTitle);
		String OptName="Salesforce Automation by Venkatesh";
		System.out.println(OptName);
		if(OptName.equals(OptTitle))
		{
			System.out.println("Oppurtunity Name is Verified Successfully and it was presented");
		}
		else
		{
			System.out.println("Oppurtunity Name is Verified Successfully and it was not presented");

		}
	}


}
