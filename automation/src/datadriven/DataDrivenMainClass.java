package datadriven;

public class DataDrivenMainClass {
	public static void main(String []args) throws Throwable {
		FileLib flib=new FileLib();
		flib.setCellData("./data/inputData.xlsx", "Sheet1",6, 2, "Success");
	
//	int rc=flib.getRowCout("./data/input.xlsx", "Sheet1");
//	System.out.println(rc);
//	for(int i=0;i<=rc;i++)
//	{
//  String val=flib.getCellData("./data/inputData.xlsx","Sheet1", i, 0);	
//	System.out.println(val);	
//		
//	}
	
	}

}
