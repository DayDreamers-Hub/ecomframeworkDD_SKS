package com.sks.fileutils;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	private XSSFRow xRow;
	private HSSFRow hRow;
	
	public int getRowNumber(Workbook ExcelWorkBook,Sheet ExcelWorkSheet)
	{
		return 0;		
	}
	
	public int getTotalOfRowNumbers(String fileExtensionName, Sheet ExcelWorkSheet)
	{
		int totalOfRowNumbers = 0;
		
		if(fileExtensionName.equals(".xlsx"))
		{
			XSSFSheet sheet = workbook.getSheet("Sheet");
		    totalOfRowNumbers=xRow.getRowNum();
		}
		else if(fileExtensionName.equals(".xls"))
		{
			//If it is .xls file then create object of HSSFWorkbook class
			totalOfRowNumbers=hRow.getRowNum();
		}
		else
		{
			System.out.println("Unsupported Test Data File.");
		}
		return totalOfRowNumbers;
	}
	
	public int getTotalOfColumnNumbers(String fileExtensionName)
	{
		int totalOfColumnNumbers = 0;
		
		if(fileExtensionName.equals(".xlsx"))
		{
			totalOfColumnNumbers=hRow.getRowNum();
		}
		else if(fileExtensionName.equals(".xls"))
		{
			//If it is .xls file then create object of HSSFWorkbook class
			totalOfColumnNumbers=hRow.getRowNum();
		}
		else
		{
			System.out.println("Unsupported Test Data File.");
		}
		return totalOfColumnNumbers;
	}
	
}
