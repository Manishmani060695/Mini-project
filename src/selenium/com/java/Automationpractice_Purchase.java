package selenium.com.java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationpractice_Purchase {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				
				driver.get("http://automationpractice.com/index.php");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//a[@class='login']")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Manikanjob@gmail.com");
				
				driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Virat@018");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//a[@class='product_img_link']")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				WebElement dressquantity = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
				
				driver.switchTo().frame(dressquantity);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				for (int i = 0; i < 9; i++) {
					
					driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
					
				}
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
				
				Select s1= new Select(size);
				
				s1.selectByValue("2");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//a[@name='Blue']")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//button[@name='Submit']")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				Thread.sleep(5000);
				
				TakesScreenshot ts = (TakesScreenshot) driver;
				
				File source = ts.getScreenshotAs(OutputType.FILE);
				
				File dest = new File("C:\\Users\\User\\eclipse-workspace\\Java_Selenium\\Screenshot\\purchase.png");
				
				FileUtils.copyFile(source, dest);
				
				driver.switchTo().defaultContent();
				
				driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				WebElement Address = driver.findElement(By.xpath("//h3[text()='Your delivery address']"));
				
				js.executeScript("arguments[0].scrollIntoView();", Address);
				
				
				File source1 = ts.getScreenshotAs(OutputType.FILE);
				
				File dest1 = new File("C:\\Users\\User\\eclipse-workspace\\Java_Selenium\\Screenshot\\address.png");
				
				FileUtils.copyFile(source1, dest1);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//input[@id='cgv']")).click();
				
				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//a[@class='bankwire']")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
				
				WebElement orderconfirm = driver.findElement(By.xpath("//strong[text()='Your order on My Store is complete.']"));
				
				js.executeScript("arguments[0].scrollIntoView();", orderconfirm);
				
				File source2 = ts.getScreenshotAs(OutputType.FILE);
				
				File dest2 = new File("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Screenshot\\\\orderconfirm.png");
				
				FileUtils.copyFile(source2, dest2);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//i[@class='icon-home']")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("(//img[@title='Printed Dress'])[2]")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
				
				driver.switchTo().frame(frame2);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				for (int i = 0; i < 9; i++) {
					
					driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']")).click();
					
				}
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				WebElement size2 = driver.findElement(By.xpath("//select[@id='group_1']"));
				
				Select s2 = new Select(size2);
				
				s2.selectByValue("2");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//a[@title='Pink']")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//button[@class='exclusive']")).click();
				
				Thread.sleep(3000);
				
				File src = ts.getScreenshotAs(OutputType.FILE);
				
				File destination = new File("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Screenshot\\\\purchase1.png");
				
				FileUtils.copyFile(src, destination);
				
				driver.switchTo().defaultContent();
				
				driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
				
				driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				WebElement address2 = driver.findElement(By.xpath("//h3[text()='Your delivery address']"));
				
				js.executeScript("arguments[0].scrollIntoView();", address2);
				
				File src1 = ts.getScreenshotAs(OutputType.FILE);
				
				File destination1 = new File ("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Screenshot\\\\address2.png");
				
				FileUtils.copyFile(src1, destination1);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
				
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				
				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				WebElement orderconfirmation1 = driver.findElement(By.xpath("//strong[text()='Your order on My Store is complete.']"));
				
				js.executeScript("arguments[0].scrollIntoView();", orderconfirmation1);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				File src2 = ts.getScreenshotAs(OutputType.FILE);
				
				File destination2 = new File("C:\\\\\\\\Users\\\\\\\\User\\\\\\\\eclipse-workspace\\\\\\\\Java_Selenium\\\\\\\\Screenshot\\\\\\\\secondorder.png");
				
				
				FileUtils.copyFile(src2, destination2);
				
				
				
				
				
				
				
				

}

}