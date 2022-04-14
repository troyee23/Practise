package com.medtronic.corp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.components.AdvancedTab;
import com.medtronic.corp.components.BasicTab;
import com.medtronic.corp.components.OpenGraphTab;
import com.medtronic.corp.components.ProductModelTab;
import com.medtronic.corp.components.SuccessToast;
import com.medtronic.corp.components.Template;
import com.medtronic.corp.pageobjects.LoginPageObjects;
import com.medtronic.corp.pageobjects.SitesPageObjects;

public class SitesPage extends TestBase {

	SitesPageObjects _sitesPageObjects = new SitesPageObjects();
	Template _template;
	BasicTab _basicTab;
	AdvancedTab _advancedTab;
	OpenGraphTab _openGraphTab;
	ProductModelTab _productModelTab;
	SuccessToast _successToast;

	public SitesPage(WebDriver driver) {
		this.driver = driver;
		_template= new Template(driver);
		_basicTab= new BasicTab(driver);
		_advancedTab= new AdvancedTab(driver);
		_openGraphTab= new OpenGraphTab(driver);
		_productModelTab = new ProductModelTab(driver);
		_successToast = new SuccessToast(driver);
		PageFactory.initElements(driver, _sitesPageObjects);

	}
	
	public void createPage(String templateName, String pageName) throws InterruptedException{
		_sitesPageObjects.createButton.click();
		_sitesPageObjects.createPageOption.click();
		_template.selectTemplate(templateName);
		_basicTab.fillBasicTab();
		_openGraphTab.fillOpenGraphTab();
		_productModelTab.fillProductModelTab();
		Thread.sleep(2000);
		_sitesPageObjects.createPageButton.click();
		_successToast.clickOnOpen();
		Thread.sleep(5000);
		
	}

}
