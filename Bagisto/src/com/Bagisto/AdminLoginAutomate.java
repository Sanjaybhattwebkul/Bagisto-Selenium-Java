package com.Bagisto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/users/sanjay.bhatt/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver(); // create object of interface
		driver.get("http://192.168.15.237/sanjay-bagisot/public/admin/login/"); // open bagisto Admin panel
		driver.findElement(By.id("email")).sendKeys("admin@example.com");  // inser username
		driver.findElement(By.id("password")).sendKeys("admin123"); // insert password
		System.out.println("Text Field Cleared");	
		driver.findElement(By.className("btn-primary")).click();  //this will click the element
		System.out.println("Login successfully");	
		
		driver.get("http://192.168.15.237/sanjay-bagisot/public/"); // open bagisto Shop
		driver.findElement(By.className("welcome-content")).click();
		driver.findElement(By.id("login")).click(); 
		driver.findElement(By.name("email")).sendKeys("sanjay.bhatt371@webkul.com");  
		driver.findElement(By.name("password")).sendKeys("Sanjay@123#@!"); 
		System.out.println("sign success");
		driver.findElement(By.id("userLogin")).click(); 
		
		
		
		
		
		
		
		/*driver.findElement(By.name("login")).click(); // Clicking on Login button*/
		

	}

}
