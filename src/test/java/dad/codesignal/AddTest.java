package dad.codesignal;

import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddTest {

	private Add add;
	
	@Before
	public void setup() {
		add = new Add();
	}
	
	@Test
	public void test1() {
		int result = add.solution(1, 2);
		assertEquals(3, result);
	}
	
	@Test
	public void test2() {
		assertEquals(1000, add.solution(0, 1000));
	}
	
	@Test
	public void test3() {
		assertEquals(-37, add.solution(2, -39));
	}
	
	@Test
	public void test4() {
		assertEquals(-14, add.solution(-5, -9));
	}
	
}
