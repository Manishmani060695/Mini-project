package selenium.com.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {
	
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://amazon.in");
		
		driver.manage().window().maximize();
		
		// convert web driver object to Takescreenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//call getScreenshotAS method to create image file
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// create a file location
		
		File dest = new File("C:\\Users\\User\\eclipse-workspace\\Java_Selenium\\Screenshot\\Snap1.png");
		
		// copy file to Desired location
		
	   FileUtils.copyFile(src, dest);
		
		
		
		
	}

}
