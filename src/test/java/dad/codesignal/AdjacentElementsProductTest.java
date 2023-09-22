package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdjacentElementsProductTest {
	
	private AdjacentElementsProduct adjacentElementsProduct;
	
	@Before
	public void setup() {
		adjacentElementsProduct = new AdjacentElementsProduct();
	}

	@Test
	public void test1() {
		int [] array = {2, 3, 6, -3, 3, 7};
		assertEquals(21, adjacentElementsProduct.solution(array));
	}
	
	@Test
	public void test2() {
		int [] array = {10, 9, 8, 7, 6, 5};
		assertEquals(90, adjacentElementsProduct.solution(array));
	}
}
