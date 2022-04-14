package com.medtronic.corp.components;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.ResourcesPageObject;

import junit.framework.Assert;

public class Resources extends TestBase {
	public ResourcesPageObject resourcesPageObject = new ResourcesPageObject();

	public Resources(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, resourcesPageObject);
	}

	public void clickOnTitle(int index) {
		resourcesPageObject.resources.get(index).findElement(resourcesPageObject.title).click();
	}

	
	
	public void verifyResources() {
		boolean isImageDisplay = false;
		boolean isTitleDisplay = false;
		boolean isTextDisplay= false;
		boolean isDownlaodPropsDisplay= false;
		
		try {
			WebElement resource = resourcesPageObject.resources.get(0);
			isImageDisplay = resource.findElement(resourcesPageObject.image).isDisplayed();
			isTitleDisplay = resource.findElement(resourcesPageObject.title).isDisplayed();
			isTextDisplay = resource.findElement(resourcesPageObject.text).isDisplayed();
			isDownlaodPropsDisplay = resource.findElement(resourcesPageObject.downloadProps).isDisplayed();
		}catch(NoSuchElementException e){
		
			Assert.fail("Image/Title/Text/Download locators is not found on Resources section");
		}
		


		Assert.assertTrue(isImageDisplay);
		Assert.assertTrue(isTitleDisplay);
		Assert.assertTrue(isTextDisplay);
		Assert.assertTrue(isDownlaodPropsDisplay);
	}

}
