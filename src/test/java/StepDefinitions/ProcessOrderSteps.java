package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import pages.aboutpage;
import pages.homepage;
import pages.loginPage;
import pages.logoutPage;
import pages.productPage;

public class ProcessOrderSteps {

	
	WebDriver driver = null;	

	loginPage login;
	homepage hp;
	logoutPage lg;
	aboutpage abt;
	productPage pdt;
	
	@Given("open the url")
	public void open_the_url()
	{
		System.out.println("===ProductOrderSteps====");
		System.out.println("Inside Step - User open the url");
		String projectPath = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.saucedemo.com/v1/");
	}
	
	@And("login into page")
	public void login_into_page() 
	{
		System.out.println("Inside Step - User login into page");
		login = new loginPage(driver);
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLogin();
	}
	
	@Then("pick the products and add to cart")
	public void pick_the_products_and_add_to_cart() throws InterruptedException {
		System.out.println("Inside Step - pick the products and add to cart");
		//pdt = new productPage(driver);
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector(".Sauce.Labs.Backpack"));
		
		/*Thread.sleep(2000);
		//pdt.click_backpack();
		pdt.clickAddCartbutton();
		pdt.clickbackbutton();
		pdt.clickinfo_bikeLight();
		pdt.clickAddCartbutton();
		pdt.clickbackbutton();
		pdt.clickshoppingCart();
		pdt.clickcheckoutButton(); */
		
	}

	@And("Fill the information")
	public void fill_the_information() {
		System.out.println("Inside Step - Fill the information");
	}
	
	
	
}
