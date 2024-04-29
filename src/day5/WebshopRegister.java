package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebshopRegister {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//	Register page
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Sonali");
		driver.findElement(By.name("LastName")).sendKeys("Shahane");
		driver.findElement(By.id("Email")).sendKeys("shahanesonali2@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("sonali123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("sonali123");
		driver.findElement(By.id("register-button")).click();
		
	}

}
