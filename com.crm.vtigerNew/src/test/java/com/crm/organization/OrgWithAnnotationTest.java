package com.crm.organization;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.vtiger.ObjectRepository.CreateOrganizationPage;
import com.crm.vtiger.ObjectRepository.HomePage;
import com.crm.vtiger.ObjectRepository.OrganiazationPage;
import com.crm.vtiger.ObjectRepository.OrganizationInformationPage;
import com.crm.vtiger.comcast.genericUtility.BaseClass;
import com.crm.vtiger.comcast.genericUtility.ExcelUtility;

public class OrgWithAnnotationTest extends BaseClass{
	@Test(groups = "regressionTest")
	public void organization() throws Throwable
	{
		int rnd = java.getRanDomNumber();
		ExcelUtility excel = new ExcelUtility();
		String oName = excel.fetchDataFromExcel("Org", 1, 3)+rnd;
		/*Navigate to Contact Page*/
		HomePage hp = new HomePage(driver);
		hp.OrganizationLink(driver);
		/*Click on New Organization link */
		OrganiazationPage orgpg=new OrganiazationPage(driver);
		orgpg.Organiazation();
		/*New Organization */
		CreateOrganizationPage corgNewpg=new CreateOrganizationPage(driver);
		corgNewpg.newOrganization(oName);
		/*Validation*/
		OrganizationInformationPage oip = new OrganizationInformationPage(driver);
		String OrgDetails = oip.fetchOrganizationDetails();
		Assert.assertEquals(OrgDetails.contains(oName), true);
		
		System.out.println("Sanity Test Run 1");
	}

}
