package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.comcast.genericUtility.WebDriverUtility;
/**
 * This is Product PoopUpPage Object Repository
 * @author MdImran
 *
 */
public class ProductsPoopUpPage {
	
	WebDriverUtility web = new WebDriverUtility();
	/*Initialization Of WebElement*/
	public ProductsPoopUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/*Declaration of WebElement*/
	@FindBy(xpath = "//input[@id='search_txt']")
	private WebElement searchBoxInproductPage;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchButton;

	/*Getters of WebElement*/
	public WebElement getSearchBoxInproductPage() {
		return searchBoxInproductPage;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	/*Business Logic*/
	/**
	 * This method is used to send text to search box and click on Search button and select the product
	 * @param productName
	 * @param driver
	 */
	public void productWin(String productName, WebDriver driver)
	{
		searchBoxInproductPage.sendKeys(productName);
		searchButton.click();
		driver.findElement(By.linkText(productName)).click();
	}
	/**
	 * This method is used to switch driver focus from productPoopUp window to Main Window
	 * @param driver
	 */
	public void switchToMainWindow(WebDriver driver)
	{
		web.switchToWindow(driver, "PurchaseOrder&action");
	}
	
	

}
