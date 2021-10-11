package selenium.com.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationpractice_Register {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("Manikanjob@gmail.com");
		
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Manikandan");
		
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Sankar");
		
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Virat@018");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		
		Select s1 = new Select(days);
		
		s1.selectByValue("6");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
		
		Select s2 = new Select (months);
		
		s2.selectByValue("6");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
		
		Select s3 = new Select(years);
		
		s3.selectByValue("1995");
		
		driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		
		driver.findElement(By.xpath("//input[@name='optin']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Manikandan");
		
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Sankar");
		
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Accenture");
		
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("424 LIG Thamarainagar");
		
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("22nd street");
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Thiruvannamalai");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement states = driver.findElement(By.xpath("//select[@id='id_state']"));
		
		Select s4= new Select(states);
		
		s4.selectByValue("5");
		
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("60001");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
		
		Select s5= new Select(country);
		
		s5.selectByValue("21");
		
		driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("Nothing");
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8220196120");
		
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("8220196120");
		
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("424 LIG thamarai Nagar");
		
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
	}

}
