package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is PurchaseOrderPage Object Repository
 * @author MdImran
 *
 */
public class PurchaseOrderPage {
	
	/*Declaration Of WebElement*/
	@FindBy(xpath = "//img[@title='Create Purchase Order...']")
	private WebElement clickOnCreatePurchaseOrder;
	
	/*Initialization of WebElement*/
	public PurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters of WebElement*/
	public WebElement getClickOnCreatePurchaseOrder() 
	{
		return clickOnCreatePurchaseOrder;
	}
	
	/*Business Logic*/
	/**
	 * This method is used to click on AddNewPurchaseOrderIcon
	 * @param driver
	 */
	public void createPurchaseOrder(WebDriver driver)
	{
		clickOnCreatePurchaseOrder.click();
	}
}
