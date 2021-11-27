package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgSoftAssertion {
	@Test
	public void test1()
	{
		SoftAssert sa= new SoftAssert();

		System.out.println("Soft assert another method");
		sa.assertEquals(true, false, "parameters passed are not equals");
		
		sa.assertNotEquals(true, false, "parameters passed are equals");
		
		sa.assertTrue(false,"parameter is false");
		
		sa.assertFalse(true, "parameter passed is true");
		
		sa.assertNull(null, "Parameter passed is not null");
		
		sa.assertNotNull("p", "parameter passed is null");
		
		sa.assertAll(); //without this test case will pass even if assertion fails
	}
	
}
