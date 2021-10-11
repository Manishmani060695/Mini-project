package selenium.com.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_Orange {
	
	static int indexofUserRole,indexofEmployee,indexofStatus;
	
	static String Username1= "Manish@123";
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		WebElement Logininfo = driver.findElement(By.xpath("//span[text()='( Username : Admin | Password : admin123 )']"));
		
		String text = Logininfo.getText();
		
		System.out.println(text);
		
		System.out.println("--------------------------------------------");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement userid = driver.findElement(By.xpath("(//select[@class='formSelect'])[1]"));
		
		Select s1 = new Select(userid);
		
		s1.selectByValue("1");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Anthony Nolan");
		
		driver.findElement(By.xpath("//input[@class='formInputText']")).sendKeys("Manish@123");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Manish@123");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Manish@123");
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> allheaders = driver.findElements(By.xpath("//table[@class='table hover']/thead/tr/th"));
		
		for (int i = 0; i < allheaders.size(); i++) {
			
			String text2 = allheaders.get(i).getText();
			
			if (text2.equalsIgnoreCase("User Role")) {
				
				indexofUserRole = i;
				
			}else if (text2.equalsIgnoreCase("Employee Name")) {
				
				indexofEmployee =i;
				
			}else if (text2.equalsIgnoreCase("Status")) {
				
				indexofStatus =i;
				
			}
			
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
		
		for (int i = 0; i <allrows.size(); i++) {
			
			List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));
			
			
			for (int j = 0; j < alldata.size(); j++) {
				
				
				if (alldata.get(j).getText().equalsIgnoreCase(Username1)) {
					
					System.out.println(Username1);
					
					System.out.println("User Role: "+ alldata.get(indexofUserRole).getText());
					
					System.out.println("Employee Name :"+ alldata.get(indexofEmployee).getText());
					
					System.out.println("Status :"+ alldata.get(indexofStatus).getText());
					
					System.exit(j);
					
				}
				
			}
			
		}
			
		}
		
	}


