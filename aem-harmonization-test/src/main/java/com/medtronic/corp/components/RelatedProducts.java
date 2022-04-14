package com.medtronic.corp.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.medtronic.corp.base.TestBase;

public class RelatedProducts extends TestBase {

	public ImageList imageList;
	By titleLocator = By.xpath("//div[@class='title']//h3[.='Related Products']");

	public WebElement title;

	public RelatedProducts(WebDriver driver) {
		this.driver = driver;
		imageList = new ImageList(driver);
	}

	public boolean isRelatedProductsDisplay() {
		title=driver.findElement(titleLocator);
		return title.isDisplayed() && imageList.imageListPageObject.nextSlidArrow.isDisplayed()
				&& imageList.imageListPageObject.imageList.isDisplayed();
	}

	public boolean isProdutsDisplayInAscendingOrder() {
		
		List<String> productNames=imageList.getProductNames();
		List<String> tmp = new ArrayList<String>(productNames);
		Collections.sort(tmp);
		return tmp.equals(productNames);

	}
}
