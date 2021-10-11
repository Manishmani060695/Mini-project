package selenium.com.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_WindowsHandling {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\eclipse-workspace\\\\\\\\Java_Selenium\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		
	      WebDriver driver = new ChromeDriver();
			
			
			driver.get("https://the-internet.herokuapp.com/windows");
			
			driver.manage().window().maximize();
			
			Actions act = new Actions(driver);
			
			Robot r = new Robot();
			
			driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
			
			Set<String> activewindow = driver.getWindowHandles();
			
			Iterator<String> ite = activewindow.iterator();
			
			String Internet = ite.next();
			
			String New_Window = ite.next();
			
			
			driver.switchTo().window(New_Window);
			
			Thread.sleep(1000);
			
			WebElement texting = driver.findElement(By.xpath("//h3[text()='New Window']"));
			
			String text = texting.getText();
			
			System.out.println(text);
			
			driver.switchTo().window(Internet);
			
			Thread.sleep(1000);
			
			WebElement findElement = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
			
			String text2 = findElement.getText();
			
			System.out.println(text2);
	}

}
