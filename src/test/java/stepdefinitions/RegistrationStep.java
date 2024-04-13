package stepdefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.RegistrationPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStep {
	private WebDriver driver;
	private RegistrationPage regPage;
	
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
	
	@Given ("user launches the application")
	public void user_launches_the_application() {
		driver.get("https://magento.softwaretestingboard.com/");
		regPage=new RegistrationPage(driver);
	}
	
	@Given("user is in registration page")
	public void user_is_in_registration_page() {
	    regPage.click_to_createAccount();
	}

	@When("user fills the registration form with valid firstname and lastname")
	public void user_fills_the_registration_form_with_valid_username_and_password() {
	    regPage.enterFirstname("Richard");
	    regPage.enterLasttname("Smith");
	}

	@When("user fills invalid emailid")
	public void user_fills_invalid_emailid() {
	    regPage.enteremail("ABBCmn@gmail.com");
	}

	@When("user fills password and confirms with same password")
	public void user_fills_password_and_confirms_with_same_password() {
	    regPage.enterpassword("Bangalore@123");
	    regPage.enterconfirmpassword("Bangalore@123");
	}

	@When("user submits the registration form")
	public void user_submits_the_registration_form() {
	    regPage.click_on_submit();
	}

	@Then("should get an error_message1")
	public void should_get_an_error_message1() {
	    String experror="Please enter a valid email address (Ex: johndoe@domain.com).";
	    String actualerror=regPage.invalidEmailError();
	    Assert.assertEquals(actualerror, experror);
	  }

	@When("user enters a password")
	public void user_enters_a_password() {
	    regPage.enterpassword("Bangalore@123");
	}

	@When("user enters different password in confirm password field")
	public void user_enters_different_password_in_confirm_password_field() {
		   regPage.enterconfirmpassword("Mumbai123");
	}

	@Then("user should see an error_message2")
	public void user_should_see_an_error_message2() {
		String experror="Please enter the same value again.";
	    String actualerror=regPage.passwordConfirmationError();
	    Assert.assertEquals(actualerror, experror);
	  
	}

	@Then("user should get error_message3")
	public void user_should_get_error_message3() {
		String experror="This is a required field.";
	    String actualerror=regPage.blankEmailError();
	    Assert.assertEquals(actualerror, experror);	
	    }

	@When("user fills the lastname field")
	public void user_fills_the_lastname_field() {
	    regPage.enterLasttname("Smith");
	}

	@When("user fills emailid")
	public void user_fills_emailid() {
	    regPage.enteremail("bettysketchers@gmail.com");
	}

	@Then("user should get error_message4")
	public void user_should_get_error_message4() {
		String experror="This is a required field.";
	    String actualerror=regPage.blankfirstnameError();
	    Assert.assertEquals(actualerror, experror);	
	}

	@When("user fills the firstname field")
	public void user_fills_the_firstname_field() {
	    regPage.enterFirstname("Richard");
	}

	@Then("user should get error_message5")
	public void user_should_get_error_message5() {
		String experror="This is a required field.";
	    String actualerror=regPage.blanklastnameError();
	    Assert.assertEquals(actualerror, experror);	
	}

	@When("user fills password field with less than eight characters")
	public void user_fills_password_field_with_less_than_characters() {
		regPage.enterpassword("1s3qqqq");
	}

	@Then("user should get error_message6")
	public void user_should_get_error_message6() {
		String experror="Minimum of different classes of characters in password is 3. Classes of characters: Lower Case, Upper Case, Digits, Special Characters.";
	    String actualerror=regPage.passwordlessthan8Error();
	    Assert.assertEquals(actualerror, experror);
	}
	
	@When("user fills password field with more than eight alphabets")
	public void user_fills_password_field_with_more_than_alphabets() {
	    regPage.enterpassword("qwertygfff");
	}

	@Then("user should get error_message7")
	public void user_should_get_error_message7() {
		String experror="Minimum of different classes of characters in password is 3. Classes of characters: Lower Case, Upper Case, Digits, Special Characters.";
	    String actualerror=regPage.passwordmorethan8Error();
	    Assert.assertEquals(actualerror, experror);
	}

	@Then("should display password length as weak")
	public void should_display_password_length_as_weak() {
		String expResult="Password Strength: Weak";
	    String actualResult=regPage.passwordStrengthDisplay();
	    Assert.assertEquals(actualResult, expResult);
	}

	@Then("user should see an error_message8")
	public void user_should_see_an_error_message8() {
		String experror="This is a required field.";
	    String actualerror=regPage.blankpasswordconfirmError();
	    Assert.assertEquals(actualerror, experror);	
	}
	
	@When("user enters {string} with more than eight and with alphanumeric and special characters")
	public void user_enters_with_more_than_eight_and_with_alphanumeric_and_special_characters(String password) throws InterruptedException {
		regPage.enterpassword(password);
		Thread.sleep(1000);
	}

	@Then("Should display password strength as {string}")
	public void should_display_password_strength_as(String password_strength) {
		String expStrength=password_strength;
		String actualStrength=regPage.passwordStrengthDisplay();
		Assert.assertEquals(actualStrength, expStrength);
	}
	
}