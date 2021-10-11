package selenium.com.java;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement states = driver.findElement(By.xpath("//select[@name='States']"));
		
		Select s1 = new Select(states);
		
		boolean multiple = s1.isMultiple();
		System.out.println(multiple);
		
		
		List<WebElement> options = s1.getOptions();
		
		for (WebElement text : options) {
			
			String text2 = text.getText();
			
			System.out.println(text2);
			
		}
		
		
		System.out.println("-------------------------------");
		
		
		s1.selectByValue("California");
		
		s1.selectByValue("Ohio");
		
		s1.selectByValue("Texas");
		
		
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		
		
		for (WebElement webElement : allSelectedOptions) {
			
			String text = webElement.getText();
			
			System.out.println(text);
			
		}
		
		System.out.println("----------------------------------");
		
        WebElement firstSelectedOption = s1.getFirstSelectedOption();
        
        String text = firstSelectedOption.getText();
        System.out.println(text);
		
		
		
		
		
		
		
		
		
	}

}
