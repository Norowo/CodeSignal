package dad.codesignal;

import static org.junit.Assert.assertEquals;

public class MakeArrayConsecutive2Test {
	
	private MakeArrayConsecutive2 makeArrayConsecutive2;
	
	public void setup() {
		makeArrayConsecutive2 = new MakeArrayConsecutive2();
	}
	
	public void test1() {
		int [] array = {6, 2, 3, 8};
		assertEquals(3, makeArrayConsecutive2.solution(array));
	}
	
	public void test2() {
		int [] array = {0, 3};
		assertEquals(2, makeArrayConsecutive2.solution(array));
	}

	
	public void test3() {
		int [] array = {5, 4, 6};
		assertEquals(0, makeArrayConsecutive2.solution(array));
	}


}
