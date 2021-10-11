package selenium.com.java;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Myntra {
	
	public static void main(String[] args) {
		
		String s= "899";
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.myntra.com/shirts?f=Gender%3Amen%2Cmen%20women&rf=Discount%20Range%3A10.0_100.0_10.0%20TO%20100.0");
		
		driver.manage().window().maximize();
		
		
		 List<WebElement> discountprice = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));

		 List<Integer> Pricelist = new ArrayList<>();
		 
		for (int i = 0; i < discountprice.size(); i++) {
			
			String text = discountprice.get(i).getText().replace("Rs. ", "");
			
			if (s==text) {
				
				discountprice.get(i).click();
				
			}

	}

}

}