package com.medtronic.corp.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.CommonMethods;
import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.ProductModelTabObject;

public class ProductModelTab extends TestBase{

	ProductModelTabObject _productModelTabObject = new ProductModelTabObject();
	
	public ProductModelTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, _productModelTabObject);
		
	}
	

	public void fillProductModelTab() throws InterruptedException{
		_productModelTabObject.productModelTab.click();
		Thread.sleep(2000);
		_productModelTabObject.productModelTagTextBox.sendKeys(CommonMethods.getPropertieValue("productModel", "ProductModelTag"));
		_productModelTabObject.productImageTextBox.sendKeys(CommonMethods.getPropertieValue("productModel", "ProductImage"));
		_productModelTabObject.productMarketingDescriptionTextBox.sendKeys(CommonMethods.getPropertieValue("productModel", "ShortProductDescription"));
		
	}
	
}
