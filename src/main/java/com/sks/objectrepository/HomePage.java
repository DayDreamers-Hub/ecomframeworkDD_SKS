package com.sks.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	
	HomePageObjectLocators ho = new HomePageObjectLocators();
	public WebElement btnLoginHome(WebDriver driver)
	{
		WebElement btnLogin = driver.findElement(ho.getLoginButtonLocator());
		return btnLogin;
	}

}
