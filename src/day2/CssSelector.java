package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//css selector by using id #id
		driver.findElement(By.cssSelector("#email")).sendKeys("shahanesonali2@gmail.com");
		//css selector by using input[attribute=value]
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("sonali123");
		

	}

}
