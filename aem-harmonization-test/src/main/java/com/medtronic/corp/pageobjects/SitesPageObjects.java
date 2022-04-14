package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SitesPageObjects {

	@FindBy(css = "button.granite-collection-create")
	public WebElement createButton;
	
	@FindBy(css = "a.cq-siteadmin-admin-createpage")
	public WebElement createPageOption;
	
	@FindBy(xpath = "//coral-button-label[.='Create']")
	public WebElement createPageButton;

}
