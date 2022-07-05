import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateRefund {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/users/sanjay.bhatt/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://192.168.15.237/sanjay-bagisto/public/admin/login");
		driver.findElement(By.id("email")).sendKeys("admin@example.com"); 
		driver.findElement(By.id("password")).sendKeys("admin123");		
		driver.findElement(By.className("btn-primary")).click(); 
		
		System.out.println("Login successfully");	
		
		driver.findElement(By.xpath("//div[@class='navbar-left']/ul/li[2]")).click();
		
		System.out.println("Orders Page Opened");		
		
		driver.findElement(By.xpath("//a[@href='http://192.168.15.237/sanjay-bagisto/public/admin/sales/orders/view/38']")).click();
		
		System.out.println("Order view icon clicked");	
		
		driver.findElement(By.xpath("//div[@class='page-action']/a[1]")).click();		
		
		System.out.println("Refund Button Clicked");
		
		driver.findElement(By.tagName("textarea")).sendKeys("This comment by Automate Software Selenium");
		driver.findElement(By.cssSelector("form button")).click();
		
		System.out.print("Comment Added");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='page-action'] button")).click();
		driver.findElement(By.xpath("//form/button[1]")).click();
		driver.findElement(By.xpath("//div[@class='page-action']/button[1]")).click();		
		
		System.out.println("Refund Created Successfully");

	}

}
