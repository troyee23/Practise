package com.medtronic.corp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImageListPageObject {

	@FindBy(xpath = "(//div[@class='image-list list'])[last()]")
	public WebElement imageList;

	@FindBy(css = ".slide-arrow .prev")
	public WebElement previousSlidArrow;

	@FindBy(css = ".slide-arrow .next")
	public WebElement nextSlidArrow;
	
	@FindBy(css=".cmp-list__item .list-content .list-title a")
	public List<WebElement> productNames;

}
