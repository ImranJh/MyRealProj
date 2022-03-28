package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.comcast.genericUtility.WebDriverUtility;
/**
 * This is Organization PoopUp WindowPage Object Repository
 * @author MdImran
 *
 */
public class OrganizationWindowPopupPage {
	
	WebDriverUtility web= new WebDriverUtility();
	/*Declaration of WebElement*/
	@FindBy(id = "search_txt")
	private WebElement searchBoxInWindow;
	
	@FindBy(xpath = "//input[@type='button']")
	private WebElement searchButton;
	
	/*Initialization of WebElement*/
	public OrganizationWindowPopupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*Getters for WebElement*/
	public WebElement getSearchBoxInWindow()
	{
		return searchBoxInWindow;
	}

	public WebElement getSearchButton() 
	{
		return searchButton;
	}
	
	/*Business Logic*/
	/**
	 * This method is used to send text on search box and click on search Button
	 * @param orgName
	 * @param driver
	 */
	public void windowPop(String orgName, WebDriver driver)
	{
		searchBoxInWindow.sendKeys(orgName);
		searchButton.click();
		driver.findElement(By.linkText(orgName)).click();
	}
	
	/**
	 * This method is used to switch driver focus from PoopUp window to main window
	 * @param driver
	 */
	public void mainWindow(WebDriver driver)
	{
		web.switchToWindow(driver, "Contacts&action");
	}

}
