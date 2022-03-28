package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is Contact Information page Repository
 * @author MdImran
 *
 */
public class ContactInformationPage {
	
	/*Declaration of WebElement*/
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement informationOfContact;
	
	/*Initialization of WebElement*/
	public ContactInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters of WebElement*/
	public WebElement getInformationOfContact() {
		return informationOfContact;
	}
	
	/*Business Logic*/
	/**
	 * This method is used for Get the information of Created new Contact
	 * @return
	 */
	public String information()
	{
		return informationOfContact.getText();
	}

}
