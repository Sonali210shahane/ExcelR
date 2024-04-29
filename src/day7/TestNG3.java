package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG3 {
        /*@BeforeMethos
         *@Test
         *@AfterMethod 
         * */
	 WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Browser is opened");
		 driver=new ChromeDriver();
	
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Browser is closeded");
		driver.close();
	}
	@Test(priority = 2)
	public void enterUrl() {
		System.out.println("URL is entered");
		driver.get("https://www.facebook.com/");
	}
	@Test(priority = 1)
	public void enterUrl2() {
		System.out.println("URL2 is entered");
	driver.get("https://www.google.com/");
	}
}
