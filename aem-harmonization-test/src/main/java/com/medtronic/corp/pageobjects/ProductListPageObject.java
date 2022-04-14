package com.medtronic.corp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListPageObject {

	@FindBy(css = ".product-list")
	public WebElement productList;

	@FindBy(xpath = "//div[@class='product-list']/div[contains(@class,'text-preset')]")
	public WebElement productViewingText;
	
	@FindBy(css = ".pagination-text")
	public WebElement paginationText;
	
	@FindBy(css = ".icon-chevron-left")
	public WebElement leftPaginationButton;
	
	@FindBy(css = ".icon-chevron-right")
	public WebElement rightPaginationButton;
	
	@FindBy(css = ".product-list .cmp-list .list-title")
	public List<WebElement> productNames;
	
	
	@FindBy(css = ".product-list .cmp-list__item")
	public List<WebElement> productTile;
	
	@FindBy(css=".active-filters .flist")
	public List<WebElement> activeFilters;
	
	@FindBy(css=".product-list .list-content a")
	public List<WebElement> productNamesLink;
	
	

}
