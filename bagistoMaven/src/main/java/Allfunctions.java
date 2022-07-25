import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Allfunctions {

	
	public static void selectPaymentMethod(WebDriver driver)
	{
		driver.findElement(By.id("cashondelivery")).click();
		System.out.println("Payment method selected successfully");
	}
	
	public static void staticDropdown(WebDriver driver, String selectId)
	{
		WebElement staticDropdown = driver.findElement(By.id(selectId));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}
	
	public static void saveCustomerAdress(WebDriver driver)
	{
		driver.navigate().to("http://192.168.15.237/sanjay-bagisto/public/checkout/onepage");
		driver.findElement(By.id("billing[company_name]")).sendKeys("HCL Technologies");
		driver.findElement(By.id("billing_address_0")).sendKeys("AVR PARK");
		driver.findElement(By.id("billing[city]")).sendKeys("NOIDA");
		driver.findElement(By.id("billing[country]")).click();
		driver.findElement(By.xpath("//option[@value='IN']")).click();
		driver.findElement(By.id("billing[state]")).click();
		driver.findElement(By.xpath("//option[@value='UT']")).click();
		driver.findElement(By.id("billing[postcode]")).sendKeys("262523");
		driver.findElement(By.id("billing[phone]")).sendKeys("9784562390");
		driver.findElement(By.id("billing[save_as_address]")).click();
	}
	
	public static void SelectAppointmentDate(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.className("flatpickr-input")).click();
		driver.findElement(By.xpath("//div[@class='dayContainer']/span[18]")).click();
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
	
	public static void placeOrder(WebDriver driver) throws InterruptedException
	{
		 // shipping address selected			
		//driver.findElement(By.xpath("//input[@id='free_free']")).click();
		//System.out.println("Shipping method selected successfully");	
		Thread.sleep(1000); // payment methos selected			
		driver.findElement(By.id("cashondelivery")).click();		
		System.out.println("Payment method selected successfully");
		
		Thread.sleep(2000); // place order button clicked
		driver.findElement(By.id("checkout-place-order-button")).click();
		System.out.println("Order Created successfully");
		Thread.sleep(3000);
	}

}
