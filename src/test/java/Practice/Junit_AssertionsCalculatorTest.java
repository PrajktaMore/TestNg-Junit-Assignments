package Practice;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_AssertionsCalculatorTest {
	
	Calculator cal=new Calculator();
    @BeforeClass
    
    public static void setupBeforeClass() throws Exception{
    }
    @AfterClass
    
    public static void tearDownAfterClass() throws Exception{
    }
    
	@Test
	public void t1() {
		assertEquals(cal.add1(2,2),4);
	}
		
	@Test
	public void t2() {
	assertNotEquals(cal.add1(2,2),5);
	}
	
	@Test
	public void t3() {
		assertNotNull(cal.add1(2, 2));
	}
	
	@Test
	public void t4() {
	  assertNull(cal.add1(2, 2));
	}
	
	@Test
	public void t5() {
		assertSame(cal.add1(2,2),4);	
	  }
	
    @Test
	public void t6() {
		assertNotSame(cal.sub1(2,2),0);
		
	} 

}
