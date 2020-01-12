package com.sks.commonutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.sks.fileutils.FileReader;

public class Initialization 
{
	public WebDriver loadBrowser(String browserName,WebDriver driver)
	{
		//WebDriver driver=null; //Should I use this local variable here or get the driver variable as parameter of function?
		browserName=browserName.toLowerCase();
		switch(browserName)
		{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SKSDataDrivenFrmwrk\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\eclipse-workspace\\SKSDataDrivenFrmwrk\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver", "C:\\Users\\dell\\eclipse-workspace\\SKSDataDrivenFrmwrk\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
			case "msedge":
				System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\eclipse-workspace\\SKSDataDrivenFrmwrk\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				break;	
			default:
				System.out.println("Framework Does Not Support This Browser. Please choose among following Browsers\n");
				System.out.println("Chrome\nFirefox\nIE\nMSEdge");
				break;
		}
		return driver;
				
	}
	
	public void loadURL(WebDriver driver)
	{
		FileReader readFile = new FileReader();
		driver.get(readFile.getURL());
	}
	
}
