package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.LoginPage1;
import Pages.WhatsNewPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhatsNewStep {
	private WebDriver driver;
	private WhatsNewPage whatsnew;
	private LoginPage1 loginpage;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
@Given("user is already logged in")
	public void user_is_already_logged_in() {
    driver.get("https://magento.softwaretestingboard.com");
    loginpage=new LoginPage1(driver);
    loginpage.clickSignIn();
    loginpage.enterUsername("harshitask@gmail.com");
    loginpage.enterPassword("Bangalore@123");
    loginpage.submitBtn();
    whatsnew=new WhatsNewPage(driver);
	}

@When("user clicks on What's New")
	public void user_clicks_on_what_s_new() {
	whatsnew.click_whatsNew();        
	}

@Then("user should navigate to What's new page")
	public void user_should_navigate_to_what_s_new_page() {
	String expResult="What's New";
    String actualResult=whatsnew.whatsNew_pagetitle();
    Assert.assertEquals(actualResult, expResult);
  }

@Given("user is in What's new page")
	public void user_is_in_what_s_new_page() {
	whatsnew.click_whatsNew();
}

@When("user clicks on Hoodies and Sweatshirts")
	public void user_clicks_on_hoodies_and_sweatshirts() {
    whatsnew.click_hoodiessweatshirt();
}

@Then("should navigate to Hoodies and Tshirts page")
	public void should_navigate_to_hoodies_and_tshirts_page() {
    String expResult="Hoodies & Sweatshirts - Tops - Women";
    String actualResult=whatsnew.hoodiessweatshirt_pagetitle();
    Assert.assertEquals(actualResult, expResult);
}

@When("user clicks on Jacket")
	public void user_clicks_on_jacket() {
    whatsnew.click_jackets();
	}

@Then("user should navigate to Jackets page")
	public void user_should_navigate_to_jackets_page() {
	String expResult="Jackets - Tops – Women";
	String actualResult=whatsnew.jackets_pagetitle();
	Assert.assertEquals(actualResult, expResult);
	
	}

@When("user clicks on Tees")
	public void user_clicks_on_tees() {
    whatsnew.click_tees();
	}

@Then("user should navigate to Tee page")
	public void user_should_navigate_to_tee_page() {
	String expResult="Tees - Tops – Women";
	String actualResult=whatsnew.tees_pagetitle();
	Assert.assertEquals(actualResult, expResult);
	}

@When("user clicks on Bras & Tanks")
	public void user_clicks_on_bras_tanks() {
    whatsnew.click_brastanks();
	}

@Then("user should navigate to Bras & Tanks page")
	public void user_should_navigate_to_bras_tanks_page() {
	String expResult="Bras & Tanks - Tops – Women";
	String actualResult=whatsnew.brastanks_pagetitle();
	Assert.assertEquals(actualResult, expResult);
 	}

@When("user clicks on Pants")
	public void user_clicks_on_pants() {
    whatsnew.click_pants();
	}

@Then("user should navigate to Pants page")
	public void user_should_navigate_to_pants_page() {
	String expResult="Pants - Bottoms – Women";
	String actualResult=whatsnew.pants_pagetitle();
	Assert.assertEquals(actualResult, expResult);
	}

@When("user clicks on Shorts")
	public void user_clicks_on_shorts() {
    whatsnew.click_shorts();
	}

@Then("user should navigate to Shorts page")
public void user_should_navigate_to_shorts_page() {
	String expResult="Shorts - Bottoms - Women";
	String actualResult=whatsnew.shorts_pagetitle();
	Assert.assertEquals(actualResult, expResult);
	}
}
