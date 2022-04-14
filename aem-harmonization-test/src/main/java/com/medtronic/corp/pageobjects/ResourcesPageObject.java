package com.medtronic.corp.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResourcesPageObject {

	
	@FindBy(xpath = "//div[@id='Resources']")
	public WebElement resourcesSection;
	
	@FindBy(css ="#Resources .resource.download")
	public List<WebElement> resources;
	
	public By image = By.cssSelector(".image a");
	
	public By title = By.cssSelector(".title a");
	
	public By text = By.cssSelector(".text  p");
	
	public By downloadProps = By.cssSelector(".download-props");
}
