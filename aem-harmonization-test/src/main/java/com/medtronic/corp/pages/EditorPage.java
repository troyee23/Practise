package com.medtronic.corp.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.CommonMethods;
import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.components.EditorHeader;
import com.medtronic.corp.pageobjects.EditorPageObjects;

public class EditorPage extends TestBase {

	EditorPageObjects _editorPageObjects = new EditorPageObjects();
	public EditorHeader editorHeader;

	public EditorPage(WebDriver driver) {
		editorHeader = new EditorHeader(driver);
		PageFactory.initElements(driver, _editorPageObjects);
	}

	public void publishPage() throws InterruptedException {
		editorHeader.publishPage();
	}

	public void openContentTree() {
		editorHeader.openContentTree();
	}

	public void enableEditMode() {
		editorHeader._editorHeaderObject.editButton.click();
	}

	public void addComponent(String componentName) throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.waitForElement(_editorPageObjects.dragComponentLabel);
		Thread.sleep(2000);
		_editorPageObjects.dragComponentsLabel.get(0).click();
		Thread.sleep(2000);
		CommonMethods.waitForElement(_editorPageObjects.addIcon);
		_editorPageObjects.addIcon.click();
		Thread.sleep(2000);
		try {
			switch (componentName.toLowerCase().trim()) {
			case "button":
				CommonMethods.waitForElement(_editorPageObjects.buttonComponentLabel);
				_editorPageObjects.buttonComponentLabel.click();
				break;
			case "container":
				CommonMethods.waitForElement(_editorPageObjects.containerComponentLabel);
				_editorPageObjects.containerComponentLabel.click();
				break;
			case "controlled title":
				CommonMethods.waitForElement(_editorPageObjects.controlledTitleComponentLabel);
				_editorPageObjects.controlledTitleComponentLabel.click();
				break;
			case "image":
				CommonMethods.waitForElement(_editorPageObjects.imageComponentLabel);
				_editorPageObjects.imageComponentLabel.click();
				break;
			case "separator":
				CommonMethods.waitForElement(_editorPageObjects.separatorComponentLabel);
				_editorPageObjects.separatorComponentLabel.click();
				break;
			case "teaser":
				CommonMethods.waitForElement(_editorPageObjects.teaserComponentLabel);
				_editorPageObjects.teaserComponentLabel.click();
				break;
			case "text":
				CommonMethods.waitForElement(_editorPageObjects.textComponentLabel);
				_editorPageObjects.textComponentLabel.click();
				break;
			case "title":
				CommonMethods.waitForElement(_editorPageObjects.titleComponentLabel);
				_editorPageObjects.titleComponentLabel.click();
				break;

			default:
				Assert.fail("component " + componentName + " is not valid");
				break;
			}
		} catch (NoSuchElementException e) {
			Assert.fail("component " + componentName + " can not be added in continer");
		}

	}

	public void configureComponent(String componentName) throws InterruptedException {
		switch (componentName.toLowerCase().trim()) {
		
		case "controlled title":
			CommonMethods.waitForElement(_editorPageObjects.contolledTitleEditableSection);
			_editorPageObjects.contolledTitleEditableSection.click();
			Thread.sleep(2000);
			_editorPageObjects.configureIcon.click();
			break;
			
		default:
			Assert.fail("component " + componentName + " is not valid");
			break;
		}
	}
	
	
	public void openConfigureDialog(String dataPath, int index){
		
		String configureXpath= "(//div[contains(@data-path,'"+dataPath+"')])["+index+"]";
		driver.findElement(By.xpath(configureXpath)).click();
		 _editorPageObjects.configureIcon.click();
		
		
	}
	
	public void editComponent(int containerIndex , String componentName) throws InterruptedException{
		 String containerXpath= "(//span[.='Container']/ancestor::coral-tree-item)["+containerIndex+"]";
		 String componentXpath = "//span[contains(text(),'"+componentName+"')]";
		 WebElement container = driver.findElement(By.xpath(containerXpath));
		 container.findElement(By.xpath(componentXpath)).click();
		 Thread.sleep(2000);
		 _editorPageObjects.configureIcon.click();
		 Thread.sleep(4000);
		
		
	}

}
