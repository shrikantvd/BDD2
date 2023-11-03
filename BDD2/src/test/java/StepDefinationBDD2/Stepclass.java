package StepDefinationBDD2;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.FindBy;
import BaseClassBDD2.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Stepclass extends BaseClass {
	@Given("I am on login page")
	public void i_am_on_login_page() {
		BaseClass.initalization();
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	System.out.println("I am at login page");
	
	}

	@When("I entered valid user name")
	public void i_entered_valid_user_name() {
		driver.findElement(By.name ("session_key")).sendKeys("testemail@hotmail.com");
		driver.findElement(By.name("session_password")).sendKeys("234567890");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click(); 
		driver.findElement(By.xpath("//*[text()='Join now']")).click();
		
	}

	@Then("I am on home page")
	public void i_am_on_home_page() {
	   System.out.println(driver.getTitle());
	   
	   driver.quit();
	}
	
}