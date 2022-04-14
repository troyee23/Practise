package com.medtronic.corp.components;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.ImageListPageObject;

public class ImageList extends TestBase{
	
	public ImageListPageObject imageListPageObject = new ImageListPageObject();
	
	public ImageList(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, imageListPageObject);
	}
	
	public int productCountOnPage() {
		return imageListPageObject.productNames.size();
	}

	public String getFirstProductName() {
		return imageListPageObject.productNames.get(0).getText();
	}

	public String getProductName(int index) {
		return imageListPageObject.productNames.get(index).getText();
	}
	
	public List<String> getProductNames(){
		List<String> productNames = new ArrayList<String>();
		int totalProducts=imageListPageObject.productNames.size();
		 for(int i =0;i<totalProducts; i++){
			 productNames.add(imageListPageObject.productNames.get(i).getText());
		 }	
		 return productNames;
	}
	
	public void clickOnFirstProduct(){
		imageListPageObject.productNames.get(0).click();
	}

}
