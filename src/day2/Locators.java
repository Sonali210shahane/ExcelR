package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement returns us the web element always
		WebElement emailTxtBox=driver.findElement(By.id("email"));
	    emailTxtBox.sendKeys("sonali@gmail.com");
		Thread.sleep(2000);
		emailTxtBox.clear();
		
		//driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.name("firstname")).sendKeys("Sonali");
		//driver.findElement(By.name("lastname")).sendKeys("Shahane");
		//do same procedure for other elements....like email..password

		//driver.findElement(By.partialLinkText("Forgotten")).click();
	}

}
