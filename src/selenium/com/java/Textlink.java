package selenium.com.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textlink {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https:amazon.in");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebElement about_us = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//js.executeScript("arguments[0].scrollIntoView();", about_us);
		
		//Thread.sleep(2000);
		
		driver.findElement(By.linkText("About Us")).click();
	
		
		
	}

}
