package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is Create New Campaign Page Object Repository
 * @author MdImran
 *
 */
public class CreateNewCampaignPage {
	
	/*Declaration Of WebElement*/
	@FindBy(name = "campaignname")
	private WebElement campaignNameTextFeald;
	
	@FindBy(xpath = "//td[@class='detailedViewHeader']/preceding::input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	/*Initialization of WebElement*/
	public CreateNewCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters of WebElement*/
	public WebElement getCampaignNameTextFeald() 
	{
		return campaignNameTextFeald;
	}

	public WebElement getSaveButton() 
	{
		return saveButton;
	}
	/*Business Logic*/
	/**
	 * This Method is used to send Campaign name on Text field and click on Save link
	 * @param campaignName
	 */
	public void campaignName(String campaignName)
	{
		campaignNameTextFeald.sendKeys(campaignName);
		saveButton.click();
	}
	
	

}
