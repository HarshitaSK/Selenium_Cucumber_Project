
package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.LoginPage1;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	private WebDriver driver;
	private LoginPage1 loginpage;

	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	@After
	public void teardown() {
			driver.quit();
	}
	
	@Given("user launch the application")
	public void user_launch_the_application() {
		driver.get("https://magento.softwaretestingboard.com/");
		loginpage=new LoginPage1(driver);
    	}

	@When("user clicks on SignIn")
	public void user_clicks_on_sign_in() {
	    loginpage.clickSignIn();
	}
	@When("user enters valid emailid")
	public void user_enters_valid_emailid() {
		loginpage.enterUsername("harshitask@gmail.com");
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
		loginpage.enterPassword("Bangalore@123");
	}
	
	@Then("user should be logged in successfully")
	    public void user_should_be_logged_in_successfully() {
	       Assert.assertEquals(loginpage.greetMsg(),true);
	  }
	 
	@When("user enters emailid {string}")
	public void user_enters_emailid(String username) {
		loginpage.enterUsername(username);
	}

	@When("user enters password {string}")
	public void user_enters_password (String password) {
	    loginpage.enterPassword(password);
	}
	
	@When("user enters emailid1 {string}")
	public void user_enters_emailid1 (String username1) {
		loginpage.enterUsername(username1);
	}

	@When("user enters password1 {string}")
	public void user_enters_password1(String password1) {
	    loginpage.enterPassword(password1);
	}
	@When ("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		loginpage.submitBtn();
	}
	
	@Then("error message1 is displayed {string}")
	public void an_error_message_is_displayed(String expectedError ) {
		String actualError=loginpage.errorMsg_without_email();
		Assert.assertEquals(actualError, expectedError);
			    
	}
	
	@Then("error message2 is displayed {string}")
	public void error_message2_is_displayed(String expectedError1) {
		WebElement error2=driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[2]/div/div/div"));
		String actualError=error2.getText();
	//	String actualError=loginpage.errorMsg_with_wrong_username_password();
		Assert.assertEquals(actualError, expectedError1);
	
	}
	
	@When("user clicks on forgot password button")
	public void user_clicks_on_forgot_password_button() {
		loginpage.forgotPasswordClick();
	    
	}

	@Then("should direct to Forgot your password page")
	public void should_direct_to_forgot_your_password_page() {
        Assert.assertTrue(loginpage.getForgotPwdPageTitle().contains("Forgot Your Password?"));

	}


   
}
