package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedTabObject {

	
	@FindBy(xpath="//coral-tab-label[text()='Advanced']")
	public WebElement advancedTab;
	
	@FindBy(xpath = "//input[@name='./approvalCode']")
	public WebElement approvalCodeTextBox;

}
