package testNg;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriveninTestNG {
@DataProvider(name="db1")	
public Object [][] dataDriven()
{
	Object [][] obj= new Object[3][2];
			
	obj[0][0]="admin1";
	obj[0][1]="manager1";
	obj[1][0]="admin2";
	obj[1][1]="manager2";
	obj[2][0]="admin3";
	obj[2][1]="manager3";

	return obj;

}
@Test(dataProvider="db1")
public void getClass(String un,String pwd)
{
Reporter.log(un, true);
Reporter.log(pwd, true);

}
}
