package com.medtronic.corp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterPageObject {

	@FindBy(css = ".filter-list-sec")
	public WebElement filterSection;

	@FindBy(css = ".filter-list .text-preset-6")
	public WebElement filterType;

	@FindBy(css = ".filter-Item")
	public List<WebElement> filterItem;
	
	@FindBy(css=".product-filter")
	public WebElement filterSectionMobileView;
	
	@FindBy(css=".product-filter .button.btn-alternate.mobile-only")
	public WebElement filterButton;
	
	@FindBy(css=".filter-list-sec .button.mobile-only")
	public WebElement applyButton;
	
	

}
