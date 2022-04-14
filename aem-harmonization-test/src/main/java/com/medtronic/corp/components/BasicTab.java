package com.medtronic.corp.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.CommonMethods;
import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.BasicTabObject;

public class BasicTab extends TestBase {

	public BasicTabObject _basicTabObject = new BasicTabObject();

	public BasicTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, _basicTabObject);
	}
	
	public void fillBasicTab(){
		
		
		_basicTabObject.basicTab.click();
		_basicTabObject.titleTextBox.sendKeys(CommonMethods.getPropertieValue("productModel", "Title"));
		_basicTabObject.nameTextBox.sendKeys(CommonMethods.getPropertieValue("productModel", "Name"));
		_basicTabObject.pageTitleTextBox.sendKeys(CommonMethods.getPropertieValue("productModel", "Pagetitle"));
		_basicTabObject.navigationTitleTextBox.sendKeys(CommonMethods.getPropertieValue("productModel", "Navigation"));
		_basicTabObject.descriptionTextBox.sendKeys(CommonMethods.getPropertieValue("productModel", "Description"));
	}

}
