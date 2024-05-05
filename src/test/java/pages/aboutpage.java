package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class aboutpage {

	
WebDriver driver= null;
	
	By AboutSection = By.id("about_sidebar_link");
	
	public aboutpage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void clickOnAboutSection()
	{
		driver.findElement(AboutSection).click();
	 }
	
	
	
	
}
