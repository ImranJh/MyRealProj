package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.comcast.genericUtility.WebDriverUtility;

/**
 * This is NewContactpage Object Repository
 * @author MdImran
 *
 */
public class ContactNewPage {
	
	WebDriverUtility web = new WebDriverUtility();
	
	/*Declaration of WebElement*/
	@FindBy(name= "lastname")
	private WebElement contactLastNameFeald;
	
	@FindBy(xpath = "//b[text()='Contact Information']/preceding::input[@title='Save [Alt+S]']")
	private WebElement saveContact;
	
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement clickOnAddOrganization;
	
	/*Initialization of WebElement*/
	public ContactNewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters of WebElement*/
	public WebElement getContactLastNameFeald() {
		return contactLastNameFeald;
	}

	public WebElement getSaveContact() {
		return saveContact;
	}
	
	/*Business Logic for ContactPage*/
	/**
	 * This Method is use to Send Contact Name to the Last Name TextFeald
	 * @param contactName
	 */
	public void contactPage(String contactName)
	{
		contactLastNameFeald.sendKeys(contactName);
		saveContact.click();
	}
	/**
	 * This Method is use to Send Contact Name to the Last Name TextFeald and click on organization Link
	 * @param contact
	 * @param driver
	 */
	public void contact(String contact, WebDriver driver)
	{
		contactLastNameFeald.sendKeys(contact);
		clickOnAddOrganization.click();
		web.switchToWindow(driver, "Accounts&action");
	}
	/**
	 * This Method is use to Save New Contact Details
	 * @param driver
	 */
	public void saveContactWithOrg(WebDriver driver)
	{
		saveContact.click();
	}
 
}
