package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println("Alert msg is: "+msg);
		Thread.sleep(2000);
        alert.accept();
	}

}

