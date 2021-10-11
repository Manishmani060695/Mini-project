package selenium.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\Java_Selenium\\\\\\\\\\\\\\\\Driver\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://m.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		
		driver.findElement(By.xpath("//div[@id='hc']")).click();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		
		driver.switchTo().frame(frame1);
		
		WebElement findElement = driver.findElement(By.xpath("//div[@class='new-signin-header m-l-44']"));
		
		String text = findElement.getText();
		
		System.out.println(text);
		
		WebElement mobile = driver.findElement(By.xpath("//input[@type='number']"));
		
		mobile.sendKeys("8220196120");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//i[@class='icon-close']")).click();
		
		
		
		
		
	}

}
