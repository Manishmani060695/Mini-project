package selenium.com.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_Launchedge {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Selenium\\Driver\\msedgedriver.exe");
		
		WebDriver driver1 = new EdgeDriver();
		
		driver1.get("https://WWW.google.co.in");
		
		driver1.navigate().to("https://amazon.in/");
		
		driver1.navigate().back();
		
		driver1.manage().window().maximize();
		
	}
	
	

}
