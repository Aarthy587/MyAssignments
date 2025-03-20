package week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatefacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		WebElement login = driver.findElement(By.name("login"));
				login.click();
		driver.findElement(By.partialLinkText("Find your account and log in")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	

	}

}
