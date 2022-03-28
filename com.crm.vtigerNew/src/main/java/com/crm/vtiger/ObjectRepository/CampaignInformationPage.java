package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * This is CampaignInformationPage Object Repository
 * @author MdImran
 *
 */
public class CampaignInformationPage {
	
	/*Declaration Of WebElement*/
	@FindBy(className = "dvHeaderText")
	private WebElement createdCampaignInformation;
	
	/*Initialization of WebElement*/
	public CampaignInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters of WebElement*/
	public WebElement getCreatedCampaignInformation() 
	{
		return createdCampaignInformation;
	}
	
	/*Business Logic*/
	/**
	 * This method is used for get information about New Campaign
	 * @return
	 */
	public String information()
	{
		return createdCampaignInformation.getText();
	}
	

}
