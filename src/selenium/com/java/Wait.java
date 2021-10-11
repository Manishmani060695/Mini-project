package selenium.com.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\eclipse-workspace\\\\\\\\Java_Selenium\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		
	      WebDriver driver = new ChromeDriver();
			
			
			driver.get("http://WWW.amazon.in");
			
			driver.manage().window().maximize();
			
			Actions act = new Actions(driver);
			
			Robot r = new Robot();
			
			WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
			
			act.contextClick(mobile).perform();
			
			//Implicit Wait
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			
			// Explicit Wait
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			wait.until(ExpectedConditions.visibilityOf(mobile));
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Set<String> activewindow = driver.getWindowHandles();
			
			
			Iterator<String> ite = activewindow.iterator();
			
			
			String Amazon_Home = ite.next();
			
			String mobile1 = ite.next();
			
			//   Fluent Wait
			
			FluentWait wait1 = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);
			
			
			driver.switchTo().window(mobile1);
			
			
			
			
		
	}

}
