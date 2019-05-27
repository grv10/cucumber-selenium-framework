package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Util.TestBase;


public class LoginPage extends TestBase{
	@FindBy(how=How.ID, using="identifierId")
	static WebElement usernameTextBox;
	@FindBy(how=How.NAME, using="password")
	static WebElement passwordTextBox;
	@FindBy(how=How.CLASS_NAME, using="CwaK9")
	static WebElement usernameNextBtn;
	@FindBy(how=How.ID, using="passwordNext")
	static WebElement passwordNextBtn;
	@FindBy(how=How.CLASS_NAME, using="GQ8Pzc")
	static WebElement validationMessage;

	//Initialize Page Objects
	public LoginPage() {
		//TestBase.driver=ldriver;
		PageFactory.initElements(driver, TestBase.class);
	}

	public String validateLoginPage() {
		return driver.getTitle();
	}
	
	public static LandingPage enterCredentials(String username, String password) throws Throwable {
		System.out.println("DRIVER::: "+driver);
		usernameTextBox.sendKeys(username);
		usernameNextBtn.click();;
		Thread.sleep(2000);
		passwordTextBox.sendKeys(password);
		Thread.sleep(3000);
		passwordNextBtn.click();
		
		return new LandingPage();
	}


}
