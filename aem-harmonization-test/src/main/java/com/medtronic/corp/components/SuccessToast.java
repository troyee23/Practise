package com.medtronic.corp.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.CommonMethods;
import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.BasicTabObject;
import com.medtronic.corp.pageobjects.SuccessToastObject;

public class SuccessToast extends TestBase {

	public SuccessToastObject _successToastObject = new SuccessToastObject();

	public SuccessToast(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, _successToastObject);
	}
	
	public void clickOnOpen(){
		_successToastObject.openButton.click();
	}
	
	public void clickOnDone(){
		_successToastObject.doneButton.click();
	}


}
