package com.crm.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is Login Page Object Repository
 * @author MdImran
 *
 */
public class LoginPage {
	
	/*Declaration Of WebElement*/
	@FindBy(name="user_name")
	private WebElement userNameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	/*getters Of WebElements*/

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	/*Initialization of WebElement*/
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/*Business logic*/
	/**
	 * This method is used to Send Username,Password to respected text field and click on Login
	 * @param username
	 * @param password
	 */
	public void LoginPage(String username, String password)
	{
		userNameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	
	
	
	

}
