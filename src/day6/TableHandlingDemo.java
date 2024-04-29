package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandlingDemo {

	public static void main(String[] args) {
		
		/*1. get all rows
		 *2. get all columns
		 *3.iterate rows and columns and get the text
		 * 
		 * 
		 * */
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.asx.com.au/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.xpath("//h5[@role='tab'][2]")).click();
		//pn-ProductNav_Link cmp-tabs__tab gtm-tab cmp-tabs__tab--active
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='md-bootstrap-tooltip']/tr"));
		int row=rows.size();
		System.out.println("The number of rows are:"+row);
		
		List<WebElement> cols=driver.findElements(By.xpath("//table[@class='md-bootstrap-tooltip']/tr[1]/th"));
		int col=cols.size();
		System.out.println("The number of columns are:"+col);
	}

}
