package com.medtronic.corp.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.TemplatePageObjects;

public class Template extends TestBase{

	TemplatePageObjects _templatePageObjects = new TemplatePageObjects();
	
	public Template(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, _templatePageObjects);
		
	}
	
	public void selectTemplate(String templateName){
		By templateLocator = By.xpath("//coral-card-title[.='"+templateName+"']");
		driver.findElement(templateLocator).click();
		_templatePageObjects.nextButton.click();
	}
	
}
