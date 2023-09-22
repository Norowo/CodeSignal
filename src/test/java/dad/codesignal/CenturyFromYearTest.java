package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CenturyFromYearTest {
	
	private CenturyFromYear centuryFromYear;
	
	@Before
	public void setup() {
		centuryFromYear = new CenturyFromYear();
	}
	
	@Test
	public void test1() {
		int result = centuryFromYear.solution(1500);
		assertEquals(15, result);
	}
	
	@Test
	public void test2() {
		assertEquals(16, centuryFromYear.solution(1501));
	}
	
	@Test
	public void test3() {
		assertEquals(0, centuryFromYear.solution(0));
	}

	

}
