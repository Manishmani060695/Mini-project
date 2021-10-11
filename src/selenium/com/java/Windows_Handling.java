package selenium.com.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\eclipse-workspace\\\\\\\\Java_Selenium\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		
	      WebDriver driver = new ChromeDriver();
			
			
			driver.get("http://WWW.amazon.in");
			
			driver.manage().window().maximize();
			
			Actions act = new Actions(driver);
			
			Robot r = new Robot();
			
			WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
			
			act.contextClick(mobile).perform();
			
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
			WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
			
			act.contextClick(fashion).perform();
			
               Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
			
			act.contextClick(electronics).perform();
			
             Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
			//getwindowHandle()  ---->  return parent window id
			
			
			//String windowHandle = driver.getWindowHandle();
			
			//String title = driver.switchTo().window(windowHandle).getTitle();
			
			//System.out.println(title);
			
			//getwindowHandles()-----> return all window id
			
			Set<String> activewindow = driver.getWindowHandles();
			
			//for (String str : activewindow) {
				
				//String active = driver.switchTo().window(str).getTitle();
				
				//System.out.println(active);
				
				//Thread.sleep(2000);
				
			//}
			
			//String s ="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
			
			
			
			//for (String str : activewindow) {
				
				
				//if (driver.switchTo().window(str).getTitle().equals(s)) {
					
					
					//break;
					
				//}
				
			//}
			
			
			//driver.findElement(By.xpath("//a[@class='nav-a nav-hasArrow']")).click();
			
			
			Iterator<String> ite = activewindow.iterator();
			
			//while (ite.hasNext()) {
				
				//String next = ite.next();
				//String title = driver.switchTo().window(next).getTitle();
				
				//System.out.println(title);
				
			//}
			
			String Amazon_Home = ite.next();
			
			String Mobiles = ite.next();
			
			String Fashion = ite.next();
			
			String Electroincs = ite.next();
			
			
			driver.switchTo().window(Fashion);
			
			driver.findElement(By.xpath("(//a[@class='nav-a nav-hasArrow'])[2]")).click();
			
			
			
			
			
	}

}
