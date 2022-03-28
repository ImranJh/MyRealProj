package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is Product Page Object Repository
 * @author MdImran
 *
 */
public class ProductPage {
	
	/*Declaration of WebElement*/
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement clickOnCreateProductIcon;
	
	/*Initialization of WebElement*/
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters of WebElement*/
	public WebElement getClickOnCreateProductIcon() {
		return clickOnCreateProductIcon;
	}
	
	/*Business Logic*/
	/**
	 * This method is used to click on create Product Icon
	 * @param driver
	 */
	public void addProduct(WebDriver driver)
	{
		clickOnCreateProductIcon.click();
	}
	

}
