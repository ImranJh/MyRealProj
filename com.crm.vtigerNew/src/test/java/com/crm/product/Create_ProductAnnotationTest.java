package com.crm.product;

import com.crm.vtiger.ObjectRepository.ProductPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.vtiger.ObjectRepository.CreateNewProductPage;
import com.crm.vtiger.ObjectRepository.HomePage;
import com.crm.vtiger.ObjectRepository.ProductInformationPage;
import com.crm.vtiger.comcast.genericUtility.BaseClass;

/**
 * Create a new Product With Mandatory Fields
 * @author MdImran
 *
 */
public class Create_ProductAnnotationTest extends BaseClass{
		@Test(groups = "systemTest")
		public void product() throws Throwable
		{
		
		/*Navigate to Product*/
		HomePage hp= new HomePage(driver);
		hp.productLink(driver);
		/*Click on Create Product Icon*/
		ProductPage cpp= new ProductPage(driver);
		cpp.addProduct(driver);
		
		/*Fetch Data from ExcelSheet*/
		int ranNum=java.getRanDomNumber();
		String productName=excel.fetchDataFromExcel("Product", 1, 3)+ranNum;
		CreateNewProductPage cnpp= new CreateNewProductPage(driver);
		cnpp.productName(productName);
		
		/*Validation*/
		ProductInformationPage pip= new ProductInformationPage(driver);
		String msg=pip.informationProduct();
		Assert.assertEquals(msg.contains(productName),true);
		
		System.out.println("SystemTest Run 2");
		
	}

}
