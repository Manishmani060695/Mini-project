package selenium.com.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		ChromeDriver driver1 = new ChromeDriver();
		
		//driver.get("https://amazon.in/");
		driver1.get("https://WWW.google.co.in");
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		
		//driver.navigate().to("https:/www.google.co.in");
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.navigate().refresh();
		
		//driver.manage().window().maximize();
		
		//driver.close();
		
	}
	
	
	


}
