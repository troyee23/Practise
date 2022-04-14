package com.medtronic.corp.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.CommonMethods;
import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.EditorHeaderObject;

public class EditorHeader extends TestBase {

	public EditorHeaderObject _editorHeaderObject = new EditorHeaderObject();

	public EditorHeader(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, _editorHeaderObject);
	}
	
	public void publishPage() throws InterruptedException{
		_editorHeaderObject.pageInformationButton.click();
		Thread.sleep(2000);
		_editorHeaderObject.publishPageButton.click();
		Thread.sleep(5000);
		if(CommonMethods.isElementDisplay(_editorHeaderObject.confirmPublishButton))
			_editorHeaderObject.confirmPublishButton.click();
			
	}
	
	
	public void opneSidePanel(){
		if(!_editorHeaderObject.sidePanel.isDisplayed())
			_editorHeaderObject.sidePannelButton.click();
		
	}

	public void openContentTree(){
		opneSidePanel();
		_editorHeaderObject.contentTreeIcon.click();
	}
	
	public void enableEditMode() throws InterruptedException{
		CommonMethods.waitForElement(_editorHeaderObject.chevronDownIcon);
		Thread.sleep(4000);
		_editorHeaderObject.chevronDownIcon.click();
		Thread.sleep(4000);
		_editorHeaderObject.editOption.click();
	}
	
}
