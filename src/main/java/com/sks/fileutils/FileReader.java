package com.sks.fileutils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.ini4j.Wini;

public class FileReader 
{
	private String URL;
	
	public String getURL()
	{
	
		try
		{
	        Wini ini = new Wini(new File("C:\\Users\\dell\\eclipse-workspace\\SKSDataDrivenFrmwrk\\Resources\\Config.ini"));
	        URL=ini.get("URL", "URL");
		}   
		catch(FileNotFoundException exFileNotFound)
		{
			System.out.println("Config.ini is misplaced or not at the location specified.\n"+exFileNotFound.getStackTrace());
		}
	    catch(IOException exIO)
		{
	    	System.out.println("IO Exception Occured while reading Config.ini.\n"+exIO.getStackTrace());
		}
		catch(Exception e)
		{
	    	System.out.println("Exception Occured while reading Config.ini.\n"+e.getStackTrace());
		}		
	
	return URL;
	}

}
