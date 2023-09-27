package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShapeAreaTest {

	private ShapeArea shapeArea;
	
	@Before
	public void setup() {
		shapeArea = new ShapeArea();
	}
	
	@Test
	public void test1() {
		assertEquals(1, shapeArea.solution(1));
	}
	
	@Test
	public void test2() {
		assertEquals(13, shapeArea.solution(3));
	}
	
	@Test
	public void test3() {
		assertEquals(41, shapeArea.solution(5));
	}
}
