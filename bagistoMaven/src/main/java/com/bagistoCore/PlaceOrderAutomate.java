package com.bagistoCore;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PlaceOrderAutomate {

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.gecko.driver", "/home/users/sanjay.bhatt/geckodriver-v0.31.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "/home/users/sanjay.bhatt/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://192.168.15.237/sanjay-bagisto/public/");		
		
		driver.manage().window().maximize(); //Mazimize current window

		Thread.sleep(2000);    //Delay execution for 5 seconds to view the maximize operation				
		
		driver.findElement(By.className("welcome-content")).click();
		
		
		driver.findElement(By.linkText("Sign In")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("sanjay.bhatt371@webkul.in");  
		driver.findElement(By.name("password")).sendKeys("Sanjay@123#@!"); 
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println("Customer Login succesfully");
		driver.findElement(By.className("logo")).click();
		
		driver.findElement(By.xpath("//img[@alt='Sunglasses']")).click();

		
		
		driver.findElement(By.className("rango-plus")).click();	
		Thread.sleep(2000); 
		
		driver.findElement(By.className("add-to-cart-btn")).click();
		
		System.out.println("Add to cart successfully");
		
		// Close flash message alert
		driver.findElement(By.cssSelector("a.close")).click();	
		driver.findElement(By.id("mini-cart")).click();
		
		Thread.sleep(1000);  // click on view shoping cart link
		driver.findElement(By.linkText("View Shopping Cart")).click();
		
		//Thread.sleep(3000);  // click on checkout page 
		 driver.findElement(By.xpath("//a[contains(@class,'text-uppercase')]")).click();
		
		//Thread.sleep(3000);  // click on saved address
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		System.out.println("Address saved successfully");
		driver.findElement(By.cssSelector("form li")).click();
		
		Thread.sleep(2000);  // shipping method selected			
		driver.findElement(By.xpath("//input[@id='free_free']")).click();

		System.out.println("Shipping method selected successfully");	
		
		
		Thread.sleep(1000); // payment methos selected			
		driver.findElement(By.id("cashondelivery")).click();		
		System.out.println("Payment method selected successfully");
		
		Thread.sleep(2000); // place order button clicked
		driver.findElement(By.id("checkout-place-order-button")).click();
		System.out.println("Order Created successfully");
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.cssSelector("a[href*='http://192.168.15.237/sanjay-bagisto/public/customer/account/orders/view']")).getText());
		
		String OrderId = driver.findElement(By.cssSelector("a[href*='http://192.168.15.237/sanjay-bagisto/public/customer/account/orders/view']")).getText();
		
		// OPen Admin Panel In New Tab		
		driver.switchTo().newWindow(WindowType.TAB);		
		driver.navigate().to("http://192.168.15.237/sanjay-bagisto/public/admin/login");
		
		System.out.println("Admin Panel Opened In New Tab SuccessFully");
		
		driver.findElement(By.id("email")).sendKeys("admin@example.com");  
		driver.findElement(By.id("password")).sendKeys("admin123"); 	
		driver.findElement(By.className("btn-primary")).click(); 
		System.out.println("Admin Login Successfully");
		
		// CREATE SHIPPING
		driver.findElement(By.xpath("//div[@class='navbar-left']/ul/li[2]")).click();
		System.out.println("Orders Page Opened");
		Thread.sleep(1000);
		System.out.println("http://192.168.15.237/sanjay-bagisto/public/admin/sales/orders/view/"+OrderId);			
		driver.findElement(By.xpath("//a[@id="+OrderId+"]")).click();
		driver.findElement(By.xpath("//div[@class='page-action']/a[3]")).click();
		System.out.println("Shiiping Button Clicked");
		driver.findElement(By.tagName("select")).click();
		driver.findElement(By.xpath("//select[@class='control']/option[2]")).click();
		driver.findElement(By.cssSelector("form button")).click();		
		System.out.println("Shipping Created Successfully");
		
		//driver.quit(); 

	}

}
