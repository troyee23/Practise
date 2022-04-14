package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemplatePageObjects {

	@FindBy(css="button.coral3-Button--primary")
	public WebElement nextButton;
	
}
