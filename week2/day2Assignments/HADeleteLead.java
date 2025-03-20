package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HADeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
/* Lead Tab*/
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
/*Click on Find leads */
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		/* click on Phone tab*/
		
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	
	/* Enter phone number for search */
	
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98765");
	
	/*Click on Find Leads*/
	
	Thread.sleep(2000);
     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

     /*Capture id of First resulting Lead */
     Thread.sleep(2000);
     
     String firstelment=driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
     System.out.println(firstelment);
     
     /*Click on first resultant*/
     
     driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
        
     
     /* click on Delete*/
     driver.findElement(By.xpath("//a[text()='Delete']")).click();
     
 	/*Click on Find Leads again*/
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
     
     /* Enter captured lead id*/
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstelment);
     
     
     /*Click on Find Leads Again */
    Thread.sleep(2000);
     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
     
     /*get text verify the message*/
     Thread.sleep(2000);

     String Expected ="No records to display";
     String actual = driver.findElement(By.xpath("//*[@class='x-paging-info']")).getText();
     boolean result;
     
     if(result=actual.equals(Expected)) {
    	 
    	 System.out.println(actual);
     }
     else 
    	 System.out.println("Test Case Failed");
     
     driver.close();
     
	
		
	}

}
