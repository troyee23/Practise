package com.medtronic.corp.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.AdvancedTabObject;

public class AdvancedTab extends TestBase {

	public AdvancedTabObject advancedTabObject = new AdvancedTabObject();

	public AdvancedTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, advancedTabObject);
	}

}
