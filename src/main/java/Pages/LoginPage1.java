package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
	
	private WebDriver driver;
	
	//By Locators
	
	private By usernameLocator=By.name("login[username]");
	private By passwordLocator=By.name("login[password]");
	private By SignInLocator= By.className("authorization-link");
	private By submitBtnLocator=By.xpath("//button[@class='action login primary']");
	private By welcomeLocator=By.xpath("(//li[@class='greet welcome'])[1]");
		
	private By errorMessage1Locator=By.xpath("//div[@id='email-error']");// without @
	private By forgotPasswordLocator=By.xpath("//a[@class='action remind']");
		

	public LoginPage1(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUsername(String emailid) {
		WebElement emailInput=driver.findElement(usernameLocator);
		emailInput.sendKeys("emailid");	
		
	}
	
	public void enterPassword(String password) {
		WebElement passwordInput=driver.findElement(passwordLocator);
		passwordInput.sendKeys("password");
			
	}
	
	public void clickSignIn() {
		WebElement SignInInput=driver.findElement(SignInLocator);
		SignInInput.click();
	}
	
	public void submitBtn() {
		
		WebElement submitBtnInput=driver.findElement(submitBtnLocator);
		submitBtnInput.click();
		
	}
	public boolean greetMsg() {
		WebElement welcomeMsg=driver.findElement(welcomeLocator);
		return welcomeMsg.isDisplayed();
		}
	public String errorMsg_without_email(){
		WebElement errorMsg1=driver.findElement(errorMessage1Locator);
		return errorMsg1.getText();
		
	}

	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		submitBtn();
	}
	
	public void forgotPasswordClick() {
		WebElement forgotpwd=driver.findElement(forgotPasswordLocator);
		forgotpwd.click();
	}
	
	public boolean checkForgotPwdLink(){
        return driver.findElement(forgotPasswordLocator).isDisplayed();
    }
	
	public String getForgotPwdPageTitle(){
        String forgotPwdPageTitle = driver.getTitle();
        return forgotPwdPageTitle;
    }
}
