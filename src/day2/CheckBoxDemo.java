package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 driver.get("https://demoqa.com/checkbox");
	 //for checking the check box
	 driver.findElement(By.className("rct-checkbox")).click();
	 //for unchecking the check box
	 driver.findElement(By.className("rct-checkbox")).click();
	 

	}

}
