package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReferencePageObject {

	@FindBy(css = ".reference p b")
	public WebElement referenceLabel;
	
	@FindBy(css = ".reference")
	public WebElement referenceSection;
	

}
