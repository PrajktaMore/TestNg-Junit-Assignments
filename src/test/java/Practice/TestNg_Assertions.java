package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg_Assertions {
  
	
	
	@Test
  public void test1() {
		Assert.assertEquals(13, 12);  //Hard Assert
	  }
	
	
	@Test	//message will print if assertion fails
	public void test2()
	{
		System.out.println("Test 2 started");
		Assert.assertEquals(13, 12, "Months in year count does not match"); //Hard Assert
		System.out.println("Test 2 completed");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test 3 started");
		Assert.assertEquals("Hello", "Hello", "Words in string does not match");  //Hard Assert
		System.out.println("Test 3 completed");
	}
	
	@Test
	public void test4()
	{
		String mystr="Prajkta More";
		Assert.assertTrue(mystr.contains("Omkar"), "String does not contain"); //Hard Assert
	}
	
	@Test
	public void test5()
	{
		Assert.assertTrue(false); //Hard Assert
	}
	
	@Test
	public void test6()
	{
		SoftAssert softAssert= new SoftAssert();
	System.out.println("Validate Home Page");
	softAssert.assertEquals(true, false, "home page title is missing");
	System.out.println("create a deal");
	softAssert.assertEquals(true, false, "not able to create a deal");
	
	softAssert.assertAll(); //Important to give this immediately in soft assert class even for 1 assert statement
	}
	
}
