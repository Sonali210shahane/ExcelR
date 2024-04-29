package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTxtBox=driver.findElement(By.id("email"));
		System.out.println(emailTxtBox.isDisplayed());
		System.out.println(emailTxtBox.isEnabled());
		if(emailTxtBox.isDisplayed()==true) {
			emailTxtBox.sendKeys("abc");
		}
		

	}

}
