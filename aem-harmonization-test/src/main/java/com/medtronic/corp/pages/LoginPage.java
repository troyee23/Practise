package com.medtronic.corp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.CommonMethods;
import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.LoginPageObjects;

public class LoginPage extends TestBase {

	LoginPageObjects _loginPageObjects = new LoginPageObjects();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, _loginPageObjects);

	}

	public boolean isLoginScreenDisplay() {
		if (_loginPageObjects.userName.isDisplayed())
			return true;
		else
			return false;
	}

	public SitesPage login() {
		_loginPageObjects.userName.sendKeys(CommonMethods.getPropertieValue("user", "username"));
		_loginPageObjects.password.sendKeys(CommonMethods.getPropertieValue("user", "password"));
		_loginPageObjects.signIn.click();
		return new SitesPage(driver);
	}

}
