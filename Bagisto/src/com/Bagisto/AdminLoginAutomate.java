package com.Bagisto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/users/sanjay.bhatt/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver(); // create object of interface
		driver.get("http://192.168.15.237/sanjay-bagisot/public/admin/login/"); // open bagisto shop
		driver.findElement(By.id("email")).sendKeys("admin@example.com");  // inser username
		driver.findElement(By.id("password")).sendKeys("admin123"); // insert password
		System.out.println("Text Field Cleared");	
		driver.findElement(By.className("btn-primary")).click();
		System.out.println("Login successfully");	
		//this will click the element
		
		/*driver.findElement(By.name("login")).click(); // Clicking on Login button*/
		

	}

}
