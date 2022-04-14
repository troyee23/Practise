package com.medtronic.corp.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class TestBase {

	public static WebDriver driver;
	static String env = ExecutionParametersManager.environment+"Auth";
	static String url = CommonMethods.getPropertieValue("environment", env);
	 private static String OS = System.getProperty("os.name").toLowerCase();
	 

	static {
		if(OS.indexOf("win") >= 0){
			 System.setProperty("webdriver.chrome.driver","");  
			 
		}
		
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver = new ChromeDriver(capability);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}

}