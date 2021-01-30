package datadriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws Throwable {
		// read data from excel
		FileInputStream fis=new FileInputStream("./data/inputData.xlsx");
		//keep the file ready for reading purpose
	Workbook wb = WorkbookFactory.create(fis);
	//go to a particular sheet
	Sheet she = wb.getSheet("Sheet1");
	//go to a particular row 
	Row r = she.getRow(1);
	//go to a particular cell
	Cell ce = r.getCell(0);
	//get the String data
	String st = ce.getStringCellValue();
	//print it
	System.out.println(st);
	
	}

}
