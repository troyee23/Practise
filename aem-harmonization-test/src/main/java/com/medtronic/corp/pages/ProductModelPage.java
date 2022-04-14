package com.medtronic.corp.pages;

import org.openqa.selenium.WebDriver;

import com.medtronic.corp.base.CommonMethods;
import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.components.ControlledTitleConfiguration;
import com.medtronic.corp.components.HeroBanner;
import com.medtronic.corp.components.Reference;
import com.medtronic.corp.components.RelatedProducts;
import com.medtronic.corp.components.Resources;
import com.medtronic.corp.components.StickyActionBar;

public class ProductModelPage extends TestBase {

	public HeroBanner heroBanner;
	public StickyActionBar stickyActionBar;
	public RelatedProducts relatedProducts;
	public Reference reference;
	public Resources resources;
	public ControlledTitleConfiguration controlledTitle;

	public ProductModelPage(WebDriver driver) {
		this.driver = driver;
		heroBanner = new HeroBanner(driver);
		stickyActionBar= new StickyActionBar(driver);
		relatedProducts= new RelatedProducts(driver);
		reference = new Reference(driver);
		resources = new Resources(driver);
		controlledTitle = new ControlledTitleConfiguration(driver);
	}

	public boolean isProductModelPageDisplay() {
		return heroBanner.verifyUI("product name");
	}

	public boolean verifyComponentDisplay(String component) {
		return heroBanner.verifyUI(component);

	}
	
	public String getSnackBarText(){
		return heroBanner.heroBannerPageObject.snackBar.getText();
	}
	
	public void clickOnShareIcon(){
	 new CommonMethods().scrollToElement(heroBanner.heroBannerPageObject.shareIcon);
	 heroBanner.heroBannerPageObject.shareIcon.click();
	}
}
