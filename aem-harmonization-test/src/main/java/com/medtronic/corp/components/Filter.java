package com.medtronic.corp.components;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.ExecutionParametersManager;
import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.FilterPageObject;

import junit.framework.Assert;

public class Filter extends TestBase {
	public FilterPageObject filterPageObject = new FilterPageObject();

	String viewport = ExecutionParametersManager.viewPort;

	public Filter(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, filterPageObject);
	}

	public boolean isFilterDisplay() {
		try {
			if (viewport.equals("ipad") || viewport.equals("iphone")) {
				if (filterPageObject.filterSectionMobileView.isDisplayed())
					return true;
			}

			if (filterPageObject.filterSection.isDisplayed())
				return true;
			else
				return false;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public void applyFilter(String filterName) throws InterruptedException {
		String fillterXpath = "//label/span[text()='" + filterName + "']";
		
		if (viewport.equals("ipad") || viewport.equals("iphone")) {
			filterPageObject.filterButton.click();
			Thread.sleep(2000);
		}
		try {	
			driver.findElement(By.xpath(fillterXpath)).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Filter " + filterName + " is not valid filter OR not display in filter section");
		}
		if (viewport.equals("ipad") || viewport.equals("iphone")) {
			filterPageObject.applyButton.click();
			Thread.sleep(2000);
		}

	}

}
