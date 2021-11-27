package Practice;


import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNgHardAssertionTypes {
  
	
	@Test
  public void test1() {
		System.out.println("test 1 started");
		Assert.assertFalse(true, "passed boolean is true");
		System.out.println("test 1 completed");//This will not get executed as assertion is failed 
		
	}
	
		@Test
	  public void test2() {
		
		Assert.assertTrue(true, "passed boolean is false");
		}
	

		@Test
	  public void test3() {
		
		Assert.assertEquals("prajkta", "prajakta", "parameters are not equal");
		}

		@Test
	  public void test4() {
		
		Assert.assertNotEquals("prajkta", "prajkta", "parameters are equal");
		}

		@Test
	  public void test5() {
		Assert.assertNotNull("A", "parameter passed is null");
  }

		@Test
		  public void test6() {
			Assert.assertNull("P", "parameter passed is not null");
	  }

}
