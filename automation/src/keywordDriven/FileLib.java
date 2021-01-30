package keywordDriven;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {

	public String getpropKeyValue(String path,String key) throws Throwable {
		
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key, "enter valid cred");
		return value;
	}
}
