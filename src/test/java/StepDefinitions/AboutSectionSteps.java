
package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.homepage;
import pages.loginPage;
import pages.logoutPage;
import pages.aboutpage;

public class AboutSectionSteps {

	
	WebDriver driver = null;	
		

	loginPage login;
	homepage hp;
	logoutPage lg;
	aboutpage abt;
	
	/*@Given("User open the url")
	public void User_open_the_url()
	{
		System.out.println("===Inside POM====");
		System.out.println("Inside Step - User open the url");
		String projectPath = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.saucedemo.com/v1/");
	}
	
	@And("User login into page")
	public void User_login_into_page() 
	{
		System.out.println("Inside Step - User login into page");
		login = new loginPage(driver);
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLogin();
	}
	*/
	@Then("user clicks on the About section")
	public void user_clicks_on_the_About_section() throws InterruptedException
	{
		System.out.println("Inside Step - user clicks on the About section");
		lg = new logoutPage(driver);
		  lg.clickMenuButton();
		   Thread.sleep(1000);
		   
		abt = new aboutpage(driver);
	     abt.clickOnAboutSection();
	     Thread.sleep(1000);
	    
	     driver.close();
	     driver.quit();
			}
	
	
	
}
