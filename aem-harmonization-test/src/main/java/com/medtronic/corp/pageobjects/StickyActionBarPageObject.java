package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StickyActionBarPageObject {

	@FindBy(xpath = "(//div[contains(@class,'stickyactionbar')]//ul/li)[1]")
	public WebElement orderingButton;

	@FindBy(xpath = "(//div[contains(@class,'stickyactionbar')]//ul/li)[2]")
	public WebElement configurationsButton;

	@FindBy(xpath = "(//div[contains(@class,'stickyactionbar')]//ul/li)[3]")
	public WebElement resourcesButton;

	@FindBy(xpath = "(//div[contains(@class,'stickyactionbar')]//ul/li)[4]")
	public WebElement backToTopButton;

	
	

}
