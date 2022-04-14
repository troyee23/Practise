package com.medtronic.corp.pages;

import org.openqa.selenium.WebDriver;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.components.Filter;
import com.medtronic.corp.components.ProductList;

public class ProductGroupPage extends TestBase {

	public Filter filter;
	public ProductList productList;

	public ProductGroupPage(WebDriver driver) {
		this.driver = driver;
		filter = new Filter(driver);
		productList = new ProductList(driver);
	}
	
	public boolean verifyComponentDisplay(String component){
		
		switch(component.toLowerCase().trim()){
		
		case "filter":
			return filter.isFilterDisplay();
			
		case "model list":
			return productList.isModelListDisplay();
		
		default:
			return false;
		}
		
	}

}
