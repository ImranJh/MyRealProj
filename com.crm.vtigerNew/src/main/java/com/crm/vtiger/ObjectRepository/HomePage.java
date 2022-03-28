package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.comcast.genericUtility.WebDriverUtility;

/**
 * This is HomePage Object Repository
 * @author MdImran
 *
 */
public class HomePage {
	
WebDriverUtility web = new WebDriverUtility();
	
	/*Declaration of WebElement*/
	@FindBy(linkText = "Organizations")
	private WebElement organizationsLinkToClick;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactLinkToClick;
	
	@FindBy(linkText = "Products")
	private WebElement productLinkToClick;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement logOutIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement clickOnLoSignOut;
	
	@FindBy(linkText = "More")
	private WebElement moreLink;
	
	@FindBy(name = "Campaigns")
	private WebElement campaignLinkToClick;
	
	@FindBy(xpath = "//a[@name='Vendors']")
	private WebElement vendorLinkToClick;
	
	@FindBy(name = "Purchase Order")
	private WebElement purchaseOrderLink;
	
	/*Initialization of WebElement*/
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*Getters of WebElement*/
	public WebElement getProductLinkToClick() {
		return productLinkToClick;
	}

	public WebElement getOrganaizationLinkToClick() {
		return organizationsLinkToClick;
	}

	public WebElement getLogOutIcon() {
		return logOutIcon;
	}

	public WebElement getClickOnLoSignOut() {
		return clickOnLoSignOut;
	}
	public WebElement getConntactLinkToClick() {
		return contactLinkToClick;
	}

	public WebElement getMoreLinkToClick() 
	{
		return moreLink;
	}
	
	public WebElement getCampaignLinkToClick() 
	{
		return campaignLinkToClick;
	}
	
	public WebElement getVendorLinkToClick() {
		return vendorLinkToClick;
	}

	public WebElement getPurchaseOrderLink() {
		return purchaseOrderLink;
	}

	/*Business Logic*/
	/**
	 * This method is use to click on OrganizationLink
	 * @param driver
	 */
	
	public void OrganizationLink(WebDriver driver)
	{
		organizationsLinkToClick.click();
	}
	/**
	 * This method is use to move to SingOut Icon And Click on Logout Link
	 * @param driver
	 */
	
	public void clickOnLogout(WebDriver driver)
	{
		web.mouseAction(driver, logOutIcon);
		clickOnLoSignOut.click();
	}
	/**
	 * This method is use to click on ContactLink
	 * @param driver
	 */
	
	public void conntactLink(WebDriver driver)
	{
		contactLinkToClick.click();
	}
	/**
	 * This method is use to click on ProductLink
	 * @param driver
	 */
	
	public void productLink(WebDriver driver)
	{
		productLinkToClick.click();
	}
	/**
	 * This method is use to click on CampaignLink
	 * @param driver
	 */
	public void Campaign(WebDriver driver)
	{
		web.mouseAction(driver, moreLink);
		campaignLinkToClick.click();
	}
	/**
	 * This method is use to click on VendorLink
	 * @param driver
	 */
	public void vendorLink(WebDriver driver)
	{
		web.mouseAction(driver, moreLink);
		vendorLinkToClick.click();
	}
	/**
	 * This method is use to click on PurchaseOrderLink
	 * @param driver
	 */
	public void purchaseOrderLink(WebDriver driver)
	{
		web.mouseAction(driver, moreLink);
		purchaseOrderLink.click();
	}
	
	
	
}
