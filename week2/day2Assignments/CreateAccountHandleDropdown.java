package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountHandleDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		
		ChromeDriver cdriver= new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("http://leaftaps.com/opentaps/.");
		cdriver.findElement(By.id("username")).sendKeys("demosalesmanager");
		cdriver.findElement(By.id("password")).sendKeys("crmsfa");
		cdriver.findElement(By.className("decorativeSubmit")).click();
		cdriver.findElement(By.partialLinkText("CRM")).click();
		
		cdriver.findElement(By.linkText("Accounts")).click();
		cdriver.findElement(By.partialLinkText("Create Account")).click();
		
		cdriver.findElement(By.id("accountName")).sendKeys("TL Account Art");
		cdriver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//*Industry value as Computer Software*//
		WebElement sourcedropdown = cdriver.findElement(By.name("industryEnumId"));
		Select sel=new Select(sourcedropdown);
		sel.selectByIndex(3);
		
		//* Ownership as S-Corporation using select visible text*//
		
		WebElement ownership=cdriver.findElement(By.name("ownershipEnumId"));
		Select oSel=new Select(ownership);
		oSel.selectByVisibleText("S-Corporation");
		
		//* Source as Employee by SelectByvalue*//
		
		WebElement source=cdriver.findElement(By.id("dataSourceId"));
		Select vSource= new Select(source);
		vSource.selectByValue("LEAD_EMPLOYEE");
		
		//*Marketing Campaign as eCommerce Site Internal Campaign by selectByIndex*//
		
		WebElement mc = cdriver.findElement(By.id("marketingCampaignId"));
		Select mcsel = new Select (mc);
		mcsel.selectByIndex(5);
		
		//*State as Texas by SelectByvalue*//
		
		WebElement state= cdriver.findElement(By.id("generalStateProvinceGeoId"));
		Select selState= new Select(state);
		selState.selectByValue("TX");
		
		cdriver.findElement(By.className("smallSubmit")).click();

	
		
		cdriver.close();
	
		

	}

}
