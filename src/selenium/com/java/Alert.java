package selenium.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\eclipse-workspace\\\\\\\\Java_Selenium\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
		
		Thread.sleep(6000);
		
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
		
		Thread.sleep(3000);
		
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		
		String text = alert2.getText();
		
		System.out.println(text);
		
		
		alert2.sendKeys("Manishh!!");
		
		
		alert2.accept();
		
		
		
		
		
		
		
		
	}
	
	
	

}
