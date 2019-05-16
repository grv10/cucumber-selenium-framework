package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;
	
	@Given("Open firefox and start the application")
	public void open_firefox_and_start_the_application() {
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.gmail.com");
	}

	@When("I enter valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password() throws Throwable {
		driver.findElement(By.id("identifierId")).sendKeys("gauravdwivedi10");
		driver.findElement(By.className("CwaK9")).click();;
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("check123");
		/*WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("passwordNext")));*/
		Thread.sleep(3000);
		driver.findElement(By.id("passwordNext")).click();;		
	}

	@Then("User should get an error message")
	public void user_should_get_an_error_message() {
		String errorText=driver.findElement(By.className("GQ8Pzc")).getText();
		assertEquals("Validation Message verified", "Wrong password. Try again or click Forgot password to reset it.", errorText);
	    driver.quit();
	}
}
