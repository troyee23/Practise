package com.medtronic.corp.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.HeaderPageObject;

public class Header extends TestBase {
	public HeaderPageObject headerPageObject = new HeaderPageObject();

	public Header(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, headerPageObject);
	}
	
	public void search(String text){
		headerPageObject.searchIcon.click();
		headerPageObject.searchTextBox.sendKeys(text);
		headerPageObject.searchButton.click();
	}

	public String getBreadcrumbText(){
		return headerPageObject.breadcrumb.getText();
		
		
	}
	
}
