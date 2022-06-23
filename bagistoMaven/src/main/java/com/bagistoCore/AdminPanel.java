package com.bagistoCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/users/sanjay.bhatt/geckodriver-v0.31.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver(); // create object of interface
		driver.get("http://192.168.15.237/sanjay-bagisot/public/admin/login/"); // open bagisto Admin panel
		driver.findElement(By.id("email")).sendKeys("admin@example.com");  // inser username
		driver.findElement(By.id("password")).sendKeys("admin123"); // insert password
		System.out.println("Text Field Cleared");	
		driver.findElement(By.className("btn-primary")).click();  //this will click the element
		System.out.println("Login successfully");
		driver.quit(); // close all tabs opened by selenium
		

	}

}
