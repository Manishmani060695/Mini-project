package selenium.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Execute {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://WWW.amazon.in");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		
		js.executeScript("arguments[0].click();", mobile );
		
		
		Thread.sleep(2000);
		
		WebElement image = driver.findElement(By.xpath("//img[@alt='Apple Airpods pro']"));
		
		js.executeScript("arguments[0].scrollIntoView();", image);
		
        js.executeScript("alert('hii manikandan');"); 
        
        Thread.sleep(2000);
        
        driver.switchTo().alert().accept();
		
		
	}

}
