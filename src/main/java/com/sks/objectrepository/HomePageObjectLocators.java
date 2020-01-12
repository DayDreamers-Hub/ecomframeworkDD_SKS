package com.sks.objectrepository;

import org.openqa.selenium.By;

public class HomePageObjectLocators 
{
	private String btnLoginLocator="menu-title d-lg-flex pl-1";
	
	public By getLoginButtonLocator()
	{
		return By.className(btnLoginLocator);
	}

}
