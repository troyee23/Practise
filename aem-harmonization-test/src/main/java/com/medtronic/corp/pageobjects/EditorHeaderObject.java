package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditorHeaderObject {

	@FindBy(xpath = "//button[.='Edit']")
	public WebElement editButton;

	@FindBy(xpath = "//coral-button-label[.='Preview']")
	public WebElement previewButton;

	@FindBy(css = "button#sidepanel-toggle-button")
	public WebElement sidePannelButton;

	@FindBy(css = "a#pageinfo-trigger")
	public WebElement pageInformationButton;
	
	@FindBy(css = "button[title='Publish Page']")
	public WebElement publishPageButton;
	
	@FindBy(xpath = "//coral-button-label[.='Publish']")
	public WebElement confirmPublishButton;
	
	@FindBy(css="coral-panel-content")
	public WebElement sidePanel;
	
	@FindBy(css = "coral-tab[title='Content Tree']")
	public WebElement contentTreeIcon;
	
	@FindBy(css="coral-panel-content div.editor-ContentTree")
	public WebElement contentTreePanel;
	
	@FindBy(xpath="(//button[.='Edit']/parent::coral-actionbar-item/following-sibling::coral-actionbar-item)[1]//coral-icon")
	public WebElement chevronDownIcon;
	
	@FindBy(xpath = "//coral-list-item-content[.='Edit']")
	public WebElement editOption;
	

	
	
}
