package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo extends Annotations
{
	@Test
	public void sun()
	{
		Reporter.log("this is sun method", true);
		Remo r=new Remo();
		r.gun();
		r.run();
				
	}

}
