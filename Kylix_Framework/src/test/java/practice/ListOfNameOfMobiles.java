package practice;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListOfNameOfMobiles {
	     
            public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			//driver.findElement(By.xpath("(//button)[2]")).click();;
			driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE+"iphone12promax phone"+Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
			List<WebElement> name = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 12 Pro Max ')]"));
			int count = name.size();
			System.out.println(count);
			for(int i=0;i<count;i++)
			{
				String phonename = name.get(i).getText();
				System.out.println(phonename);
			}
			driver.close();
		}

	}



