package hydrid;

import com.actitime.genericLib.FileLib;

import methodDrive.LoginPage;

public class ValidLoginTest  extends BaseTest{

	public void LoginTEst()
	{
		BaseTest bt =new BaseTest();
		bt.openBrowser();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		FileLib flib=new FileLib();
		LoginPage lp=new LoginPage(driver);
		lp.login(flib.getpropKeyValue(PROP_PATH, "username"),(flib.getpropKeyValue(PROP_PATH, "password");
		wlib.waitForPageTile(flib.getpropKeyValue(PROP_PATH, "homepage"));
		wlib.verify(wlib.getPageTitle(), flib.getpropKeyValue(PROP_PATH, "homepage"), "Home page");
	}
}
