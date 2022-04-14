package com.medtronic.corp.components;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.ExecutionParametersManager;
import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.HeroBannerPageObject;

import junit.framework.Assert;

public class HeroBanner extends TestBase {
	public HeroBannerPageObject heroBannerPageObject = new HeroBannerPageObject();

	String viewport = ExecutionParametersManager.viewPort;

	public HeroBanner(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, heroBannerPageObject);
	}

	
	public boolean verifyUI(String element){
		
		try{
			switch(element.toLowerCase().trim())
			{
			case "product image":
				return heroBannerPageObject.HeroImage.isDisplayed();
				
			case "product name":
				return heroBannerPageObject.productHeadingLabel.isDisplayed();
				
			case "product type":
				return heroBannerPageObject.productTypeLabel.isDisplayed();
				
			case "product description":
				return heroBannerPageObject.productDescriptionText.isDisplayed();
				
			case "order online":
				return heroBannerPageObject.orderOnlineButton.isDisplayed();
				
			case "share icon":
				return heroBannerPageObject.shareIcon.isDisplayed();
				
			case "isw":
				return heroBannerPageObject.iswSection.isDisplayed();
				
			default:
				Assert.fail("Element "+element.toLowerCase().trim()+" is not valid element on product model page");
			}
			
		}
		catch(NoSuchElementException e){
			Assert.fail("Element "+element.toLowerCase().trim()+" is not found on product model page");
		}
		
		return false;
		
	}
}
