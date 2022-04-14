package com.medtronic.corp.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.medtronic.corp.pages.EditorPage;

public class CommonMethods extends TestBase {
	static EditorPage _editorPage = new EditorPage(driver);
	
	private static Properties properties;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public static String getPropertieValue(String fileName, String keyName) {
		properties = new Properties();
		try {
			fileName = fileName + ".properties";
			properties.load(CommonMethods.class.getClassLoader().getResourceAsStream(fileName));
		} catch (IOException ioex) {

		}
		return properties.getProperty(keyName);
	}

	public static boolean compareTwoList(List<String> first, List<String> second) {

		if (first.size() != second.size())
			return false;
		for (int i = 0; i < first.size(); i++) {
			if (second.contains(first.get(i)))
				continue;
			else
				return false;
		}

		return true;
	}

	public static String getPublishUrl() {
		String currentURL = driver.getCurrentUrl();
		int length = currentURL.length();
		String path = currentURL.substring(currentURL.indexOf(".html/") + 5, length);
		System.out.println("Path is " + path);
		String publish = ExecutionParametersManager.environment + "Publish";
		String publishUrl = CommonMethods.getPropertieValue("environment", publish) + path;
		System.out.println("PublishPath is " + publishUrl);
		return publishUrl;
	}

	public void scrollDownToPageBotton() {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

	public void scrollToElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static boolean isElementDisplay(WebElement element) {
		try {
			if (element.isDisplayed())
				return true;

		} catch (NoSuchElementException e) {
			return false;
		}

		return false;
	}

	public static void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void switchToNewTab() {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
	}
	
	
}
