package com.crm.organization;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.crm.vtiger.ObjectRepository.CreateOrganizationPage;
import com.crm.vtiger.ObjectRepository.HomePage;
import com.crm.vtiger.ObjectRepository.OrganiazationPage;
import com.crm.vtiger.ObjectRepository.OrganizationInformationPage;
import com.crm.vtiger.comcast.genericUtility.BaseClass;
import com.crm.vtiger.comcast.genericUtility.ExcelUtility;

public class OrgWithIndustryAnnotationTest extends BaseClass {
	@Test(groups = "functionalTest")
	public void organizationWithIndustry() throws Throwable
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
		CreateOrganizationPage corgNewpg = new CreateOrganizationPage(driver);
		String ind = excel.fetchDataFromExcel("Org", 8, 3);
		corgNewpg.newOrg(oName, ind);
		/*Validation*/
		OrganizationInformationPage oip = new OrganizationInformationPage(driver);
		String orgDetails = oip.fetchOrganizationDetails();
		Assert.assertEquals(orgDetails.contains(oName), true);
		
		System.out.println("Functional Test Run 1");
		
	}
}
