package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Absolute Xpath
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("shahanesonali2@gmail.com");
		
		//Relative Xpath
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sonali123");
        driver.findElement(By.name("login")).click();
	}

}















//Absolute Xpath
		//It is starting from route node of the html
		//It is starting from /single forward slash
		//it is more accurate
		//not recomended to use because developers changes the code so the path changes
		//Syntax:inspect element right click, copy and then copy Xpath
//Relative Xpath
		//It is starting from current node of the html element
		//It is starting from // double forward slash
		//it is less accurate
		//It is recomended to use 
		//Syntax: //tagname[@attribute='value']
