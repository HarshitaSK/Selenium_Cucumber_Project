package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	private WebDriver driver;
	private By registrationLocator=By.linkText("Create an Account");
	private By firstnameLocator=By.xpath("//input[@id='firstname']");
	private By lastnameLocator=By.xpath("//input[@id='lastname']");
	private By emailLocator=By.xpath("//input[@id='email_address']");
	private By passwordLocator=By.xpath("//input[@id='password']");
	private By passwordconfirmLocator=By.xpath("//input[@id='password-confirmation']");
	private By submitbuttonLocator=By.xpath("//button[@class='action submit primary']");
	private By emailiderrorLocator=By.xpath("//div[@id='email_address-error']");
	private By passwordconfirmerrorLocator=By.xpath("//div[@id='password-confirmation-error']");
	private By blankemailiderrorLocator=By.xpath("//div[@id='email_address-error']");
	private By firstnameerrorLocator=By.xpath("//div[@id='firstname-error']");
	private By lastnameerrorLocator=By.xpath("//div[@id='lastname-error']");
	private By passworderrorLocator=By.xpath("//div[@id='password-error']");
	private By passwordstrengthLocator=By.xpath("//div[@id='password-strength-meter']");
	
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click_to_createAccount() {
		WebElement createaccount=driver.findElement(registrationLocator);
		createaccount.click();
	}
	
	public void enterFirstname(String firstname) {
		WebElement firstname1=driver.findElement(firstnameLocator);
		firstname1.sendKeys("firstname");
	}
	
	public void enterLasttname(String lastname) {
		WebElement lastname1=driver.findElement(lastnameLocator);
		lastname1.sendKeys("lastname");
	}
	public void enteremail(String email) {
		WebElement email1=driver.findElement(emailLocator);
		email1.sendKeys("email");
	}
	public void enterpassword(String password) {
		WebElement password1=driver.findElement(passwordLocator);
		password1.sendKeys("password");
	}
	public void enterconfirmpassword(String password) {
		WebElement password1=driver.findElement(passwordconfirmLocator);
		password1.sendKeys("password");
	}
	public void click_on_submit() {
		WebElement submitbtn=driver.findElement(submitbuttonLocator);
		submitbtn.click();
	}
	
	public String invalidEmailError() {
		WebElement error1=driver.findElement(emailiderrorLocator);
		return error1.getText();
	}
	
	public String blankEmailError() {
		WebElement error3=driver.findElement(blankemailiderrorLocator);
		return error3.getText();
	}
	
	public String passwordConfirmationError() {
		WebElement error2=driver.findElement(passwordconfirmerrorLocator);
		return error2.getText();
	}
	
	public String blankfirstnameError() {
		WebElement error4=driver.findElement(firstnameerrorLocator);
		return error4.getText();
	}
	
	public String blanklastnameError() {
		WebElement error5=driver.findElement(lastnameerrorLocator);
		return error5.getText();
	} 
	
	public String passwordlessthan8Error() {
		WebElement error6=driver.findElement(passworderrorLocator);
		return error6.getText();
	}
	public String passwordmorethan8Error() {
		WebElement error7=driver.findElement(passworderrorLocator);
		return error7.getText();
	}
	public String passwordStrengthDisplay() {
		 WebElement passwordstrength=driver.findElement(passwordstrengthLocator);
		 return passwordstrength.getText();
	}
	
	public String blankpasswordconfirmError() {
		WebElement error8=driver.findElement(passwordconfirmerrorLocator);
		return error8.getText();
	}
	
	public void registration(String firstname, String lastname, String email, String password,String confirmpassword) {
		enterFirstname(firstname);
		enterLasttname(lastname);
		enteremail(email);
		enterpassword(password);
		enterconfirmpassword(confirmpassword);
		click_on_submit();
	}
	
}
