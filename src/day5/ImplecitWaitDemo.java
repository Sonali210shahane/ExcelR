package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplecitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		//if i enter the wrong name like firstname11 then the implecit Wait will wait for 5 seconds
		driver.findElement(By.name("firstname")).sendKeys("Sonali");
		

	}

}
