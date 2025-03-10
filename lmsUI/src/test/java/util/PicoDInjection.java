package util;
import pageObjects.BatchPage;
import pageObjects.ClassPage;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProgramPage;
import pageObjects.BatchPage;

public class PicoDInjection {

	public LoginPage loginPage1;
	public HomePage homePage1;
	public ProgramPage programPage;
	public BatchPage batchPage;
	public ClassPage classPage;

	
	public PageUtils pageUtils;
	public LoginPage loginPage;
	public HomePage homePage;
	public static String eXCEL = "src/test/resources/TestData/LMS_data.xlsx";
	
	 /* Invoke whenn there is a change to the results in the page
	  (Number of rows / pages may change based on add / delete operations)*/
	 
	public PageUtils getPageUtils(String rowsInfo) {
		pageUtils = new PageUtils(rowsInfo);
		return pageUtils;
	}
	
	
	// Invoke whenn there is no change to the results in the page
	 
	public PageUtils getCurrentPageUtils(String rowsInfo) {
		if (pageUtils == null) {
			return getPageUtils(rowsInfo);
		}
		
		return pageUtils;
	}

}

