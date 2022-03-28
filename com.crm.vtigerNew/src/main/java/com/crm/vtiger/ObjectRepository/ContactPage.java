package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is Contact Object Repository
 * @author MdImran
 *
 */
public class ContactPage {
	
	/*Declaration of WebElement*/
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement clickOncreateNewContact;
	
	/*Initialization of WebElement*/
	public ContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*Getters of WebElement*/
	public WebElement getClickOncreateNewContact() {
		return clickOncreateNewContact;
	}
	
	/*Business Logic*/
	/**
	 * This method is used to click on AddContactIcon
	 * @param driver
	 */
	public void Contact(WebDriver driver)
	{
		clickOncreateNewContact.click();
	}

}
