package selenium.com.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {
	
	static int indexofwon,indexofMat,indexofLost;
	
	static String Teams = "Rajasthan Royals";
	
	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Java_Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.espncricinfo.com/series/ipl-2021-1249214/points-table-standings");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> allheaders = driver.findElements(By.xpath("//table[@class='table table-sm standings-widget-table text-center mb-0 border-bottom']/thead/tr/th"));
		
		for (int i = 0; i < allheaders.size(); i++) {
			
			String text = allheaders.get(i).getText();
			
			
			if (text.equalsIgnoreCase("M")) {
				
				indexofMat=i;
				
				System.out.println("Total Match index value :"+ indexofMat);
				
			} else if (text.equalsIgnoreCase("W")) {
				
				indexofwon=i;
				
				System.out.println("Total Won index value :"+ indexofwon);
				
			} else if (text.equalsIgnoreCase("L")) {
				
				indexofLost=i;
				
				System.out.println("Total lost index value :"+ indexofLost);
				
			}
			
		}
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			List<WebElement> allrows = driver.findElements(By.xpath("//table[@class='table table-sm standings-widget-table text-center mb-0 border-bottom']/tbody/tr"));
			
			
				for (int i = 0; i < allrows.size(); i++) {
					
					List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));
					
					
					for (int j = 0; j < alldata.size(); j++) {
						
						
						if (alldata.get(j).getText().equalsIgnoreCase(Teams)) {
							
							System.out.println(Teams);
							
							System.out.println("Total won :"+  alldata.get(indexofwon).getText());
							
							System.out.println("Total Mat :"+ alldata.get(indexofMat).getText());
							
							System.out.println("Total Lost :"+ alldata.get(indexofLost).getText());
							
							System.exit(j);
							
						}
						
					}
					
					
					
					
					
				}
					
				}
		
		
				
				
				
				
			}
			
			
			
			
		
		
		
		
		
		
		
		
	


