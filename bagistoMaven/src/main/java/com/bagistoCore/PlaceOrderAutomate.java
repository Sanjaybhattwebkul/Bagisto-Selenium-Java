package com.bagistoCore;

import org.openqa.selenium.By;
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
		WebDriver driver = new ChromeDriver(); // create object of interface
		
		driver.get("http://192.168.15.237/sanjay-bagisot/public/");		
		
		driver.manage().window().maximize(); //Mazimize current window

		Thread.sleep(2000);    //Delay execution for 5 seconds to view the maximize operation				
		
		driver.findElement(By.className("welcome-content")).click();
		Thread.sleep(1000); 
		driver.findElement(By.id("login")).click(); 
		Thread.sleep(1000); 
		driver.findElement(By.name("email")).sendKeys("sanjay.bhatt371@webkul.com");  
		driver.findElement(By.name("password")).sendKeys("Sanjay@123#@!"); 
		Thread.sleep(1000); 		
		driver.findElement(By.id("userLogin")).click();
		
		System.out.println("sign success");	
		
		Thread.sleep(1000); 
		driver.findElement(By.className("logo")).click();		
		Thread.sleep(9000); 
		driver.findElement(By.id("Red Wayfarer Sunglasses")).click(); 		
		Thread.sleep(2000);		
		driver.findElement(By.className("rango-plus")).click();	
		Thread.sleep(2000); 
		driver.findElement(By.className("add-to-cart-btn")).click();
		
		System.out.println("Add to cart successfully");
		
		Thread.sleep(8000);
		driver.findElement(By.id("mini-cart")).click();
		
		Thread.sleep(3000);  // click on view shoping cart link
		driver.findElement(By.linkText("View Shopping Cart")).click();
		
		//driver.findElement(By.xpath("//a[contains(@class,'link-color')]")).click();		
		
		
		Thread.sleep(3000);  // click on checkout page 
		 driver.findElement(By.xpath("//a[contains(@class,'text-uppercase')]")).click();
		
		Thread.sleep(3000);  // click on saved address
		driver.findElement(By.cssSelector("input[type='radio']")).click();

		System.out.println("Address saved successfully");
		
		Thread.sleep(10000);  // shipping address selected		
		driver.findElement(By.name("shipping_method")).click();
		
		System.out.println("Shipping method selected successfully");
		
		Thread.sleep(9000); // payment methos selected			
		driver.findElement(By.id("cashondelivery")).click();		
		System.out.println("Payment method selected successfully");
		
		Thread.sleep(9000); // place order button clicked
		driver.findElement(By.id("checkout-place-order-button")).click();
		System.out.println("Order Created successfully");
		
		// OPen Admin Panel In New Tab		
		driver.switchTo().newWindow(WindowType.TAB);		
		driver.navigate().to("http://192.168.15.237/sanjay-bagisot/public/backend/login");
		
		System.out.println("Admin Panel Opened In New Tab SuccessFully");
		
		driver.findElement(By.id("email")).sendKeys("admin@example.com");  
		driver.findElement(By.id("password")).sendKeys("admin123"); 
		System.out.println("Text Field Cleared");	
		driver.findElement(By.className("btn-primary")).click(); 
		
		System.out.println("Admin Login successfully");		
		
		//driver.quit(); 

	}

}
