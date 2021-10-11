package selenium.com.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Class {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\eclipse-workspace\\\\\\\\Java_Selenium\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		
      WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://WWW.amazon.in");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		Robot r = new Robot();
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		act.contextClick(mobile).perform();
		
		for (int i = 0; i < 5; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
