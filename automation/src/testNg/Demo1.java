package testNg;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void run()
	{
		
		System.out.println("i am console vala msg");
		Reporter.log("krishna", true);
		Reporter.log("i am reporter wala ", false);
	}
}
