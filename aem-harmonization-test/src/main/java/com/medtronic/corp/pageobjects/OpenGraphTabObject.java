package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenGraphTabObject {
	
	
	@FindBy(xpath="//coral-tab-label[text()='Open Graph Elements']")
	public WebElement openGraphTab;
	
	@FindBy(xpath="//input[@data-cq-msm-lockable='ogTitle']")
	public WebElement openGraphTitleTextBox;	
	
	@FindBy(xpath="//input[@data-cq-msm-lockable='ogDescription']")
	public WebElement openGraphDescriptionTextBox;
	
	@FindBy(xpath="//input[@name='./ogImage']")
	public WebElement openGraphImageTextBox;
	
	
	
}
