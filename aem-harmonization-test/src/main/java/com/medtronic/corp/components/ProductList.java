package com.medtronic.corp.components;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.ProductListPageObject;
import com.medtronic.corp.pages.ProductModelPage;

public class ProductList extends TestBase {
	public ProductListPageObject productListObject = new ProductListPageObject();

	public ProductList(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, productListObject);
	}

	public boolean isModelListDisplay() {
		try {
			return (productListObject.productList.isDisplayed());
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public int getProductCount() {
		String viewingText = productListObject.productViewingText.getText();
		int sepPos = viewingText.lastIndexOf(" ");
		String subViewingText = viewingText.substring(0, sepPos);
		int sepPos2 = subViewingText.lastIndexOf(" ");
		return Integer.parseInt(subViewingText.substring(sepPos2 + 1, subViewingText.length()));
	}

	public int numberOfProductDisplayOnPage() {
		String viewingText = productListObject.productViewingText.getText();
		System.out.println("Viewing text " + viewingText);
		System.out.println("Output1 " + viewingText.split(" ")[1]);
		System.out.println("Output2 " + viewingText.split(" ")[1].split("-")[1]);
		return Integer.parseInt(viewingText.split(" ")[1].split("-")[1]);
	}

	public List<String> getActiveFilters() {

		List<String> activerFilters = new ArrayList<String>();
		for (int i = 0; i < productListObject.activeFilters.size(); i++) {
			activerFilters.add(productListObject.activeFilters.get(i).getText());
		}
		return activerFilters;
	}

	public int productCountOnPage() {
		return productListObject.productTile.size();
	}

	public String getFirstProductName() {
		return productListObject.productNames.get(0).getText();
	}

	public String getProductName(int index) {
		return productListObject.productNames.get(index).getText();
	}
	
	public ProductModelPage clickOnFistProduct(){
		productListObject.productNamesLink.get(0).click();
		return new ProductModelPage(driver);
	}

	public List<String> getAllProductName() throws InterruptedException {
		List<String> productNames = new ArrayList<String>();
		int totalProducts = getProductCount();
		int i = 0;

		while (i < totalProducts) {
			int numberOfProductOnPage = productCountOnPage();
			for (int j = 0; j < numberOfProductOnPage; j++) {
				try {
					productNames.add(getProductName(j));
					i++;
				} catch (IndexOutOfBoundsException e) {
				}
			}
			try {
				if (productListObject.rightPaginationButton.isDisplayed()) {
					productListObject.rightPaginationButton.click();
					Thread.sleep(2000);
				}
			} catch (NoSuchElementException e) {

			}
		}
		return productNames;

	}

}
