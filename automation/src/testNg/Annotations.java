package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class Annotations
{
	@BeforeSuite
public void a()
{
	Reporter.log("this is before suite ", true);
}@BeforeTest
public void b()
{
	Reporter.log("this is before test ", true);
}@BeforeClass
public void c()
{
	Reporter.log("this is before class ", true);
}@BeforeMethod
public void d()
{
	Reporter.log("this is before method ", true);
}@AfterMethod
public void e()
{
	Reporter.log("this is after method ", true);
}
@AfterClass
public void f()
{
	Reporter.log("this is after class ", true);
}@AfterTest
public void g()
{
	Reporter.log("this is after test ", true);
}@AfterSuite
 public void h()
{
	Reporter.log("this is after suite ", true);
}

	
}
