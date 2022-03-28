package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is PurchaseOrderInformation Object Repository
 * @author MdImran
 *
 */
public class PurchaseOrderInformationPage {
	
	/*Initialization of WebElement*/
	public PurchaseOrderInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/*Declaration of WebElement*/
	@FindBy(className = "lvtHeaderText")
	private WebElement purchaseOrdreInformation;
	
	@FindBy(xpath = "//td[@id='mouseArea_Vendor Name']")
	private WebElement vendorName;

	/*Getters Of WebElement*/
	public WebElement getPurchaseOrdreInformation() 
	{
		return purchaseOrdreInformation;
	}
		
	public WebElement getVendorName() {
		return vendorName;
	}
	/* Business Logic*/
	/**
	 * This method is used for get information about New PurchaseOrder
	 * @param driver
	 * @return
	 */
	
	public String informationMsg(WebDriver driver)
	{
		return purchaseOrdreInformation.getText();
	}
	/**
	 * This method is used for to check Vendor is selected or not in PurchaseOrder Page
	 * @return
	 */
	public String vendorInf()
	{
		return vendorName.getText();
	}
	

}
