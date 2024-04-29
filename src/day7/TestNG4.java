package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG4 {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Browser is opened");
		 driver=new ChromeDriver();
	
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Browser is closeded");
		driver.close();
	}
	@Test
	public void enterUrl() {
		System.out.println("URL is entered");
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
	}
	
}



