package org.excelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {

	private static FileInputStream stream;
	private static XSSFWorkbook workbook;
	private static Row row;
	public static Map<String, String> excelData = new HashMap<String, String>();
	private static String key;
	private static String value;
	private Cell cell;
	private static String userDirectory = System.getProperty("user.dir");
	static XSSFSheet sheet;

	public static void excelReading() throws IOException {
		
		stream = new FileInputStream(userDirectory+"\\src\\test\\resources\\TestDataExcel\\TestDataXL.xlsx");
		workbook = new XSSFWorkbook(stream);
		sheet = workbook.getSheetAt(0);
		


		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			row = sheet.getRow(i);
			key = row.getCell(0).getStringCellValue();

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				row.getCell(j);
				Cell cell = row.getCell(j);

				switch (cell.getCellType()) {
				case NUMERIC:

					double numericValue = cell.getNumericCellValue();
					value = String.valueOf(numericValue);
					
					break;

				case STRING:
					
					value = cell.getStringCellValue();
					
					break;

				default:
					break;
				}

				excelData.put(key, value);
				
			}

		}
		
		System.out.println(excelData);

	}
	
	public static void main(String[] args) throws IOException {
		excelReading();
		excelData.get("FirstName");
	}

}
