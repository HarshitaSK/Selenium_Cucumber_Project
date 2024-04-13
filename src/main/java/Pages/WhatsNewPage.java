package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatsNewPage {
	
	private WebDriver driver;
		
	private By whatsNewLocator= By.xpath("//a[@id='ui-id-3']");
	private By hoodiessweatshirtsLocator=By.xpath("//*[@id='maincontent']/div[4]/div[2]/div/div/ul[1]/li[1]/a");
	private By jacketsLocator=By.xpath("//*[@id='maincontent']/div[4]/div[2]/div/div/ul[1]/li[2]/a");
	private By teesLocator=By.xpath("//*[@id='maincontent']/div[4]/div[2]/div/div/ul[1]/li[3]/a");
	private By brasTanksLocator=By.xpath("//*[@id='maincontent']/div[4]/div[2]/div/div/ul[1]/li[4]/a");
	private By pantsLoctor=By.xpath("//*[@id='maincontent']/div[4]/div[2]/div/div/ul[1]/li[5]/a");
	private By ShortsLocator=By.xpath("//*[@id='maincontent']/div[4]/div[2]/div/div/ul[1]/li[6]/a");
	
	
	public WhatsNewPage(WebDriver driver) {
		
		this.driver=driver;
	}
		
	 
	public void click_whatsNew() {
		WebElement whatsnew=driver.findElement(whatsNewLocator);
		whatsnew.click();
		}
	
	public String whatsNew_pagetitle() {
		WebElement whatsnew=driver.findElement(whatsNewLocator);
		whatsnew.click();
		return driver.getTitle();
	}
	
	 public void click_hoodiessweatshirt() {
		 
		 WebElement hoodiessweatshirt=driver.findElement(hoodiessweatshirtsLocator);
		 hoodiessweatshirt.click();
		 
		 }
	 
	public String hoodiessweatshirt_pagetitle(){
		this.click_whatsNew();
		WebElement hoodiessweatshirt=driver.findElement(hoodiessweatshirtsLocator);
		 hoodiessweatshirt.click();
		return driver.getTitle();
	}
	
	public void click_jackets() {
		WebElement jackets=driver.findElement(jacketsLocator);
		jackets.click();
	}
	
	public String jackets_pagetitle() {
		driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
		WebElement jackets=driver.findElement(jacketsLocator);
		jackets.click();
		return driver.getTitle();
	}
	
	public void click_tees() {
		WebElement tees=driver.findElement(teesLocator);
		tees.click();
	}
	
	public String tees_pagetitle() {
		driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
		WebElement tees=driver.findElement(teesLocator);
		tees.click();
		return driver.getTitle();
	}
	
	public void click_brastanks() {
		WebElement brastanks=driver.findElement(brasTanksLocator);
		brastanks.click();
	}
	
	public String brastanks_pagetitle() {
		driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
		WebElement brastanks=driver.findElement(brasTanksLocator);
		brastanks.click();
		return driver.getTitle();

	}
	
	public void click_pants() {
		WebElement pants=driver.findElement(pantsLoctor);
		pants.click();
	}
	public String pants_pagetitle() {
		driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
		WebElement pants=driver.findElement(pantsLoctor);
		pants.click();
		return driver.getTitle();
	}
	
	public void click_shorts() {
		WebElement shorts=driver.findElement(ShortsLocator);
		shorts.click();
	}
	
	public String shorts_pagetitle() {
		driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
		WebElement shorts=driver.findElement(ShortsLocator);
		shorts.click();
		return driver.getTitle();

	}

}
