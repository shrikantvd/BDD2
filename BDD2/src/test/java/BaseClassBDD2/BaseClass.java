package BaseClassBDD2;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
			
   public static WebDriver driver;

	public static void initalization() {
   System.setProperty("WebDriver.chrome.driver","C:\\Users\\shrikant.2.deshmukh\\Downloads\\chromedriver_win32\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
   
     
	}
}