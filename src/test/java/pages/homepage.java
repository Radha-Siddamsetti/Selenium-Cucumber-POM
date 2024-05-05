package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage {

	
WebDriver driver= null;
	
	By logo = By.className("app_logo");
	
	public homepage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void checkHomePageIsDisplayed()
	{
		driver.findElement(logo).isDisplayed();
	 }
	
	
}
