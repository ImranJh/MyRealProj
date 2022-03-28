
package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.comcast.genericUtility.WebDriverUtility;
/**
 * This is New Purchase Order Page Object Repository
 * @author MdImran
 *
 */
public class CreateNewPurchaseOrderPage {
	
	WebDriverUtility web = new WebDriverUtility();
	
	/*Initialization of WebElement*/
	public CreateNewPurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*Declaration Of WebElement */
	@FindBy(css = "[name='subject']")
	private WebElement subjectTextField;
	
	@FindBy(name= "bill_street")
	private WebElement billingAddressTextFeald;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement clickOnSelectVendor;
	
	@FindBy(xpath = "//textarea[@name='ship_street']")
	private WebElement shippingAddressTextFeald;
	
	@FindBy(xpath = "//img[@src='themes/images/products.gif']")
	private WebElement productLinkToClick;
	
	@FindBy(xpath = "//input[@class='detailedViewTextBoxOn']")
	private WebElement quantityTextFeald;
	
	@FindBy(css = "input[name='vendor_name']")
	private WebElement vendorMsg;
	
	@FindBy(xpath = "//input[@value='Add Service']/following::input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	/*Getters of WebElement*/
	public WebElement getSubjectTextField() 
	{
		return subjectTextField;
	}

	public WebElement getBillingAddressTextFeald() 
	{
		return billingAddressTextFeald;
	}
	
	public WebElement getClickOnSelectVendor() {
		return clickOnSelectVendor;
	}
	
	public WebElement getShippingAddressTextFeald() 
	{
		return shippingAddressTextFeald;
	}
	
	public WebElement getProductLinkToClick() 
	{
		return productLinkToClick;
	}
	
	public WebElement getSaveButton() 
	{
		return saveButton;
	}
	
	public WebElement getVendorNameBox() {
		return vendorMsg;
	}

	public WebElement getQuantityTextFeald() 
	{
		return quantityTextFeald;
	}

	/*Business Logic*/
	/**
	 * This Method is used to send Text to SubjectText field and click on select vendor Link
	 * @param subjectName
	 */
	public void purchaseOrderField(String subjectName)
	{
		subjectTextField.sendKeys(subjectName);
		clickOnSelectVendor.click();
	}
	/**
	 * This method is used to send Text to Billing address and Shipping Address
	 * @param billingAddress
	 * @param shippingAddress
	 */
	public void billingAddress(String billingAddress, String shippingAddress)
	{
		billingAddressTextFeald.sendKeys(billingAddress);
		shippingAddressTextFeald.sendKeys(shippingAddress);
	}
	/**
	 * This method is used to click on product link
	 * @param driver
	 */
	public void productIcon(WebDriver driver)
	{
		productLinkToClick.click();
	}
	/**
	 * This method is used to send text to Product Quantity Text box
	 * @param productQty
	 */
	public void quantityTextBox(String productQty)
	{
		quantityTextFeald.sendKeys(productQty);
	}
	/**
	 * This Method is used to Click on vendor Link
	 * @param driver
	 */
	public void clickOnVendorIcon(WebDriver driver)
	{
		clickOnSelectVendor.click();
	}
	/**
	 * This method is used to click on save link
	 */
	public void saveButton()
	{
		saveButton.click();
	}
	
	/**
	 * This method is used to Change driver focus from main window to VendorPoopUp Window
	 * @param driver
	 */
	public void switchToVendorWindow(WebDriver driver)
	{
		web.switchToWindow(driver, "Vendors&action");
	}
	/**
	 * This method is used to Change driver focus from Main window to ProductPoopup Window
	 * @param driver
	 */
	public void switchToNewProductWindow(WebDriver driver)
	{
		web.switchToWindow(driver, "Products&action=Popup");
	}
	
	/**
	 * This method is used to Scroll down the window
	 * @param driver
	 * @throws Throwable
	 */
	public void downOfThePage(WebDriver driver) throws Throwable
	{
		web.robotToUse();
	}
	/**
	 * This Method is used to get the text of Vendor name box
	 * @return
	 */
	public String textOfVendorBox()
	{
		return vendorMsg.getText();
	}

}
