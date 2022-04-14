package com.medtronic.corp.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.ReferencePageObject;

public class Reference extends TestBase {
	public ReferencePageObject referencePageObject = new ReferencePageObject();

	public Reference(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, referencePageObject);
	}

	public String getReferenceText() {
		return referencePageObject.referenceSection.getText();
	}

	public boolean isReferenceSectionDisplay(){
		return referencePageObject.referenceSection.isDisplayed();
	}
}
