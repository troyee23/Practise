package com.medtronic.corp.components;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.CommonMethods;
import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.ControlledTitleObject;

import junit.framework.Assert;

public class ControlledTitleConfiguration extends TestBase {

	ControlledTitleObject _controlledTitleObject = new ControlledTitleObject();

	public ControlledTitleConfiguration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, _controlledTitleObject);
	}

	public void configureControlledTitle(String text, String type) throws InterruptedException {
		setControlledTitleText(text);
		setType(type);
		Thread.sleep(2000);
		_controlledTitleObject.doneIcon.click();
		Thread.sleep(2000);
	}

	@SuppressWarnings("deprecation")
	public void setControlledTitleText(String text) {
		By _text = By.xpath("//coral-selectlist-item[.='" + text + "']");
		try {
			CommonMethods.waitForElement(_controlledTitleObject.controlledTitleDropDown);
			_controlledTitleObject.controlledTitleDropDown.click();
			driver.findElement(_text).click();
		} catch (NoSuchElementException e) {
			e.getStackTrace();
			Assert.fail("Text " + text + " is not found on Controlled Title");
		}

	}

	@SuppressWarnings("deprecation")
	public void setType(String type) {
		By _text = By.xpath("//coral-selectlist-item[.='" + type + "']");
		try {
			_controlledTitleObject.typeDropDown.click();
			driver.findElement(_text).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Type " + type + " is not found on Controlled Title");
		}
	}
	
	public boolean isControlledTitleDisplay(){
		return _controlledTitleObject.controlledTitleComponent.isDisplayed();
	}

	public String getControlledTitleText(){
		return _controlledTitleObject.controlledTitleComponent.getText();
	}
	
	public String getControlledTitleType(){
		String retu=_controlledTitleObject.controlledTitleComponent.toString();
		return retu;
	}
}
