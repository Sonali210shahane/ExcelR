package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("test case is pass");
		}
		else {
			System.out.println("test case is fail");
		}
           driver.close();
	}

}
