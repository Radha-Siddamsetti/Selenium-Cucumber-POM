package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage {

	
WebDriver driver= null;
	
	By backpack = By.id("item_4_title_link");
	
	By btn_AddCart = By.className("btn_primary btn_inventory");
	
	By btn_back = By.className("inventory_details_back_button");
	
	By info_bikeLight = By.id("item_0_title_link");
	
	By shoppingCart = By.id("shopping_cart_container");	
	
	By checkoutButton = By.id("btn_action checkout_button");
	
	public productPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void click_backpack()
	{
		driver.findElement(backpack).click();
	 }
	
	public void clickAddCartbutton()
	{
		driver.findElement(btn_AddCart).click();
	 }
	
	public void clickbackbutton()
	{
		driver.findElement(btn_back).click();
	 }
	
	public void clickinfo_bikeLight()
	{
		driver.findElement(info_bikeLight).click();
	 }
	
	public void clickshoppingCart()
	{
		driver.findElement(shoppingCart).click();
	 }
	
	public void clickcheckoutButton()
	{
		driver.findElement(checkoutButton).click();
	 }
	
}
