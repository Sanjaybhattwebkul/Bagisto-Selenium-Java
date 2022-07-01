package com.bagistoCore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateShipping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/users/sanjay.bhatt/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://192.168.15.237/sanjay-bagisot/public/backend/login");
		driver.findElement(By.id("email")).sendKeys("admin@example.com"); 
		driver.findElement(By.id("password")).sendKeys("admin123");		
		driver.findElement(By.className("btn-primary")).click(); 
		System.out.println("Login successfully");				
		driver.findElement(By.xpath("//div[@class='navbar-left']/ul/li[2]")).click();
		System.out.println("Orders Page Opened");
		driver.findElement(By.xpath("//div[@class='action']/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='page-action']/a[3]")).click();
		System.out.println("Shiiping Button Clicked");
		driver.findElement(By.tagName("select")).click();
		driver.findElement(By.xpath("//select[@class='control']/option[2]")).click();
		driver.findElement(By.cssSelector("form button")).click();		
		System.out.println("Shipping Created Successfully");
		
		
		
	}

}
