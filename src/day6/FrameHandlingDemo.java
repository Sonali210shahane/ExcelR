package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
        driver.switchTo().frame(0);
        //or
        //driver.switchTo().frame("PackageListFrame");
        //or
       // WebElement frame=driver.findElement(By.name("packageListFrame"));
        //driver.switchTo().frame(frame);
        
        driver.findElement(By.linkText("java.applet")).click();
        //defaultContent() is used to move out from the existing frame
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(1);
        driver.findElement(By.linkText("Applet")).click();
         
	}

}
