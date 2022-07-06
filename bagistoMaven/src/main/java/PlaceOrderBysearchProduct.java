import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceOrderBysearchProduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/users/sanjay.bhatt/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		String firstName = "Bagisto";
		String lastName = "Admin";
		String email  = "admin@bagisto.com";
		String password = "admin123";
		String URL = "http://192.168.15.237/sanjay-bagisto/public/";
		
		// GetURL
		getUrl(driver,URL);
	
		// SEARCH PRODUCT
		searchProduct(driver,"cycle",URL);
		
		// ADD TO COMPARE LIST
		driver.findElement(By.xpath("//a[@title='Add product to compare list']")).click();	
		System.out.println("Product Added To compare successfully");
		driver.findElement(By.xpath("//a[text()='×']")).click();
		driver.findElement(By.cssSelector("a[href*='"+URL+"comparison']")).click();
		addToWishlist(driver,"//a[@title='Add product to wishlist']");				
		
		// CUSTOMER SIGNUP	
		customerSignup(driver,firstName,lastName,email,password,URL);		
		
		// CUSTOMER LOGIN		
		Thread.sleep(1000);
		customerLogin(driver,email,password);		
		
		//Add Product To Wishlist after search product
		searchProduct(driver,"cycle",URL);
		addToWishlist(driver,"//a[@title='Add product to wishlist']");
	}
	
	public static void customerSignup(WebDriver driver,String firstName, String lastName, String email, String password,String URL)
	{
		driver.get(URL+"customer/register");
		driver.findElement(By.name("first_name")).sendKeys(firstName);
		driver.findElement(By.name("last_name")).sendKeys(lastName);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("password_confirmation")).sendKeys(password);		
		driver.findElement(By.xpath("//form/button")).click();		
		System.out.println("Customer REgistration Successfull");
	}
	
	public static void customerLogin(WebDriver driver,String email,String password)
	{
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("shoPassword")).click();
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();		
		System.out.println("Customer Login Successfull");
		
	}
	public static void searchProduct(WebDriver driver, String searchText,String URL)
	{
		driver.get(URL);			
		driver.findElement(By.cssSelector("input[placeholder='Search products here']")).sendKeys(searchText);
		driver.findElement(By.className("rango-search")).click();
		driver.findElement(By.xpath("//img[@alt='Cycle on rent']")).click();
	}
	
	public static void addToWishlist(WebDriver driver , String locator)
	{
		driver.findElement(By.xpath(locator)).click();
		System.out.println("Product Added To Whislist Successfully");
	}
	
	public static void getUrl(WebDriver driver,String URL)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
		driver.get(URL);	
	}

}
