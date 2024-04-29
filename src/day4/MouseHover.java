package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	//WebElement miniTV=driver.findElement(By.linkText("Amazon miniTV"));
	//Actions act=new Actions(driver);
	//act.moveToElement(miniTV).build().perform();
	
    WebElement sell=driver.findElement(By.linkText("Sell"));
	Actions sellact=new Actions(driver);
	sellact.moveToElement(sell).build().perform();
	}

}
