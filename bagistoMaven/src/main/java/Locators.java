import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "/home/users/sanjay.bhatt/chromedriver_linux64/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				
				driver.manage().window().maximize(); //Mazimize current window
				Thread.sleep(2000);    //Delay execution for 5 seconds to view the maximize operation	
				
				driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
				driver.findElement(By.name("inputPassword")).sendKeys("Rahul@123");
				driver.findElement(By.className("signInBtn")).click();
				System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
				driver.findElement(By.linkText("Forgot your password?")).click(); // Click on text of <a> tag
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
				driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sanju@gmail.com");
				driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
				
				// Find element by index value, if we have multiple input with same attribute then we use indexing
				driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("john@text.com");
				driver.findElement(By.xpath("//input[@type='text'][2]")).clear();		
				// Index selector using CSS
				driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("John@gmail.com");
				
				// X-Path using parent-Child tags
				
				driver.findElement(By.xpath("//form/input[3]")).sendKeys("7894561230");
				
				// When we have multiple class with the same name, use   tagName.className
				//driver.findElement(By.className("input.reset-pwd-btn")).click();
				driver.findElement(By.className("reset-pwd-btn")).click();
			   
				// Parent child locators with css /
				System.out.println(driver.findElement(By.cssSelector("form p")).getText());
				
				// if we have 2 button with same attr use it . 
				driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
				
				// Login again 		
				driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
				
				//<input type="password">
				driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
				driver.findElement(By.id("chkboxOne")).click();
				
				// <input class='submit btn btn-success'>
				driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
				


	}

}
