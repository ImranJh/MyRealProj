package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is Create newProduct Page Object Repository
 * @author MdImran
 *
 */
public class CreateNewProductPage {
	
	/*Declaration of WebElemen*/
	@FindBy(name="productname")
	private WebElement productNameTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveIcon;
	
	/*Initialization of WebElement*/
	public CreateNewProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters for WebElement*/
	public WebElement getProductNameTextField() {
		return productNameTextField;
	}

	public WebElement getSaveIcon() {
		return saveIcon;
	}
	
	/*Business Logic*/
	/**
	 * This method is used to send Product name on textField and Click on SaveLink
	 * @param productName
	 */
	public void productName(String productName)
	{
		productNameTextField.sendKeys(productName);
		saveIcon.click();
	}
	
	

}
