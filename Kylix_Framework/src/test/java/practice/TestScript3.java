package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE+"iphone12promax phone"+Keys.ENTER);
		driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone 12 ')])[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> c = driver.getWindowHandles();
		Iterator<String> i = c.iterator();
		while(i.hasNext()) 
		{
			String child = i.next();
			String child1 = i.next();
			if(!(parent.equals(child1)))
			driver.switchTo().window(child1);
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button)[2]")).click();
			driver.switchTo().window(child);
			Thread.sleep(5000);
		    driver.findElement(( By.name("q"))).sendKeys(Keys.CONTROL+"A");
		    driver.findElement(( By.name("q"))).sendKeys("samsung galaxy"+Keys.ENTER);
		    driver.findElement(By.linkText("SAMSUNG Galaxy F62 (Laser Blue, 128 GB)")).click();
		    Set<String> cd = driver.getWindowHandles();
		    Iterator<String> itr = cd.iterator();
		    String parent1 = itr.next();
		    String child2 = itr.next();
		    String child3 = itr.next();
		    driver.switchTo().window(child3);
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("(//button)[2]")).click();
		    Thread.sleep(3000);
//		    WebElement cart = driver.findElement(By.xpath("//div[contains(text(),'My Cart (2)')]"));
//		    if(cart.equals("My Cart (2)")) {
//		    	System.out.println("items are added");
//		    	
//		    }
//		    else {
//		    	System.out.println("items are not added");
//		    }
		    driver.close();
		   
		}
		

	}
}