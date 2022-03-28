package com.crm.contact;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.crm.vtiger.ObjectRepository.ContactInformationPage;
import com.crm.vtiger.ObjectRepository.ContactNewPage;
import com.crm.vtiger.ObjectRepository.ContactPage;
import com.crm.vtiger.ObjectRepository.HomePage;
import com.crm.vtiger.comcast.genericUtility.BaseClass;
/**
 * Create a new Contact With Mandatory Fields
 * @author MdImran
 *
 */
public class ContactAnnotationTest extends BaseClass{
	@Test(groups = "regressionTest")
	public void contact() throws Throwable {
		
		
		/*Navigate to Contact*/
		HomePage hp = new HomePage(driver);
		hp.conntactLink(driver);
		
		/*Click On Create Contact*/
		ContactPage cp = new ContactPage(driver);
		cp.Contact(driver);
		
		/*Fetch Contact Data from ExcelSheet*/
		int ranNum=java.getRanDomNumber();
		String contactName=excel.fetchDataFromExcel("Contact", 1, 3)+ranNum;
		ContactNewPage cnp = new ContactNewPage(driver);
		cnp.contactPage(contactName);
		/*Validation*/
		ContactInformationPage cip= new ContactInformationPage(driver);
		String msg = cip.information();
		Assert.assertEquals(msg.contains(contactName), true);
		
		System.out.println("Smoke Test Run 1");
		
	}

}
