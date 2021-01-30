package methodDrive;

public class ValidLoginTest extends BaseTest {
	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
	FileLib flib=new FileLib();
	String un = flib.getpropKeyValue(PROP_PATH, "username");
	String pwd = flib.getpropKeyValue(PROP_PATH, "password");
	//open the browser, enter the test URL
	bt.openBrowser();
	
	LoginPage lp=new LoginPage(driver);
	//login to application
	lp.login(un, pwd);
	
	}

}
