package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	@FindBy(css = "input#username")
	public WebElement userName;

	@FindBy(css = "input#password")
	public WebElement password;

	@FindBy(css = "button#submit-button")
	public WebElement signIn;
}
