package day5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		
		String mainWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		
		Iterator itr=allWindows.iterator();
		
		while(itr.hasNext()) {
		String childWindow=(String)itr.next();
		if(!mainWindow.equalsIgnoreCase(childWindow));
		{
			driver.switchTo().window(childWindow);
			WebElement text=driver.findElement(By.id("sampleHeading"));
			System.out.println("Text is:"+text.getText());
			driver.close();
		}
			
		}
		
	}

}
