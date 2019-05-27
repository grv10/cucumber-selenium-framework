package stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.LoginPage;
import Util.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class SmokeTest extends TestBase{
	protected WebDriver driver;
	LoginPage loginpage = new LoginPage();
	

	@Given("^Open firefox and start the application$")
	public void open_firefox_and_start_the_application() throws Throwable{
		/*driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");*/
		TestBase.initialize();
	}

	@When("^I enter valid \"(.*)\" and invalid \"(.*)\"$")
	public void i_enter_valid_username_and_invalid_password(String username, String password) throws Throwable {
		/*//LoginPage.enterCredentials(username, password);	
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.className("CwaK9")).click();;
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("passwordNext")).click();	*/
		String title = loginpage.validateLoginPage();
		assertEquals("Gmail", title);
		LoginPage.enterCredentials(username, password);
		
		
		
	}

	@When("^I enter valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password(DataTable credentials) throws Throwable {
		List<String> data = credentials.asList(String.class);
		driver.findElement(By.id("identifierId")).sendKeys(data.get(0));
		driver.findElement(By.className("CwaK9")).click();;
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(data.get(1));
		Thread.sleep(3000);
		driver.findElement(By.id("passwordNext")).click();	
	}

	@When("^User enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password(DataTable credentials) throws Throwable{

		List<Map<String, String>> rows = credentials.asMaps(String.class,  String.class);
		for (Map<String, String> data : rows) {
			driver.findElement(By.id("identifierId")).sendKeys(data.get("username"));
			driver.findElement(By.className("CwaK9")).click();;
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(data.get("password"));
			Thread.sleep(3000);
			driver.findElement(By.id("passwordNext")).click();	
		}
	}

	@Then("^User should get an error message$")
	public void user_should_get_an_error_message() {
		String errorText=driver.findElement(By.className("GQ8Pzc")).getText();
		assertEquals("Validation Message verified", "Wrong password. Try again or click Forgot password to reset it.", errorText);
	}

	@After
	public void close_the_browser() {
		driver.quit();
	}
}
