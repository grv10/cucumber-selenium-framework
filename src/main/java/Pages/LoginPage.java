package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Util.TestBase;
import stepDefinition.SmokeTest;


public class LoginPage extends SmokeTest{
	@FindBy(id="identifierId")
	static public WebElement usernameTextBox;
	@FindBy(name="password")
	static WebElement passwordTextBox;
	@FindBy(className="CwaK9")
	static WebElement usernameNextBtn;
	@FindBy(id="passwordNext")
	static WebElement passwordNextBtn;
	@FindBy(className="GQ8Pzc")
	static WebElement validationMessage;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static void enterCredentials(String username, String password) throws Throwable {
		usernameTextBox.sendKeys(username);
		usernameNextBtn.click();;
		Thread.sleep(2000);
		passwordTextBox.sendKeys(password);
		Thread.sleep(3000);
		passwordNextBtn.click();
	}


}
