package selenium.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://WWW.flipkart.com/");
		
		//WebElement email = driver.findElement(By.id("email"));
		
		//email.sendKeys("8220196120");
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("mobile");
		
		//WebElement loginclick = driver.findElement(By.name("login"));
		
		//loginclick.click();
		
		
		
	}

}
