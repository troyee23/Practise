package com.medtronic.corp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPageObject {

	@FindBy(className = "icon-search")
	public WebElement searchIcon;
	
	@FindBy(className=".CoveoSearchbox .magic-box-input input")
	public WebElement searchTextBox;
	
	@FindBy(className=".search-close")
	public WebElement searchCloseIcon;
	
	@FindBy(className=".CoveoSearchButton")
	public WebElement searchButton;
	
	@FindBy(className=".cmp-navigation")
	public WebElement navigationBar;
	
	@FindBy(xpath="//ul[@class='cmp-navigation--group-level-0']/li/a[@class='cmp-navigation--item-link']")
	public List<WebElement> navigationItems;
	
	@FindBy(xpath="//ul[@class='cmp-navigation--group-level-0']/li/a[@class='cmp-navigation--item-link has-submenu']")
	public List<WebElement> subMenuNavigationItems;

	@FindBy(css="nav.breadcrumb")
	public WebElement breadcrumb;
	
}
