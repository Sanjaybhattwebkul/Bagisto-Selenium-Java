import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticDropdown extends Allfunctions{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/users/sanjay.bhatt/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver(); 		
		String URL = "http://localhost/sanjay-bagisto/public/main-product";
		getUrl(driver,URL);
		staticDropdown(driver, "attribute_23");

	}

}
