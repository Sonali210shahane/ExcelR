package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {
//findElements is used to find all the elements

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//for finding all the elements the list of <WebElement> is used
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        int count=allLinks.size();
        System.out.println("Total no of links:"+count);
        for(int i=0;i<count;i++) {
        	System.out.println(allLinks.get(i).getText());
        }
	}
	

}
