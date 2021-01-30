package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
	
    	public static void main(String[] args) throws Throwable {
    //  BaseTest bt=new BaseTest();
    	//	bt.openBrowser();
    		
    //		bt.Close();
    		//open the file in read mode
	  	FileInputStream fis=new FileInputStream("./data/inputData.xlsx");
//	  	System.out.println("started");
	  	Workbook wb = WorkbookFactory.create(fis);
	  	wb.getSheet("krishna").getRow(8).createCell(3).setCellValue("maana");
	  	
//	 	Properties p=new Properties();
	  	//open the file in write mode
	  	FileOutputStream fos=new FileOutputStream("./data/inputData.xlsx");
	  	//save the file
	  	wb.write(fos);
       System.out.println("written succesfully");
       
	}

}
