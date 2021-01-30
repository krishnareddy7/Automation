package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getCellData(String path,String sheet,int row,int cell) throws Throwable
	{
	
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
	String cellvalue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	return cellvalue;
	}
	
	public void setCellData(String path,String sheet,int row,int cell,String value) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(value);
		 FileOutputStream fos=new FileOutputStream(path);
		 wb.write(fos);
				
	}
public int getRowCout(String path,String sheet) throws Throwable 
{
	FileInputStream fis= new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	int count = wb.getSheet(sheet).getLastRowNum();
	return count;
	
}


}
