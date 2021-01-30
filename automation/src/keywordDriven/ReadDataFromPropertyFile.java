package keywordDriven;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {
		//open the file in read mode
		FileInputStream fis=new FileInputStream("./data/data.properties");
		//create an object of properties class
		Properties pro=new Properties();
		//keep the file ready for reading
		pro.load(fis);
		// give the key and gets its value
		//String value=prop.getproperty("customerName");
		//Give the key and gets its value
		//But key is not present then gets default value
		String value = pro.getProperty("username", "incorrect key");
		System.out.println(pro.getProperty("ixrkjk"));
		System.out.println(value);
	}
}
