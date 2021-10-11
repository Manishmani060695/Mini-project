package selenium.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\eclipse-workspace\\\\\\\\Java_Selenium\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		
		//WebElement singleclick = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		
		Actions act = new Actions(driver);
		
		//act.click(singleclick).perform();
		
		//WebElement Rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		//act.contextClick(Rightclick).perform();
		
		//WebElement Double = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		//act.doubleClick(Double).perform();
		
		//WebElement moveto = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		//act.moveToElement(moveto).perform();
		
		//act.contextClick(moveto).perform();
		
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement targettt = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		act.dragAndDrop(source, targettt).perform();
		
	}

}
