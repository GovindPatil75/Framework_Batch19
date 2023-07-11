package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcleDataProvider {
	
	public XSSFWorkbook wb;
	public ExcleDataProvider() throws Exception {
		
	String path="C:\\Users\\Dell\\eclipse-workspace\\Framework_Batch19\\TestData\\Data.xlsx";
	FileInputStream file=new FileInputStream(path);
	wb=new XSSFWorkbook(file);
	
	}

	//String data
	public String getStringData_excel(String SheetName,int row,int cell) {
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		
	}
	
	
}
