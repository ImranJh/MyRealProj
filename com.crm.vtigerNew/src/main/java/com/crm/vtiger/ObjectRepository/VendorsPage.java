package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is VendorPage Object Repository
 * @author MdImran
 *
 */
public class VendorsPage {
	
	/*Declaration of WebElement*/
	@FindBy(xpath = "//img[@title='Create Vendor...']")
	private WebElement clickOnCreateVendor;
		
	/*Initialization of WebElement*/
	public VendorsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters for WebElement */
	public WebElement getClickOnCreateVendor() 
	{
		return clickOnCreateVendor;
	}
	
	/*Business Logic*/
	/**
	 * This Method is used to click on Vendor Link
	 * @param driver
	 */
	public void createVendor(WebDriver driver)
	{
		clickOnCreateVendor.click();
	}
	
}
