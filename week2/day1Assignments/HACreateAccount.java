package week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HACreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver cdriver= new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("http://leaftaps.com/opentaps/.");
		cdriver.findElement(By.id("username")).sendKeys("demosalesmanager");
		cdriver.findElement(By.id("password")).sendKeys("crmsfa");
		
		cdriver.findElement(By.className("decorativeSubmit")).click();
		cdriver.findElement(By.partialLinkText("CRM")).click();
		cdriver.findElement(By.partialLinkText("Create Account")).click();
		cdriver.findElement(By.id("accountName")).sendKeys("TL Account A");
		cdriver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		cdriver.findElement(By.id("numberEmployees")).sendKeys("90");
		cdriver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		cdriver.findElement(By.className("smallSubmit")).click();
		String pageTitle = cdriver.getTitle();
		System.out.println(pageTitle);
		cdriver.close();

		
		
	}

}
