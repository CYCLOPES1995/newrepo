package practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PriceOfMobile {
	  public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE+"iphone12promax phone"+Keys.ENTER);
			Thread.sleep(4000);
			WebElement price = driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone')])[1]/../../div[2]/div[1]/div[1]/div[1]")); 	
			String price1 = price.getText();
			System.out.println(price1);
		    driver.close();
			
			}
            
	  }
