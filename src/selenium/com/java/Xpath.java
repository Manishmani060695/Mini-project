package selenium.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://WWW.facebook.com");
		
		driver.manage().window().maximize();
		
		//WebElement user = driver.findElement(By.name("email"));
		//user.sendKeys("mani236148@gmail.com");
		
		//WebElement password = driver.findElement(By.name("pass"));
		//password.sendKeys("Virat@18");
		
		WebElement English = driver.findElement(By.xpath("//a[@title='English (UK)']"));
		English.click();
		
		//WebElement Login = driver.findElement(By.name("login"));
		//Login.click();
		
		WebElement newacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		newacc.click();
		
		Thread.sleep(2000);
		
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("Manikandan");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Sankar");
		
		
		WebElement mobile = driver.findElement(By.xpath("//input[contains(@aria-label,'number or email')]"));
		mobile.sendKeys("8220196120");
		
		
		WebElement newpass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		newpass.sendKeys("Virat@188");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s1 = new Select(day);
		
		s1.selectByValue("6");
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s2= new Select(month);
		
		s2.selectByVisibleText("Jun");
		
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s3 = new Select(year);
		
		s3.selectByIndex(28);
		
		
		
		
	}

}
