package com.medtronic.corp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditorPageObjects {
	
	@FindBy(xpath = "")
	public WebElement editIcon;
	
	@FindBy(xpath = "(//coral-icon[@icon='add'])[last()]")
	public WebElement addIcon;
	
	@FindBy(css = "div#EditableToolbar coral-icon[icon='wrench']")
	public WebElement configureIcon;
	
	@FindBy(xpath="(//div[@data-text='Drag components here'])[1]")
	public WebElement dragComponentLabel;
	
	@FindBy(xpath="//div[@data-text='Drag components here']")
	public List<WebElement> dragComponentsLabel;
	
	@FindBy(xpath = "//div[@title='ControlledTitle']")
	public WebElement contolledTitleEditableSection;
	
	@FindBy(xpath = "")
	public WebElement refrenceEditableSection;
	
	@FindBy(xpath="//coral-selectlist-item[.='Button']")
	public WebElement buttonComponentLabel;
	
	@FindBy(xpath="//coral-selectlist-item[.='Container']")
	public WebElement containerComponentLabel;
	
	@FindBy(xpath="//coral-selectlist-item[.='ControlledTitle']")
	public WebElement controlledTitleComponentLabel;
	
	@FindBy(xpath="//coral-selectlist-item[.='Image']")
	public WebElement imageComponentLabel;
	
	@FindBy(xpath="//coral-selectlist-item[.='Separator']")
	public WebElement separatorComponentLabel;
	
	@FindBy(xpath="//coral-selectlist-item[.='Teaser']")
	public WebElement teaserComponentLabel;
	
	@FindBy(xpath="//coral-selectlist-item[.='Text']")
	public WebElement textComponentLabel;
	
	@FindBy(xpath="//coral-selectlist-item[.='Title']")
	public WebElement titleComponentLabel;

	
}
