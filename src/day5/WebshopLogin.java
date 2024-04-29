package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebshopLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("shahanesonali2@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("sonali123");
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		driver.findElement(By.className("ico-logout")).click();

	}

}
