package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is Product InformationPage Object Repository
 * @author MdImran
 *
 */
public class ProductInformationPage {
	
	/*Declaration of WebElemen*/
	@FindBy(className = "lvtHeaderText")
	private WebElement productInformation;
	
	/*Initialization of WebElement*/
	public ProductInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters for WebElement*/
	public WebElement getProductInformation() 
	{
		return productInformation;
	}
	
	/*Business logic*/
	/**
	 * This method is used to get information about Product
	 * @return
	 */
	public String informationProduct()
	{
		return productInformation.getText();
	}

}
