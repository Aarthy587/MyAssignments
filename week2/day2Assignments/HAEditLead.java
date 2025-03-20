package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HAEditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*Login*/
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		WebElement pwrd = driver.findElement(By.id("password"));
		pwrd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
/*Create Lead*/
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
/*Entering Details */		
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeafTesting");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Account");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Art");
	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Operations");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	
	/* Entering email id */
	
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aarthy.587@gmail.com");
	
	/*Entering Phone number*/
	
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("98765");
	
	/*Entering State & Province field */
	
	WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
	Select sel = new Select(state);
	sel.selectByVisibleText("New York");
	
	/* Click on Create */
	driver.findElement(By.name("submitButton")).click();
	

	/*Click on Edit*/
	
	 driver.findElement(By.xpath(" //a[text()='Edit']")).click();
	 
	 //*Clear Description */
	 
	 WebElement description = driver.findElement(By.name("description"));
	 description.clear();
	 
	 /*Fill the important note field*/
	 
	 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updated Lead");
	 /* Click on Update*/
	 driver.findElement(By.className("smallSubmit")).click();
	 
	 /* get page tile  */
	 
	 String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		
	
	driver.close();
	
	}

}
