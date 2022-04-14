package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ControlledTitleObject {
	
	@FindBy(xpath="//coral-tab-label[.='Controlled Title']")
	public WebElement controlledTitleTab;
	
	@FindBy(xpath="//coral-select[contains(@name,'controlledTitle')]")
	public WebElement controlledTitleDropDown;
	
	@FindBy(xpath="(//coral-select[contains(@name,'type')])[last()]")
	public WebElement typeDropDown;
	
	@FindBy(xpath="(//coral-icon[@icon='check'])[last()]")
	public WebElement doneIcon;
	
	@FindBy(css="div.controlledtitle")
	public WebElement controlledTitleComponent;
	
}
