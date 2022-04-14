package com.medtronic.corp.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.OpenGraphTabObject;

public class OpenGraphTab extends TestBase {

	public OpenGraphTabObject _openGraphTabObject = new OpenGraphTabObject();

	public OpenGraphTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, _openGraphTabObject);
	}

	
	public void fillOpenGraphTab(){
		_openGraphTabObject.openGraphTab.click();
		_openGraphTabObject.openGraphTitleTextBox.sendKeys("OG Title");
		_openGraphTabObject.openGraphDescriptionTextBox.sendKeys("OG Description");
		_openGraphTabObject.openGraphImageTextBox.sendKeys("#");
	}
}
