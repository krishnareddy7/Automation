package clearTrips;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	
public String travelData(String filePath,String sheet,int row,int cell) throws Throwable
{
	FileInputStream fis=new FileInputStream(filePath);
	 Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	return value;
}

public int getRowCout(String path, String sheet) throws Throwable {
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	int count = wb.getSheet(sheet).getLastRowNum();
	return count;
}
}