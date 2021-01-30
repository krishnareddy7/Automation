package com.actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This generic class is used to handle files
 * @author krishna
 *
 */
public class FileLib {
	/**
	 * This generic reusable method is used to read Data from property files
	 * @param path
	 * @param key
	 * @return value
	 * @throws Throwable
	 */

	public String getpropKeyValue(String path, String key) throws Throwable {

		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key, "enter valid cred");
		return value;
	}

	/**
	 * This generic reusable method is used to read Data from excel file
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return cellvalue
	 * @throws Throwable
	 */
	
	
	public String getCellData(String path, String sheet, int row, int cell) throws Throwable {

		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String cellvalue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return cellvalue;
	}

	
	/**
	 * This generic reusable method is used to write the data into the excel file 
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param value
	 * @throws Throwable
	 */
	public void setCellData(String path, String sheet, int row, int cell, String value) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);

	}
/**
 * This generic reusable methods is used to get the filled rows cost
 * @param path
 * @param sheet
 * @return count
 * @throws Throwable
 */
	public int getRowCout(String path, String sheet) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int count = wb.getSheet(sheet).getLastRowNum();
		return count;

	}

}
