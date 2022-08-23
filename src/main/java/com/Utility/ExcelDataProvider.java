package com.Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		String path="C:\\Users\\Dell\\eclipse-workspace\\Framework_2\\Test_Data01\\Test_Data01.xlsx";
		FileInputStream fis1=new FileInputStream(path);
		wb=new XSSFWorkbook(fis1);
	}
public String getStringData(String SheetName,int row,int cell) {
	return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
}
}
