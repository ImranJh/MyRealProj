package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is Organization Page Object Repository
 * @author MdImran
 *
 */
public class OrganiazationPage {
	/*Declaration of WebElement*/
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrganiazationIcon;
	
	/*Initialization of WebElement*/
	public OrganiazationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Getters of WebElement*/
	public WebElement getCreateOrganiazationIcon() {
		return createOrganiazationIcon;
	}
	
	/*Business Logic*/
	/**
	 * This method is used to click on addOrgaizationIcon
	 */
	public void Organiazation()
	{
		createOrganiazationIcon.click();
	}
	
	

}
