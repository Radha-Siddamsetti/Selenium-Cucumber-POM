package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logoutPage {

	
WebDriver driver= null;
	
	By MenuButton = By.className("bm-burger-button");
	By LogoutLink = By.id("logout_sidebar_link");
	
	public logoutPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void clickMenuButton() 
	{
		driver.findElement(MenuButton).click();
	
	 }
	
	public void clickLogoutLink()
	{
		driver.findElement( LogoutLink).click();
	 }
	
}
