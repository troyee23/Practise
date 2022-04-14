package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeroBannerPageObject {

	@FindBy(css = ".product-heading h1")
	public WebElement productHeadingLabel;

	@FindBy(css = ".product-image")
	public WebElement HeroImage;

	@FindBy(css = ".product-heading h4")
	public WebElement productTypeLabel;

	@FindBy(css = ".product-detail p")
	public WebElement productDescriptionText;

	@FindBy(css = ".productcalltoaction")
	public WebElement callToActionButton;

	@FindBy(xpath = "//div[contains(@class,'productcalltoaction')]//div[@class='button ']")
	public WebElement orderOnlineButton;

	@FindBy(xpath = "//div[contains(@class,'productcalltoaction')]//div[@class='button btn-alternate']")
	public WebElement contactARepresentativeButton;

	@FindBy(css = ".sharecta .icon-share")
	public WebElement shareIcon;

	@FindBy(css = ".sharecta .product-model-isw")
	public WebElement iswSection;

	@FindBy(css = ".sharecta .product-model-isw .icon-caution")
	public WebElement iswIcon;

	@FindBy(css = ".sharecta .product-model-isw .vertical-middle")
	public WebElement iswText;

	@FindBy(css = ".snackbar")
	public WebElement snackBar;
}
