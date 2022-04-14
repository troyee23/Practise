package com.medtronic.corp.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.StickyActionBarPageObject;

public class StickyActionBar extends TestBase {
	public StickyActionBarPageObject stickyActionBarPageObject = new StickyActionBarPageObject();

	public StickyActionBar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, stickyActionBarPageObject);
	}

	public void clickOnOrdering() {
		stickyActionBarPageObject.orderingButton.click();
	}

	public void clickOnConfigurations() {
		stickyActionBarPageObject.configurationsButton.click();
	}

	public void clickOnResources() {
		stickyActionBarPageObject.resourcesButton.click();
	}

	public void clickOnBackToTop() {
		stickyActionBarPageObject.backToTopButton.click();

	}
}
