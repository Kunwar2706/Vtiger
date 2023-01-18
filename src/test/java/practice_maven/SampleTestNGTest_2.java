package practice_maven;

import org.testng.annotations.Test;

public class SampleTestNGTest_2 {

		@Test(groups="regression")
		public void simple3()
		{
			System.out.println("---Regrassion executed successfully---");
		}
		@Test(groups= {"regression"})
		public void simple4()
		{
			System.out.println("----Regrassion executed successfully----");
	
		}
		
}
