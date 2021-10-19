package testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class TC_01CreateOrganisation {
	public static void main(String[] args) throws Throwable {
	WebDriverUtility wutil = new WebDriverUtility();
	
		
	ExcelUtility eutil=new ExcelUtility();
		 String email = eutil.getExcelData("Sheet1", 4, 3);
		 String phone = eutil.getExcelData("Sheet1", 1, 3);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		FileUtility f = new FileUtility();
		String url = f.getJsonKeyValue("url");
		String username = f.getJsonKeyValue("username");
		String password = f.getJsonKeyValue("password");
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("(//img[contains(@alt,'Create Organization...')])[1]")).click();
		driver.findElement(By.name("accountname")).sendKeys("My Organization"+JavaUtility.getRandomData());
		driver.findElement(By.name("website")).sendKeys("www.xyz123@abc.com");
		driver.findElement(By.id("employees")).sendKeys("5000");
		WebElement industry = driver.findElement(By.name("industry"));
		wutil.selectOption("Technology", industry);
		
//		Select s = new Select(industry);
//		s.selectByValue("Technology");
		WebElement accounttype = driver.findElement(By.name("accounttype"));
		Select s1 = new Select(accounttype);
		s1.selectByValue("Customer");
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("fax")).sendKeys("12340@abu");
		driver.findElement(By.name("otherphone")).sendKeys("5468974512");
		driver.findElement(By.name("email1")).sendKeys(email);
		WebElement rating = driver.findElement(By.name("rating"));
		Select s3 = new Select(rating);
		s3.selectByValue("Active");
		driver.findElement(By.name("annual_revenue")).clear();
		driver.findElement(By.name("annual_revenue")).sendKeys("90000000");
		driver.findElement(By.name("notify_owner")).click();
		driver.findElement(By.name("bill_street")).sendKeys("1445 Caldwell Road");
		driver.findElement(By.name("bill_city")).sendKeys("Yates City");
		driver.findElement(By.name("bill_state")).sendKeys("Illinois");
		driver.findElement(By.name("bill_code")).sendKeys("11004");
		driver.findElement(By.name("bill_country")).sendKeys("France");
		driver.findElement(By.xpath("(//input[@name='cpy'])[2]")).click();
		driver.findElement(By.name("description")).sendKeys(
				"My Organization is a global leader in IT services, consulting & business solutions with a large network of innovation & delivery centers. ");
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//td[@class='small'])[2]")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();
}
}