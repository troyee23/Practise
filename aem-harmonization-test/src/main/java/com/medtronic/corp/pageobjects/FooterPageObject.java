package com.medtronic.corp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPageObject {

	@FindBy(className = "a-code")
	public WebElement approvalCodeLabel;

	@FindBy(xpath = "//footer//h6[text()='Patients and Caregivers']")
	public WebElement patientsAndCaregiversLabel;

	@FindBy(xpath = "//footer//h6[text()='HEALTHCARE PROFESSIONALS']")
	public WebElement healthcareProfessionalsLabel;

	@FindBy(xpath = "//footer//h6[text()='ABOUT MEDTRONIC']")
	public WebElement aboutMedtronicLabel;

	@FindBy(xpath = "//footer//h6[text()='TRANSFORMING HEALTHCARE']")
	public WebElement transformingHealthcareLabel;

	@FindBy(className = "icon-facebook")
	public WebElement faceBookIcon;

	@FindBy(className = "icon-linkedin")
	public WebElement linkedinIcon;

	@FindBy(className = "icon-twitter")
	public WebElement twitterIcon;

	@FindBy(className = "icon-youtube")
	public WebElement youtubeIcon;

	@FindBy(className = "mdt-footer-copyright")
	public WebElement copyrightLabel;

}
