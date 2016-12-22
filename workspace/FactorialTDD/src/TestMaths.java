import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMaths {
	Maths m;

	@Before
	public void setUp() throws Exception {
		m = new Maths();
	}
	
	@Test
	public void testForZeroSystemReturnOne(){
		assertEquals(1, m.Factrial(0));
	}
	
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void testForNegativeSystemReturnException(){
		m.Factrial(-1);
	}
	
	@Test
	public void testForPositive(){
		int num = 4;
		assertTrue(m.Factrial(num)>num);
	}
	
	@Test
	public void testForOneSystemReturnOne(){
		assertEquals(1,m.Factrial(1));
	}

}
