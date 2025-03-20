package week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HACreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver chrome =new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("http://leaftaps.com/opentaps/.");
		
		chrome.findElement(By.id("username")).sendKeys("demosalesmanager");
		WebElement pwrd = chrome.findElement(By.id("password"));
		pwrd.sendKeys("crmsfa");
		chrome.findElement(By.className("decorativeSubmit")).click();
		chrome.findElement(By.partialLinkText("CRM")).click();
		chrome.findElement(By.linkText("Leads")).click();
		chrome.findElement(By.partialLinkText("Create")).click();
		chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("Aarthy");
		chrome.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		chrome.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SDET");
		chrome.findElement(By.name("submitButton")).click();
		String pageTitle = chrome.getTitle();
		System.out.println(pageTitle);
		chrome.close();
		
	}
	

}
