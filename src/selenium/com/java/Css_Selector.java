package selenium.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//CSS selector [attribute name ='attribute value']
		
		driver.findElement(By.cssSelector("[title='English (UK)']")).click();
		
		
		driver.findElement(By.cssSelector("[id='email']")).sendKeys("8220196120");
		
		
	}

}
