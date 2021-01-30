package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GropingExecutiom {
@Test(groups ="smokegrp")
	public void Smoke1()
	{
	Reporter.log("smoketest1", true);
	}
@Test(groups ="functionalgrp")
	public void Functional1()
	{
		Reporter.log("functionaltest1", true);
	}
@Test(groups ="integrationgrp")
	public void Integration1()
	{
		Reporter.log("intergrationtest1", true);
	}
@Test(groups ="systemgrp")
	public void System1 ()
	{
		Reporter.log("Systemtest1", true);
	}
@Test(groups ="smokegrp")
	public void Smoke3()
	{
		Reporter.log("smoketest3", true);
	}
@Test(groups ="smokegrp")
	public void Smoke2()
	{
		Reporter.log("smoketest2", true);
	}
@Test(groups ="systemgrp")
	public void System2()
	{
		Reporter.log("systemtest2", true);
	}
@Test(groups ="integrationgrp")
public void Integration2()
{
	Reporter.log("integrationtest2", true);
}
@Test(groups ="functionalgrp")
public void Functional2()
{
	Reporter.log("functionaltest2", true);
}

	
}
