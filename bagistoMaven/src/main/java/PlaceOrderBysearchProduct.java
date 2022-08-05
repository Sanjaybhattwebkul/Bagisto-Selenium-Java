import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceOrderBysearchProduct extends Allfunctions{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/users/sanjay.bhatt/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		// DEFINE ALL VARIABLES 
		String firstName = "Super";
		String lastName = "Admin";
		String email  = "bagisto@webkul.com";
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
		//customerSignup(driver,firstName,lastName,email,password,URL);		
		
		// CUSTOMER LOGIN		
		Thread.sleep(1000);
		customerLogin(driver,email,password);		
		
		//Add Product To Wishlist after search product
		searchProduct(driver,"cycle",URL);
		addToWishlist(driver,"//a[@title='Add product to wishlist']");
		
		// View Wishlist Products	
		Thread.sleep(1000);
		nagivate(driver,URL+"customer/account/wishlist");
		
		// BOOK THE PRODUCT
		driver.findElement(By.cssSelector("form button:nth-child(1)")).click();
		
		Thread.sleep(1000);	
		
		// Select Appointment Date
		SelectAppointmentDate(driver);
		Thread.sleep(1000);
		driver.findElement(By.className("vue-go-top__content")).click();
		Thread.sleep(1000);		
		
		addQuantity(driver, "rango-plus");
		
		PlaceOrderBysearchProduct obj = new PlaceOrderBysearchProduct();
		obj.bookProduct(driver,URL);
		
		nagivate(driver,URL+"checkout/cart");
		saveCustomerAdress(driver);
		Thread.sleep(2000); 
		placeOrder(driver); // Place Order function called
		
		
	}
}
