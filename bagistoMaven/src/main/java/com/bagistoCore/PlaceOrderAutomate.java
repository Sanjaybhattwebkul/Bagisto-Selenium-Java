package com.bagistoCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

		Thread.sleep(1000);    //Delay execution for 5 seconds to view the maximize operation		
	
		driver.findElement(By.className("welcome-content")).click();
		Thread.sleep(1000); 
		driver.findElement(By.id("login")).click(); 
		Thread.sleep(1000); 
		driver.findElement(By.name("email")).sendKeys("sanjay.bhatt371@webkul.com");  
		driver.findElement(By.name("password")).sendKeys("Sanjay@123#@!"); 
		Thread.sleep(1000); 
		System.out.println("sign success");			
		driver.findElement(By.id("userLogin")).click();
		Thread.sleep(1000); 
		driver.findElement(By.className("logo")).click();		
		Thread.sleep(3000); 
		driver.findElement(By.id("Red Wayfarer Sunglasses")).click(); 		
		Thread.sleep(2000);		
		driver.findElement(By.className("rango-plus")).click();	
		Thread.sleep(2000); 
		driver.findElement(By.className("add-to-cart-btn")).click();
		

	}

}
