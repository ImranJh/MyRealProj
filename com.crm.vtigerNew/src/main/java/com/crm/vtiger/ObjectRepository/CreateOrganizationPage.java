package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is Create Organization page Object Repository
 * @author MdImran
 *
 */
public class CreateOrganizationPage {
	
	/*Declaration of WebElement*/
	@FindBy(name="accountname")
	private WebElement organizationNameTextField;
	
	@FindBy(name="industry")
	private WebElement industryDropDown;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement clickOnSave;
	
	
	/*Initialization of WebElement*/
	public CreateOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	/*Getters of WebElement*/
	public WebElement getOrganizationName() {
		return organizationNameTextField;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getClickOnSave() {
		return clickOnSave;
	}
	/*Business Logic*/
	/**
	 * This method is used to send Text to Organization Text Field and Click on save
	 * @param organizationName
	 * @param industryType
	 */
	
	public void newOrg(String orgName, String industryName )
	{
		organizationNameTextField.sendKeys(orgName);
		industryDropDown.sendKeys(industryName);
		clickOnSave.click();
	}
	/**
	 * This method is used to send Text to Organization Text Field and Click on save
	 * @param organizationName
	 * @param industryType
	 */
	public void newOrganization(String orgName)
	{
		organizationNameTextField.sendKeys(orgName);
		clickOnSave.click();
	}

}
