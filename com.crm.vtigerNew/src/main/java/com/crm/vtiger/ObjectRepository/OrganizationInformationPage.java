package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is Organization information Page Object Repository
 * @author MdImran
 *
 */
public class OrganizationInformationPage {

	
	/*Declaration of WebElement*/
	@FindBy(className ="dvHeaderText")
	private WebElement organizationInformation;
	
	@FindBy(linkText = "Contacts")
	private WebElement clickOnContactLink;
	
	/*Initialization of WebElement*/
	public OrganizationInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters of WebElement*/
	public WebElement getOrganizationInformation() 
	{
		return organizationInformation;
	}

	public WebElement getClickOnContactLink() 
	{
		return clickOnContactLink;
	}

	/*Business Logic*/
	/**
	 * This method is used for get the information about Organization
	 * @return
	 */
	public String fetchOrganizationDetails()
	{
		return organizationInformation.getText();
	}
	/**
	 * This method is used to click on contact link
	 * @param driver
	 */
	public void contactLink(WebDriver driver)
	{
		clickOnContactLink.click();
	}

}
