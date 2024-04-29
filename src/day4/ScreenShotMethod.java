package day4;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotMethod {
 static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		captureScreenshot("Facebook.Login");
         driver.close();
	}
	public static void captureScreenshot(String name) throws IOException {
		String path="./Screenshots/"+name+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(path);
		Files.copy(screenshot, target);
	}

}
