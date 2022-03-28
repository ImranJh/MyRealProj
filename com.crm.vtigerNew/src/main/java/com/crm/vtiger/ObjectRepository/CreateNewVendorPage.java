package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is Create vendorPage Object Repository
 * @author MdImran
 *
 */
public class CreateNewVendorPage {
	/*Declaration of WebElement*/
	@FindBy(name = "vendorname")
	private WebElement vendorTextField;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement mobTextField;
	
	@FindBy(xpath = "//td[@class='detailedViewHeader']/preceding::input[@title='Save [Alt+S]']")
	private WebElement clickOnSave;
	
	/*Initialization of WebElement*/
	public CreateNewVendorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters for WebElement*/
	public WebElement getVendorTextField() {
		return vendorTextField;
	}

	public WebElement getMobTextField() {
		return mobTextField;
	}

	public WebElement getClickOnSave() {
		return clickOnSave;
	}
	
	/*Business Logic*/
	/**
	 * This Method is used to create New Vendor
	 * @param vendorName
	 * @param mobNum
	 */
	public void createVendor(String vendorName, String mobNum)
	{
		vendorTextField.sendKeys(vendorName);
		mobTextField.sendKeys(mobNum);
		clickOnSave.click();
		
	}

}
