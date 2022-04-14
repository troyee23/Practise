package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicTabObject {
	
	@FindBy(xpath="//coral-tab-label[.='Basic']")
	public WebElement basicTab;
	
	@FindBy(xpath="//input[@data-cq-msm-lockable='jcr:title']")
	public WebElement titleTextBox;
	
	@FindBy(xpath="//input[@name='pageName']")
	public WebElement nameTextBox;
	
	@FindBy(xpath="//input[@data-cq-msm-lockable='pageTitle']")
	public WebElement pageTitleTextBox;
	
	@FindBy(xpath="//input[@data-cq-msm-lockable='navTitle']")
	public WebElement navigationTitleTextBox;
	
	@FindBy(xpath="//textarea[@data-cq-msm-lockable='jcr:description']")
	public WebElement descriptionTextBox;
	
	
}
