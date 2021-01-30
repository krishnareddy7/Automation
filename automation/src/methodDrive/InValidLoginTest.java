package methodDrive;

public class InValidLoginTest extends BaseTest{

	public static void main(String[] args) throws Throwable  {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		FileLib flib=new FileLib();
		int rc=flib.getRowCout(EXCEL_PATH, "Invalid");
		for (int i=1;i<=rc;i++) {
			
		String un = flib.getCellData(EXCEL_PATH, "invalid", i, 0); 
		
		String pwd = flib.getCellData(EXCEL_PATH, "invalid", i, 1);
		LoginPage lp=new LoginPage(driver);
		lp.login(un,pwd);
		Thread.sleep(1000);
		}
		}
	
}