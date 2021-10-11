package selenium.com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	
	public static int indexofmin, indexofmax;
	
	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.myntra.com/shirts?f=Gender%3Amen%2Cmen%20women&rf=Discount%20Range%3A10.0_100.0_10.0%20TO%20100.0");
		
		driver.manage().window().maximize();
		
		
		 List<WebElement> discountprice = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));

		 List<Integer> Pricelist = new ArrayList<>();
		 
		for (int i = 0; i < discountprice.size(); i++) {
			
			String text = discountprice.get(i).getText().replace("Rs. ", "");
			
			int values = Integer.parseInt(text);
			
			Pricelist.add(values);
			
			}
		
		
		System.out.println(Pricelist);
		
		System.out.println("-----------------------------------------------------------");
		
		int size = Pricelist.size();
		
		System.out.println(size);
		
		Integer max = Collections.max(Pricelist);
		
		System.out.println("The maximum discount :"+ max);
		
		Integer min = Collections.min(Pricelist);
		
		System.out.println("The minimum disount :"+ min);
		for (int i = 0; i < size; i++) {
			
			if (Pricelist.get(i).equals(min)) {
				
				indexofmin = i;
				
				System.out.println("index of minimum prize: "+ indexofmin);
				
				discountprice.get(i).click();
				
			}
			
		}
		
		
	 
			
			
		
		
	}

}
