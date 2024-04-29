package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowSize=rows.size();
		System.out.println("Total number of rows :"+rowSize);
		
		List<WebElement> cols =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		int colSize=cols.size();
		System.out.println("Total number of rows :"+colSize);
		
		
		}

	}


