package com.medtronic.corp.components;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.medtronic.corp.base.TestBase;
import com.medtronic.corp.pageobjects.FooterPageObject;

import junit.framework.Assert;

public class Footer extends TestBase {
	public FooterPageObject footerPageObject = new FooterPageObject();

	public Footer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, footerPageObject);
	}

	public void verifyGridColumnLabel(String labelName) {

		String label = labelName.toLowerCase().trim();
		try {
			switch (label) {

			case "patients and caregivers":
				Assert.assertTrue(footerPageObject.patientsAndCaregiversLabel.isDisplayed());
				break;

			case "healthcare professionals":
				Assert.assertTrue(footerPageObject.healthcareProfessionalsLabel.isDisplayed());
				break;

			case "about medtronic":
				Assert.assertTrue(footerPageObject.healthcareProfessionalsLabel.isDisplayed());
				break;

			case "transforming healthcare":
				Assert.assertTrue(footerPageObject.transformingHealthcareLabel.isDisplayed());
				break;

			default:
				Assert.fail("Label " + label + " is not a valid grid column on footer");
				break;

			}
		} catch (NoSuchElementException e) {
			Assert.fail("Lable " + label + "is not found at grid column on footer ");
		}

	}

	public void verifySocialLink(String linkName) {

		String link = linkName.toLowerCase().trim();
		try {
			switch (link) {

			case "facebook":
				Assert.assertTrue(footerPageObject.faceBookIcon.isDisplayed());
				break;

			case "youtube":
				Assert.assertTrue(footerPageObject.youtubeIcon.isDisplayed());
				break;

			case "linkdin":
				Assert.assertTrue(footerPageObject.linkedinIcon.isDisplayed());
				break;

			case "twitter":
				Assert.assertTrue(footerPageObject.twitterIcon.isDisplayed());
				break;

			default:
				Assert.fail("Social Link " + link + " is not a valid link on footer");
				break;

			}
		} catch (NoSuchElementException e) {
			Assert.fail("Social Link " + link + "is not found on footer ");
		}

	}
}
