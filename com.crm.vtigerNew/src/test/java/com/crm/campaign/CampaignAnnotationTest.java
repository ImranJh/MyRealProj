package com.crm.campaign;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.vtiger.ObjectRepository.CampaignInformationPage;
import com.crm.vtiger.ObjectRepository.CreateCampaignPage;
import com.crm.vtiger.ObjectRepository.CreateNewCampaignPage;
import com.crm.vtiger.ObjectRepository.HomePage;
import com.crm.vtiger.comcast.genericUtility.BaseClass;
/**
 * Create a new Campaign With Mandatory Fields
 * @author MdImran
 *
 */

public class CampaignAnnotationTest extends BaseClass{
	@Test(groups = "smokeTest", retryAnalyzer= com.crm.vtiger.comcast.genericUtility.RetryAnalyzerImplementationClass.class)
	public void campaign() throws Throwable
	{
		
		/*Navigate to Campaign Link*/
		HomePage hp = new HomePage(driver);
		hp.Campaign(driver);
		/*Navigate to CreateCampaign*/
		CreateCampaignPage cp=new CreateCampaignPage(driver);
		cp.addCampaign();
		
		/*Fetch Data from ExcelSheet*/
		int ranNum= java.getRanDomNumber();
		String campaignName= excel.fetchDataFromExcel("Campaign", 1, 3)+ranNum;
		CreateNewCampaignPage cncp = new CreateNewCampaignPage(driver);
		cncp.campaignName(campaignName);
		
		/*Validation*/
		CampaignInformationPage cip = new CampaignInformationPage(driver);
		String msg = cip.information();
		Assert.assertEquals(msg.contains(campaignName), true);
		
		Reporter.log("pass", true);
		System.out.println("Regression Test Run 1");
	}
}
