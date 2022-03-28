package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.comcast.genericUtility.WebDriverUtility;
/**
 * This is PurchaseOrderPoopUp Page Object Repository
 * @author MdImran
 *
 */
public class PurchaseOrderPoopupPage {
	
	WebDriverUtility web = new WebDriverUtility();
	/*Initialization of WebElement*/
	public PurchaseOrderPoopupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Declaration of WebElement*/
	@FindBy(name = "search_text")
	private WebElement searchBoxInNewWindow;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchButtonInNewWindow;

	/*Getters of WebElement*/
	public WebElement getSearchBoxInNewWindow() {
		return searchBoxInNewWindow;
	}

	public WebElement getSearchButtonInNewWindow() {
		return searchButtonInNewWindow;
	}
	/*Business Logic*/
	/**
	 * This method is used to send text to search field and click on search button and select vendor
	 * @param vendorName
	 * @param driver
	 */
	public void poopUp(String vendorName, WebDriver driver)
	{
		searchBoxInNewWindow.sendKeys(vendorName);
		searchButtonInNewWindow.click();
		driver.findElement(By.linkText(vendorName)).click();
	}
	/**
	 * This method is used to change driver focus from Vendor poopUp to main Window
	 * @param driver
	 */
	public void switchToMainWindow(WebDriver driver)
	{
		web.switchToWindow(driver, "PurchaseOrder&action");
	}
	
}
