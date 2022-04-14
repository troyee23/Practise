package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductModelTabObject {

	@FindBy(xpath = "//coral-tab-label[.='Product Model']")
	public WebElement productModelTab;

	@FindBy(xpath = "//foundation-autocomplete[@data-cq-msm-lockable='productTag']//input")
	public WebElement productModelTagTextBox;

	@FindBy(xpath = "//span[@data-cq-msm-lockable='productImage']//input")
	public WebElement productImageTextBox;

	@FindBy(xpath = "//textarea[@data-cq-msm-lockable='productDescription']")
	public WebElement productMarketingDescriptionTextBox;

	@FindBy(xpath = "//textarea[@data-cq-msm-lockable='additionalProductDescription']")
	public WebElement additionalProductMarketingDescriptionTextBox;

}
