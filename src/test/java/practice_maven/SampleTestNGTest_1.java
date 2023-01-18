package practice_maven;

import org.testng.annotations.Test;

public class SampleTestNGTest_1 {
	@Test(groups="smoke")
	public void simple1()
	{
		System.out.println("---Smoke executed successfully---");
	}
	@Test(groups= {"smoke"})
	public void simple2()
	{
		System.out.println("----Smoke executed successfully------");
	}

}
