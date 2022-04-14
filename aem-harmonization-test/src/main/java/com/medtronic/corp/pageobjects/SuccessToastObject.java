package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessToastObject {

	
	@FindBy(xpath = "//coral-button-label[.='Done']")
	public WebElement doneButton;
	
	@FindBy(xpath = "//coral-button-label[.='Open']")
	public WebElement openButton;

}
