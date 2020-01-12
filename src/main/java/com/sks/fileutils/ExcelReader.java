package com.sks.fileutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	class ExcelConstant
	{
		private final String pathTestData="C:\\Users\\dell\\eclipse-workspace\\SKSDataDrivenFrmwrk\\TestData";
		private final String fileTestData="TestDataSkvEcom.xlsx";
		
//		public String setPathTestData()
//		{
//			return pathTestData;
//		}
//		
//		public String setFileTestData()
//		{
//			return fileTestData;
//		}
	}
	
	
	private Workbook ExcelWorkBook;
	private Sheet ExcelWorkSheet;
	private XSSFSheet xssfSheet;
	private HSSFSheet hssfSheet;
	
	
	ExcelConstant ec = new ExcelConstant();
	
	public String excelFileExtension()
	{
		String fileExtensionName = ec.fileTestData.substring(ec.fileTestData.indexOf("."));
		return fileExtensionName;
	}
		
	public Workbook loadWorkBook()
	{
			
		try {
			File file = new File(ec.pathTestData+"\\"+ec.fileTestData);
			FileInputStream ExcelFile = new FileInputStream(file);
			
			//String fileExtensionName = ec.fileTestData.substring(ec.fileTestData.indexOf("."));
			String fileExtensionName = excelFileExtension();
			
			if(fileExtensionName.equals(".xlsx"))
			{
			    //If it is .xlsx file then create object of XSSFWorkbook class
				ExcelWorkBook = new XSSFWorkbook(ExcelFile);				
			}
			else if(fileExtensionName.equals(".xls"))
			{
				//If it is .xls file then create object of HSSFWorkbook class
				ExcelWorkBook = new HSSFWorkbook(ExcelFile);
			}
			else
			{
				System.out.println("Input File is not an Excel File. Hence, closing the file operation.");
				ExcelFile.close();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Test Data File not found at its location.Please correct the location of the Test Data file.\n");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("General Exception Occured with Test Data file while reading. Details below:\n");
			e.printStackTrace();
		}
		return ExcelWorkBook;
	}
	
	public Sheet getExcelWorkSheet(String excelSheetName,Workbook ExcelWorkBook)
	{
		String fileExtensionName=null;		
		fileExtensionName=excelFileExtension();
		
		if(fileExtensionName.equals(".xlsx"))
		{
			xssfSheet = (XSSFSheet) ExcelWorkBook.getSheet(excelSheetName);	
			ExcelWorkSheet=xssfSheet;
			
		}
		else if(fileExtensionName.equals(".xls"))
		{
			hssfSheet = (HSSFSheet) ExcelWorkBook.getSheet(excelSheetName);
			ExcelWorkSheet=hssfSheet;
		}
		else
		{
			System.out.println("Input File is not an Excel File.");
		}
		return ExcelWorkSheet;	
	}
}
