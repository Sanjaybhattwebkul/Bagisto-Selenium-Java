import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Allfunctions {

	public static void SelectAppointmentDate(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.className("flatpickr-input")).click();
		driver.findElement(By.xpath("//div[@class='dayContainer']/span[17]")).click();
		System.out.println("Appointment Date Selected");
		
	}
	public void bookProduct(WebDriver driver,String URL)
	{
		driver.findElement(By.xpath("//div[@class='add-to-cart-btn pl0']")).click();
		System.out.println("Book Now Button Clicked");
	}
	
	public static void customerSignup(WebDriver driver,String firstName, String lastName, String email, String password,String URL)
	{
		nagivate(driver,URL+"customer/register");		
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
	
	public static void nagivate(WebDriver driver,String URL)
	{
		driver.navigate().to(URL);
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
