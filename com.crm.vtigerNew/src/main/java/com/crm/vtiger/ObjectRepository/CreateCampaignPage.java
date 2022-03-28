package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is CreateCampaign Page Object Repository
 * @author MdImran
 *
 */
public class CreateCampaignPage {
	
	/*Declaration of WebElement */
	@FindBy(xpath = "//img[@title='Create Campaign...']")
	private WebElement createCampaignLinkToClick;
	
	/*Initialization of WebElement*/
	public CreateCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*Getters for WebElement*/
	public WebElement getCreateCampaignLinkToClick() {
		return createCampaignLinkToClick;
	}
	
	/*Business Logic */
	/**
	 * This method is used to click on addCampainIcon
	 */
	public void addCampaign()
	{
		createCampaignLinkToClick.click();
	}
	

}
