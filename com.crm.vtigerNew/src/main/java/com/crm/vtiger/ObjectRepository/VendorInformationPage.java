package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is VendorInformationPage Object Repository
 * @author MdImran
 *
 */
public class VendorInformationPage {
	
	/*Declaration Of WebElement*/
	@FindBy(className = "lvtHeaderText")
	private WebElement informationBar;
	
	/*Initialization of WebElement*/
	public VendorInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters of WebElement*/
	public WebElement getInformationBar() {
		return informationBar;
	}
	
	/*Business Logic*/
	/**
	 * This Method is Used to get the information about Vendor
	 * @return
	 */
	public String information()
	{
		return informationBar.getText();
	}
	

}
